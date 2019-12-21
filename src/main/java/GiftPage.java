import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftPage extends BaseActions{
    String currentUrlGifts;
    String currentPageTitleGifts;

    public GiftPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void verifyGiftsTitleUrl(){
        // Verify 'GIFTS' page Title
        System.out.println("--- Verifying 'GIFTS' page Title ---");
        currentPageTitleGifts = driver.getTitle();
        System.out.println("Current PageTitle of 'GIFTS' page is:  '" + currentPageTitleGifts + "'");
        System.out.println("Expected PageTitle of 'GIFTS' page is: '" + Data.expectedPageTitleGifts + "'");
        if (currentPageTitleGifts.equals(Data.expectedPageTitleMedia)){
            System.out.println("Current  PageTitle of 'GIFTS' page is equal to expected PageTitle of 'GIFTS' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'GIFTS' page is NOT equal to expected PageTitle of 'GIFTS' page.");
        }
        Assert.assertEquals(currentPageTitleGifts, Data.expectedPageTitleGifts);
        // Verifying 'GIFTS' page current url
        System.out.println("--- Verifying 'GIFTS' page current url ---");
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println("Current Url of 'GIFTS' page is:  '" + currentUrlGifts + "'");
        System.out.println("Expected Url of 'GIFTS' page is: '" + Data.expectedUrlGifts + "'");
        if (currentUrlGifts.equals(Data.expectedUrlGifts)){
            System.out.println("Current Url of 'GIFTS' page is equal to expected url of 'GIFTS' page.");
        }
        else {
            System.out.println("Current Url of 'GIFTS' page is NOT equal to expected url of 'GIFTS' page.");
        }
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);

//        WebElement bestsellerBlock = driver.findElement(Locators.BESTSELLER_BLOCK); //To go in another method
//        Boolean confirmBestsellerBlock = bestsellerBlock.isDisplayed();

    }

}
