import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;

public class HowWeWorkPage extends BaseActions{
    String currentUrlHowWeWork;
    String currentPageTitleHowWeWork;

    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void verificationHowWeWorkPage(){
        // Verifying 'HOW WE WORK' page Title
        System.out.println("--- Verifying 'HOW WE WORK' page Title ---");
        currentPageTitleHowWeWork = driver.getTitle();
        System.out.println("Current PageTitle of 'HowWeWork' page is:  '" + currentPageTitleHowWeWork + "'");
        System.out.println("Expected PageTitle of 'HowWeWork' page is: '" + Data.expectedPageTitleHowWeWork + "'");
        if (currentPageTitleHowWeWork.equals(Data.expectedPageTitleHowWeWork)){
            System.out.println("Current  PageTitle of 'HowWeWork' page is equal to expected PageTitle of 'HowWeWork' page");
        }
        else {
            System.out.println("Current  PageTitle of 'HowWeWork' page is NOT equal to expected PageTitle of 'HowWeWork' page");
        }
        Assert.assertEquals(currentPageTitleHowWeWork, Data.expectedPageTitleHowWeWork);
        // Verifying 'HOW WE WORK' page current url
        System.out.println("--- Verifying 'HowWeWork' page current url ---");
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println("Current Url of 'HowWeWork' page is:  '" + currentUrlHowWeWork + "'");
        System.out.println("Expected Url of 'HowWeWork' page is: '" + Data.expectedUrlHowWeWork + "'");
        if (currentUrlHowWeWork.equals(Data.expectedUrlHowWeWork)){
            System.out.println("Current Url of 'HowWeWork' page is equal to expected url of 'HowWeWork' page");
        }
        else {
            System.out.println("Current Url of 'HowWeWork' page is NOT equal to expected url of 'HowWeWork' page");
        }
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);
    }
    public void checkInnerMenuLinks() {
        List<WebElement> links = driver.findElements(By.cssSelector("li>div.info-menu-inner>a"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
        links = driver.findElements(By.cssSelector("li>div.info-menu-inner>a"));
        }
    }



}
