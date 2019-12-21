import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MediaPage extends BaseActions{
    String currentUrlMedia;
    String currentPageTitleMedia;

    public MediaPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void checkHeartRomanceAbroadHeader(){

    }

    public void verifyPhotosTitleUrl(){
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
        Assert.assertEquals(currentPageTitleMedia, Data.expectedPageTitleMedia);
        // Verifying 'SEARCH' page current url
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
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }

    public void clickAllLink(){
        timeWait(2000);
        WebElement linkAll = driver.findElement(Locators.LINK_ALL);
        linkAll.click();

    }
    public void clickPhotoLink(){
        timeWait(2000);
        WebElement linkPhoto = driver.findElement(Locators.LINK_PHOTO);
        linkPhoto.click();
    }
    public void clickVideoLink(){
        timeWait(2000);
        WebElement linkVideo = driver.findElement(Locators.LINK_VIDEO);
        linkVideo.click();
    }
    public void clickAlbumLink(){
        timeWait(2000);
        WebElement linkAlbums = driver.findElement(Locators.LINK_ALBUMS);
        linkAlbums.click();
    }
    public void photoSortingCriteria(){
        // Choose criteria of sorting
        WebElement listPhotosSorter = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
        timeWait(1000);
        selectByText(listPhotosSorter, "Views count"); // Text: "Date"  "Views count" "Comments count"
        timeWait(1000);
        selectByText(listPhotosSorter, "Comments count");
        timeWait(1000);
        selectByText(listPhotosSorter, "Date");

    }
    public void sortAlbumsPortrait(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        timeWait(2000);
        selectByValue(listAlbumsSorter, "1"); // Value: "1" "2" "3"
    }
    public void sortAlbumsAnimals(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        timeWait(2000);
        selectByValue(listAlbumsSorter, "2");
    }
    public void sortAlbumsTravel(){
        WebElement listAlbumsSorter = driver.findElement(Locators.DROP_DOWN_LIST_ALBUMS_SORTER);
        timeWait(2000);
        selectByValue(listAlbumsSorter, "3");
    }

    public void photoSortASC(){
        // Click on 'ArrowUp' button
        timeWait(2000);
        WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
        arrowUpSorter.click();
    }
    public void photoSortDESC(){
        // Click on 'ArrowDown' button
        timeWait(2000);
        WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
        arrowDownSorter.click();
    }

}
