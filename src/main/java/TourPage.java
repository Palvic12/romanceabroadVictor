import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class TourPage extends BaseActions{
    String currentUrlTour;
    String currentPageTitleTour;
    String info;

    public TourPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public String verifyTitleTourToUkraine(){
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
        return currentPageTitleTour;
    }
    public String verifyUrlTourToUkraine(){
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
        return currentUrlTour;
    }

    @Test
    public void testLinksOnTourToUkrainePage(){
        System.out.println("--- Testing links on 'TOUR TO UKRAINE' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public void verifyRelatedItems(){
        System.out.println("--- Verifying 'RELATED ITEMS' links ---");
        scrollToBottomOfPage();
        javaWaitSec(1);
        List<WebElement> links = driver.findElements(Locators.RELATED_ITEMS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            javaWaitSec(1);
            System.out.println(driver.findElement(By.xpath("//h1")).getText());
            driver.get(Data.TOUR_TO_UKRAINE_PAGE);
            links = driver.findElements(Locators.RELATED_ITEMS);
        }
    }

}
