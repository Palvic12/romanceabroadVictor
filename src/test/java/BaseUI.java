import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com";
    MainPage mainPage;
    HowWeWorkPage howWeWorkPage;
    SearchPage searchPage;
    MediaPage mediaPage;
    GiftPage giftPage;
    TourPage tourPage;
    BlogPage blogPage;
    SignInPage signInPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage= new MainPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        tourPage = new TourPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions(){
//        driver.quit();
    }

}
