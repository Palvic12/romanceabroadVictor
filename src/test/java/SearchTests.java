import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{
    String currentLinkTextSearch;
    String currentPageTitleSearch;
    String currentUrlSearch;



    @Test
    public void testSearchPage(){

        System.out.println("             *** testSearchPage ***");

        /*
        // PLAN :
         // Verify 'PRETTY WOMEN' page LinkText
         // Click "PRETTY WOMEN" link
         // Verify 'PRETTY WOMEN' page Title
         // Verify current url
         // Enter minimum age
         // Enter maximum age
         // Click SEARCH button
         // Choose criteria of sorting
         // Click on 'ArrowUp' button
         // Click on 'ArrowDown' button
         // Click on 'List View' link
         // Click on 'Gallery View' link
         // Click on next page arrow
         // Click on previous page arrow
         // Click on bottom last page arrow
         // Click on bottom first page arrow
         // Click on bottom next page arrow
         // Click on bottom previous page arrow
         */
        // Verify 'SEARCH' page LinkText
        System.out.println("--- Verifying 'SEARCH' page LinkText ---");
        WebElement searchLink = driver.findElement(Locators.LINK_SEARCH); // "PRETTY WOMEN"
        currentLinkTextSearch = searchLink.getText();
        System.out.println("Current LinkText of 'Search' page is:  " + currentLinkTextSearch);
        System.out.println("Expected LinkText of 'Search' page is: " + Data.expectedLinkTextSearch);
        if (currentLinkTextSearch.equals(Data.expectedLinkTextSearch)){
            System.out.println("Current LinkText of 'Search' page is equal to expected LinkText of 'Search' page");
        }
        else {
            System.out.println("Current LinkText of 'Search' page is NOT equal to expected LinkText of 'Search' page");
        }
        Assert.assertEquals(currentLinkTextSearch, Data.expectedLinkTextSearch);
        // Click "PRETTY WOMEN" link
        searchLink.click();
//        clickLeftMouse(searchLink); // It is not working !!!!!!!!
        // Verify 'SEARCH' page Title
        System.out.println("--- Verifying 'SEARCH' page Title ---");
        currentPageTitleSearch = driver.getTitle();
        System.out.println("Current PageTitle of 'Search' page is:  " + currentPageTitleSearch);
        System.out.println("Expected PageTitle of 'Search' page is: " + Data.expectedPageTitleSearch);
        if (currentPageTitleSearch.equals(Data.expectedPageTitleSearch)){
            System.out.println("Current  PageTitle of 'Search' page is equal to expected PageTitle of 'Search' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'Search' page is NOT equal to expected PageTitle of 'Search' page.");
        }
        Assert.assertEquals(currentPageTitleSearch, Data.expectedPageTitleSearch);

        // Verifying 'SEARCH' page current url
        System.out.println("--- Verifying 'Search' page current url ---");
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println("Current Url of 'Search' page is:  " + currentUrlSearch);
        System.out.println("Expected Url of 'Search' page is: " + Data.expectedUrlSearch);
        if (currentUrlSearch.equals(Data.expectedUrlSearch)){
            System.out.println("Current Url of 'Search' page is equal to expected url of 'Search' page.");
        }
        else {
            System.out.println("Current Url of 'Search' page is NOT equal to expected url of 'Search' page.");
        }
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        timeWait(3000);
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Views");
        List<WebElement> listSearch= select.getOptions();
        System.out.println("Elements of drop-down list: " + listSearch.toString());
        for (WebElement criteria:listSearch)
        {
            System.out.println("\t" + criteria.getText());
        }*/
        // Enter minimum age
        WebElement dropDownMinAge = driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN); // Range: 18 - 80
        selectByValue(dropDownMinAge, "19");
        // Enter maximum age
        WebElement dropDownMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX); // Range: 18 - 80
        selectByValue(dropDownMaxAge, "79");
        // Click 'Search' button
        clickMainSearchButton();
        // Choose criteria of sorting
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        selectByText(dropDownListSortBy, "Name"); // Text: "Name"  "View"  "Registration date"
                                                       // Value: "name"  "views_count"  "date_created"
        timeWait(3000);
        // Click on 'ArrowUp' button
        WebElement arrowUpSorter = driver.findElement(Locators.SORTER_ARROW_UP);
        wait.until(ExpectedConditions.elementToBeClickable(arrowUpSorter));
        arrowUpSorter.click();
        timeWait(3000); // OK!!!
        // Click on 'ArrowDown' button

        WebElement arrowDownSorter = driver.findElement(Locators.SORTER_ARROW_DOWN);
//        wait.until(ExpectedConditions.elementToBeClickable(arrowDownSorter)); // NOT working!!!
//        wait.until(ExpectedConditions.visibilityOf(arrowDownSorter)); // NOT working!!!
        arrowDownSorter.click();
//        timeWait(3000);
        // Click on 'List View' link
        WebElement listViewLink = driver.findElement(Locators.LINK_LIST_VIEW);
        wait.until(ExpectedConditions.elementToBeClickable(listViewLink));
        listViewLink.click();
//        timeWait(3000);
        // Click on 'Gallery View' link
        WebElement galleryViewLink = driver.findElement(Locators.LINK_GALLERY_VIEW);
        wait.until(ExpectedConditions.elementToBeClickable(galleryViewLink));
        galleryViewLink.click();
//        timeWait(3000);
        // Click on next page arrow
        WebElement nextPageSortBlock = driver.findElement(Locators.NEXT_PAGE_SORT_BLOCK);
        wait.until(ExpectedConditions.elementToBeClickable(nextPageSortBlock));
        nextPageSortBlock.click();
//        timeWait(3000); // OK!!!
        // Click on previous page arrow
        WebElement previousPageSortBlock = driver.findElement(Locators.PREVIOUS_PAGE_SORT_BLOCK);
        wait.until(ExpectedConditions.elementToBeClickable(previousPageSortBlock)); // OK!!!
        previousPageSortBlock.click();
        timeWait(3000); // OK
        // Click on bottom last page arrow
        WebElement lastPagePagination = driver.findElement(Locators.LAST_PAGE_PAGINATION);
//        wait.until(ExpectedConditions.elementToBeClickable(lastPagePagination)); // NOT working!!!
//        wait.until(ExpectedConditions.visibilityOf(lastPagePagination)); // NOT working!!!
//        scrollIntoView(lastPagePagination); // The element remains out of view
//        scrollByPixel(0, 1000); //does not work
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        lastPagePagination.click();
        timeWait(3000); // OK!!!
        // Click on bottom first page arrow
        WebElement firstPagePagination = driver.findElement(Locators.FIRST_PAGE_PAGINATION);
//        wait.until(ExpectedConditions.elementToBeClickable(firstPagePagination)); // NOT working!!!
        firstPagePagination.click();
        timeWait(3000); // OK!!!
        // Click on bottom next page arrow
        WebElement nextPagePagination = driver.findElement(Locators.NEXT_PAGE_PAGINATION);
//        wait.until(ExpectedConditions.elementToBeClickable(nextPagePagination)); // NOT working!!!
        nextPagePagination.click();
        timeWait(3000); //OK !!!
        // Click on bottom previous page arrow
        WebElement previousPagePagination = driver.findElement(Locators.PREVIOUS_PAGE_PAGINATION);
//        wait.until(ExpectedConditions.elementToBeClickable(previousPagePagination)); // NOT working !!!
        previousPagePagination.click();

    }

    // *** SearchTestsMETHODS ***

//    Select Min_Age



//    ClickSearchButton
    public void clickMainSearchButton(){
        driver.findElement(Locators.BUTTON_MAIN_SEARCH).click();
    }

//    Get Drop Down List

    public void clickLeftMouse(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }












}
