import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    String currentLinkTextTour;
    String currentUrlTour;
    String currentPageTitleTour;



    @Test
    public  void testTourPage(){
        System.out.println("             *** test'TOUR TO UKRAINE' Page ***");
        // Verify 'TOUR TO UKRAINE' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page LinkText ---");
        WebElement tourLink = driver.findElement(Locators.LINK_TOUR);
        currentLinkTextTour = tourLink.getText();
        System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is:  " + currentLinkTextTour);
        System.out.println("Expected LinkText of 'TOUR TO UKRAINE' page is: " + Data.expectedLinkTextTour);
        if (currentLinkTextTour.equals(Data.expectedLinkTextTour)){
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is equal to expected LinkText of 'TOUR TO UKRAINE' page");
        }
        else {
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is NOT equal to expected LinkText of 'TOUR TO UKRAINE' page");
        }
        Assert.assertEquals(currentLinkTextTour, Data.expectedLinkTextTour);
        // Click "TOUR TO UKRAINE" link
        tourLink.click();//
        // Verify 'TOUR TO UKRAINE' page Title
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page Title ---");
        currentPageTitleTour = driver.getTitle();
        System.out.println("Current PageTitle of 'TOUR TO UKRAINE' page is:  " + currentPageTitleTour);
        System.out.println("Expected PageTitle of 'TOUR TO UKRAINE' page is: " + Data.expectedPageTitleTour);
        if (currentPageTitleTour.equals(Data.expectedPageTitleTour)){
            System.out.println("Current  PageTitle of 'TOUR TO UKRAINE' page is equal to expected PageTitle of 'TOUR TO UKRAINE' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'TOUR TO UKRAINE' page is NOT equal to expected PageTitle of 'TOUR TO UKRAINE' page.");
        }
        Assert.assertEquals(currentPageTitleTour, Data.expectedPageTitleTour);

        // Verifying 'TOUR TO UKRAINE' page current url
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page current url ---");
        currentUrlTour = driver.getCurrentUrl();
        System.out.println("Current Url of 'TOUR TO UKRAINE' page is:  " + currentUrlTour);
        System.out.println("Expected Url of 'TOUR TO UKRAINE' page is: " + Data.expectedUrlTour);
        if (currentUrlTour.equals(Data.expectedUrlTour)){
            System.out.println("Current Url of 'TOUR TO UKRAINE' page is equal to expected url of 'TOUR TO UKRAINE' page.");
        }
        else {
            System.out.println("Current Url of 'TOUR TO UKRAINE' page is NOT equal to expected url of 'TOUR TO UKRAINE' page.");
        }
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);

    }
}
