import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.URL;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com";


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(mainUrl);
    }


    @AfterMethod
    public void afterActions(){
//        driver.quit();
    }

    //***************** METHODS ********************

    public void timeWait(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollByPixel(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(x,y)");
    }

    public void selectByText(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void verifyLinkActive(String linkUrl) {
        try
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(linkUrl+" - " + httpURLConnect.getResponseMessage());
            }
            else
            {
                System.out.println(linkUrl+" - is Down");
            }
        } catch (Exception e)
        {
        }
    }






}
