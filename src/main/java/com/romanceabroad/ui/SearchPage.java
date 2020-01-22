package com.romanceabroad.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions{
    String currentPageTitleSearch;
    String currentUrlSearch;

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public String verifyTitleSearch(){
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
        return currentPageTitleSearch;
    }

    public String verifyUrlSearch(){
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
        javaWaitSec(3);
        return currentUrlSearch;
    }

    public void testLinksOnSearchPage(){
        System.out.println("--- Testing links on 'Search' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public void selectRandomMinAge(){
        System.out.println("--- Selecting random Min age ---");
        int sizeOfDropDownListSortBy = getSizeDropDownList(Locators.DROP_DOWN_LIST_AGE_MIN);
        System.out.println("Number of items in DropDownList: " + sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i+1 + ". ");
            selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_AGE_MIN, "Min age");
        }
    }

    public void selectRandomMaxAge(){
        System.out.println("--- Selecting random Max age ---");
        int sizeOfDropDownListSortBy = getSizeDropDownList(Locators.DROP_DOWN_LIST_AGE_MAX);
        System.out.println("Number of items in DropDownList: " + sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i+1 + ". ");
            selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_AGE_MAX, "Max age");
        }
    }

    public void selectRandomSortBy(){
        System.out.println("--- Selecting random Sort By ---");
        int sizeOfDropDownListSortBy = getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println("Number of items in DropDownList: " + sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i+1 + ". ");
            selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            javaWaitSec(2);//
        }
    }

    public void selectAge(){
        // Enter minimum age
        WebElement dropDownMinAge = driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN); // Range: 18 - 80
        selectByValue(dropDownMinAge, "19");
        // Enter maximum age
        WebElement dropDownMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX); // Range: 18 - 80
        selectByValue(dropDownMaxAge, "79");
        // Click 'Search' button
        clickMainSearchButton();
    }

    public void sortingCriteria(){
        // Choose criteria of sorting
        ajaxScrollUp();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        // selectByText(dropDownListSortBy, "Name"); // Text: "Name"  "View"  "Registration date"
        selectByValue(dropDownListSortBy, "date_created"); // Value: "name"  "views_count"  "date_created"
    }

    public void sortASC(){
        // Click on 'ArrowUp' button
        javaWaitSec(3);
        WebElement arrowUpSorter = driver.findElement(Locators.SORTER_ARROW_UP);
        arrowUpSorter.click();
    }

    public void sortDESC(){
        // Click on 'ArrowDown' button
        javaWaitSec(3);
        WebElement arrowDownSorter = driver.findElement(Locators.SORTER_ARROW_DOWN);
        arrowDownSorter.click();
    }

    public void clickListViewLink(){
        // Click on 'List View' link
        javaWaitSec(3);
        WebElement listViewLink = driver.findElement(Locators.LINK_LIST_VIEW);
        listViewLink.click();
        System.out.println("listViewLink --> ok");
    }

    public void clickGalleryViewLink(){
        // Click on 'Gallery View' link
        WebElement galleryViewLink = driver.findElement(Locators.LINK_GALLERY_VIEW);
        wait.until(ExpectedConditions.elementToBeClickable(galleryViewLink));
        galleryViewLink.click();
        System.out.println("galleryViewLink --> ok");
    }

    public void clickNextPageSortBlock(){
        // Click on next page arrow
        WebElement nextPageSortBlock = driver.findElement(Locators.NEXT_PAGE_SORT_BLOCK);
        wait.until(ExpectedConditions.elementToBeClickable(nextPageSortBlock));
        nextPageSortBlock.click();
        System.out.println("nextPageSortBlock --> ok");
    }

    public void clickPreviousPageSortBlock(){
        // Click on previous page arrow
        WebElement previousPageSortBlock = driver.findElement(Locators.PREVIOUS_PAGE_SORT_BLOCK);
        wait.until(ExpectedConditions.elementToBeClickable(previousPageSortBlock)); // OK!!!
        previousPageSortBlock.click();
        System.out.println("previousPageSortBlock --> ok");
    }

    public void clickLastPagePagination(){
        // Click on bottom last page arrow
        javaWaitSec(3);
        WebElement lastPagePagination = driver.findElement(Locators.LAST_PAGE_PAGINATION);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        lastPagePagination.click();
        System.out.println("lastPagePagination --> ok");

    }

    public void clickFirstPagePagination(){
        // Click on bottom first page arrow
        javaWaitSec(3);
        WebElement firstPagePagination = driver.findElement(Locators.FIRST_PAGE_PAGINATION);
        firstPagePagination.click();
        System.out.println("FirstPagePagination --> ok");
    }

    public void clickNextPagePagination(){
        // Click on bottom next page arrow
        javaWaitSec(3);
        WebElement nextPagePagination = driver.findElement(Locators.NEXT_PAGE_PAGINATION);
        nextPagePagination.click();
        System.out.println("nextPagePagination --> ok");
    }

    public void clickPreviousPagePagination(){
        // Click on bottom previous page arrow
        javaWaitSec(3);
        WebElement previousPagePagination = driver.findElement(Locators.PREVIOUS_PAGE_PAGINATION);
        previousPagePagination.click();
        System.out.println("previousPagePagination --> ok");
    }

}
