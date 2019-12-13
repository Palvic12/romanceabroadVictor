import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String currentLinkTextMedia;
    String currentUrlMedia;
    String currentPageTitleMedia;



    @Test
    public  void testMedia(){
        System.out.println("             *** testFotosPage ***");
        // Verify 'PHOTOS' page LinkText
        System.out.println("--- Verifying 'PHOTOS' page LinkText ---");
        WebElement photosLink = driver.findElement(Locators.LINK_MEDIA);
        currentLinkTextMedia = photosLink.getText();
        System.out.println("Current LinkText of 'PHOTOS' page is:  " + currentLinkTextMedia);
        System.out.println("Expected LinkText of 'PHOTOS' page is: " + Data.expectedLinkTextMedia);
        if (currentLinkTextMedia.equals(Data.expectedLinkTextMedia)){
            System.out.println("Current LinkText of 'PHOTOS' page is equal to expected LinkText of 'PHOTOS' page");
        }
        else {
            System.out.println("Current LinkText of 'PHOTOS' page is NOT equal to expected LinkText of 'PHOTOS' page");
        }
        Assert.assertEquals(currentLinkTextMedia, Data.expectedLinkTextMedia);
        // Click "PHOTOS" link
        photosLink.click();//
        // Verify 'PHOTOS' page Title
        System.out.println("--- Verifying 'PHOTOS' page Title ---");
        currentPageTitleMedia = driver.getTitle();
        System.out.println("Current PageTitle of 'PHOTOS' page is:  " + currentPageTitleMedia);
        System.out.println("Expected PageTitle of 'PHOTOS' page is: " + Data.expectedPageTitleMedia);
        if (currentPageTitleMedia.equals(Data.expectedPageTitleMedia)){
            System.out.println("Current  PageTitle of 'PHOTOS' page is equal to expected PageTitle of 'PHOTOS' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'PHOTOS' page is NOT equal to expected PageTitle of 'PHOTOS' page.");
        }
        Assert.assertEquals(currentPageTitleMedia, Data.expectedPageTitleMedia);

        // Verifying 'SEARCH' page current url
        System.out.println("--- Verifying 'PHOTOS' page current url ---");
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println("Current Url of 'PHOTOS' page is:  " + currentUrlMedia);
        System.out.println("Expected Url of 'PHOTOS' page is: " + Data.expectedUrlMedia);
        if (currentUrlMedia.equals(Data.expectedUrlMedia)){
            System.out.println("Current Url of 'PHOTOS' page is equal to expected url of 'PHOTOS' page.");
        }
        else {
            System.out.println("Current Url of 'PHOTOS' page is NOT equal to expected url of 'PHOTOS' page.");
        }
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
        driver.findElement(Locators.LINK_ALL).click();
        driver.findElement(Locators.LINK_PHOTO).click();
        driver.findElement(Locators.LINK_VIDEO).click();
        driver.findElement(Locators.LINK_ALBUMS).click();
    }
}
