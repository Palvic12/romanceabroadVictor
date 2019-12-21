import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourPage extends BaseActions{
    String currentUrlTour;
    String currentPageTitleTour;

    public TourPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void verifyTourToUkraineTitleUrl(){
        // Verify 'TOUR TO UKRAINE' page Title
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page Title ---");
        currentPageTitleTour = driver.getTitle();
        System.out.println("Current PageTitle of 'TOUR TO UKRAINE' page is: '" + currentPageTitleTour + "'");
        System.out.println("Expected PageTitle of 'TOUR TO UKRAINE' page is: '" + Data.expectedPageTitleTour + "'");
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
        System.out.println("Current Url of 'TOUR TO UKRAINE' page is: '" + currentUrlTour + "'");
        System.out.println("Expected Url of 'TOUR TO UKRAINE' page is: '" + Data.expectedUrlTour + "'");
        if (currentUrlTour.equals(Data.expectedUrlTour)){
            System.out.println("Current Url of 'TOUR TO UKRAINE' page is equal to expected url of 'TOUR TO UKRAINE' page.");
        }
        else {
            System.out.println("Current Url of 'TOUR TO UKRAINE' page is NOT equal to expected url of 'TOUR TO UKRAINE' page.");
        }
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }

}
