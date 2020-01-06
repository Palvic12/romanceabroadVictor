import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GiftPage extends BaseActions{
    String currentUrlGifts;
    String currentPageTitleGifts;
    String reducedPrice;

    public GiftPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public String verifyTitleGifts(){
        // Verify 'GIFTS' page Title
        System.out.println("--- Verifying 'GIFTS' page Title ---");
        currentPageTitleGifts = driver.getTitle();
        System.out.println("Current PageTitle of 'GIFTS' page is:  '" + currentPageTitleGifts + "'");
        System.out.println("Expected PageTitle of 'GIFTS' page is: '" + Data.expectedPageTitleGifts + "'");
        if (currentPageTitleGifts.equals(Data.expectedPageTitleGifts)){
            System.out.println("Current  PageTitle of 'GIFTS' page is equal to expected PageTitle of 'GIFTS' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'GIFTS' page is NOT equal to expected PageTitle of 'GIFTS' page.");
        }
        return currentPageTitleGifts;
    }
    public String verifyUrlGifts(){
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
        return currentUrlGifts;
    }

    @Test
    public void testLinksOnGiftsPage(){
        System.out.println("--- Testing links on 'GIFTS' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public void checkBestsellersLinks(){
        System.out.println("--- Clicking estsellers' links on 'GIFTS' page ---");
        List<WebElement> links = driver.findElements(Locators.BESTSELLERS_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);
            links.get(i).click();
            if (info.contains("Flower basket")){
                reducedPrice = driver.findElement(By.xpath("//div[@class='bold view-price fs18']")).getText();
                System.out.println("Flower baskets's reduced price is: " + reducedPrice);
                Assert.assertEquals(reducedPrice,Data.expectedFlowerBasketReducedPrice);
            }
            if (info.contains("Spa")){
                reducedPrice = driver.findElement(By.xpath("//div[@class='bold view-price fs18']")).getText();
                System.out.println("Spa's reduced price is: " + reducedPrice);
                Assert.assertEquals(reducedPrice,Data.expectedSpaReducedPrice);
            }
            if (info.contains("Teddy bear")){
                reducedPrice = driver.findElement(By.xpath("//div[@class='bold view-price fs18']")).getText();
                System.out.println("Teddy bear's reduced price is: " + reducedPrice);
                Assert.assertEquals(reducedPrice,Data.expectedTeddyBearReducedPrice);
            }
            if (info.contains("TOURS TO UKRAINE")){
                reducedPrice = driver.findElement(By.xpath("//div[@class='bold view-price fs18']")).getText();
                System.out.println("TOURS TO UKRAINE's reduced price is: " + reducedPrice);
                Assert.assertEquals(reducedPrice,Data.expectedToursToUkraineReducedPrice);
            }
            driver.get(Data.GIFTS_PAGE);
            links = driver.findElements(Locators.BESTSELLERS_LINKS);
        }
    }

}
