package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MediaPage extends BaseActions{
    String currentUrlMedia;
    String currentPageTitleMedia;
    String actualTitle;

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


    public void testMediaPageAuto(){

//        driver.get(Data.MEDIA_PAGE);
        List<WebElement> links = driver.findElements(Locators.MEDIA_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);

            if(i!=0) {
                links.get(i).click();
            }

            // Choose criteria of sorting
            if(!info.contains("Albums")){
                int sizeOfSortByDropDownList = getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                for (int j = 0; j < sizeOfSortByDropDownList; j++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    selectByIndex(sortByList, j);
                    javaWaitSec(1);
                }
            }
            else if(info.contains("Albums")){
                int sizeOfSortByDropDownList = getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                for (int k = 1; k < sizeOfSortByDropDownList; k++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                    selectByIndex(sortByList, k);
                    javaWaitSec(2);

                    int sizeOfSortByDropDownList2 = getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    for (int p = 0; p < sizeOfSortByDropDownList2; p++) {
                        WebElement sortByList2 = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                        selectByIndex(sortByList2, p);
                        javaWaitSec(1);
                    }
                }
            }
            // Click on 'ArrowDown' button
            javaWaitSec(2);
            WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
            arrowDownSorter.click();
            // Click on 'ArrowUp' button
            javaWaitSec(2);
            WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
            arrowUpSorter.click();
            links = driver.findElements(Locators.MEDIA_LINKS);
        }
    }




}
