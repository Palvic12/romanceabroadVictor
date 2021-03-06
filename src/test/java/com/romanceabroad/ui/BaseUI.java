package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    HowWeWorkPage howWeWorkPage;
    SearchPage searchPage;
    MediaPage mediaPage;
    GiftPage giftPage;
    TourPage tourPage;
    BlogPage blogPage;
    SignInPage signInPage;
    TestPage testPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(groups = {"user", "admin", "ie"}, alwaysRun = true)
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method){
        // Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
        }
        // Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
            // Set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            // Create chrome instance
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();
        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        }

        wait = new WebDriverWait(driver, 20);
        mainPage= new MainPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        tourPage = new TourPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        testPage = new TestPage(driver, wait);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Data.MAIN_URL);
    }

    @AfterMethod
    public void afterActions(ITestResult testResult){
        if (testResult.getStatus()== ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
//        driver.quit();
    }

}
