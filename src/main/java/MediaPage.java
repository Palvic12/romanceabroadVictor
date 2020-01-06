import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaPage extends BaseActions{
    String currentUrlMedia;
    String currentPageTitleMedia;

    public MediaPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public String verifyTitlePhotos(){
        // Verify 'PHOTOS' page Title
        System.out.println("--- Verifying 'PHOTOS' page Title ---");
        currentPageTitleMedia = driver.getTitle();
        System.out.println("Current PageTitle of 'PHOTOS' page is: '" + currentPageTitleMedia + "'");
        System.out.println("Expected PageTitle of 'PHOTOS' page is: '" + Data.expectedPageTitleMedia + "'");
        if (currentPageTitleMedia.equals(Data.expectedPageTitleMedia)){
            System.out.println("Current  PageTitle of 'PHOTOS' page is equal to expected PageTitle of 'PHOTOS' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'PHOTOS' page is NOT equal to expected PageTitle of 'PHOTOS' page.");
        }
        return currentPageTitleMedia;
    }
    public String verifyUrlPhotos(){
        // Verifying 'PHOTOS' page current url
        System.out.println("--- Verifying 'PHOTOS' page current url ---");
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println("Current Url of 'PHOTOS' page is:  '" + currentUrlMedia + "'");
        System.out.println("Expected Url of 'PHOTOS' page is: '" + Data.expectedUrlMedia + "'");
        if (currentUrlMedia.equals(Data.expectedUrlMedia)){
            System.out.println("Current Url of 'PHOTOS' page is equal to expected url of 'PHOTOS' page.");
        }
        else {
            System.out.println("Current Url of 'PHOTOS' page is NOT equal to expected url of 'PHOTOS' page.");
        }
        return currentUrlMedia;
    }

    public void testLinksOnMediaPage(){
        System.out.println("--- Testing links on 'PHOTOS' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public void clickAllLink(){
        javaWaitSec(2);
        WebElement linkAll = driver.findElement(Locators.LINK_ALL);
        linkAll.click();
    }
    public void clickPhotoLink(){
        javaWaitSec(2);
        WebElement linkPhoto = driver.findElement(Locators.LINK_PHOTO);
        linkPhoto.click();
    }
    public void clickVideoLink(){
        javaWaitSec(2);
        WebElement linkVideo = driver.findElement(Locators.LINK_VIDEO);
        linkVideo.click();
    }
    public void clickAlbumLink(){
        javaWaitSec(2);
        WebElement linkAlbums = driver.findElement(Locators.LINK_ALBUMS);
        linkAlbums.click();
    }
    public void photoSortingCriteria(){
        // Choose criteria of sorting
        WebElement listPhotosSorter = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
        javaWaitSec(1);
        selectByText(listPhotosSorter, "Views count"); // Text: "Date"  "Views count" "Comments count"
        javaWaitSec(1);
        selectByText(listPhotosSorter, "Comments count");
        javaWaitSec(1);
        selectByText(listPhotosSorter, "Date");
    }
    public void sortAlbumsPortrait(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        javaWaitSec(2);
        selectByValue(listAlbumsSorter, "1"); // Value: "1" "2" "3"
    }
    public void sortAlbumsAnimals(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        javaWaitSec(2);
        selectByValue(listAlbumsSorter, "2");
    }
    public void sortAlbumsTravel(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        javaWaitSec(2);
        selectByValue(listAlbumsSorter, "3");
    }

    public void photoSortASC(){
        // Click on 'ArrowUp' button
        javaWaitSec(2);
        WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
        arrowUpSorter.click();
    }
    public void photoSortDESC(){
        // Click on 'ArrowDown' button
        javaWaitSec(2);
        WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
        arrowDownSorter.click();
    }

}
