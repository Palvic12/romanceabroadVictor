import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {

    String currentLinkTextGifts;
    String currentUrlGifts;
    String currentPageTitleGifts;




    @Test
    public  void testGiftPage(){
        System.out.println("             *** testGiftsPage ***");
        // Verify 'GIFTS' page LinkText
        System.out.println("--- Verifying 'GIFTS' page LinkText ---");
        WebElement giftsLink = driver.findElement(Locators.LINK_GIFT);
        currentLinkTextGifts = giftsLink.getText();
        System.out.println("Current LinkText of 'GIFTS' page is:  " + currentLinkTextGifts);
        System.out.println("Expected LinkText of 'GIFTS' page is: " + Data.expectedLinkTextGifts);
        if (currentLinkTextGifts.equals(Data.expectedLinkTextGifts)){
            System.out.println("Current LinkText of 'GIFTS' page is equal to expected LinkText of 'GIFTS' page");
        }
        else {
            System.out.println("Current LinkText of 'GIFTS' page is NOT equal to expected LinkText of 'GIFTS' page");
        }
        Assert.assertEquals(currentLinkTextGifts, Data.expectedLinkTextGifts);
        // Click "GIFTS" link
        giftsLink.click();//
        // Verify 'GIFTS' page Title
        System.out.println("--- Verifying 'GIFTS' page Title ---");
        currentPageTitleGifts = driver.getTitle();
        System.out.println("Current PageTitle of 'GIFTS' page is:  " + currentPageTitleGifts);
        System.out.println("Expected PageTitle of 'GIFTS' page is: " + Data.expectedPageTitleGifts);
        if (currentPageTitleGifts.equals(Data.expectedPageTitleMedia)){
            System.out.println("Current  PageTitle of 'GIFTS' page is equal to expected PageTitle of 'GIFTS' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'GIFTS' page is NOT equal to expected PageTitle of 'GIFTS' page.");
        }
        Assert.assertEquals(currentPageTitleGifts, Data.expectedPageTitleGifts);

        // Verifying 'SEARCH' page current url
        System.out.println("--- Verifying 'GIFTS' page current url ---");
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println("Current Url of 'GIFTS' page is:  " + currentUrlGifts);
        System.out.println("Expected Url of 'GIFTS' page is: " + Data.expectedUrlGifts);
        if (currentUrlGifts.equals(Data.expectedUrlGifts)){
            System.out.println("Current Url of 'GIFTS' page is equal to expected url of 'GIFTS' page.");
        }
        else {
            System.out.println("Current Url of 'GIFTS' page is NOT equal to expected url of 'GIFTS' page.");
        }
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);

        WebElement bestsellerBlock = driver.findElement(Locators.BESTSELLER_BLOCK);
        Boolean confirmBestsellerBlock = bestsellerBlock.isDisplayed();



    }



}
