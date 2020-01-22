package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MainPageTests extends BaseUI{
    String titleBookNow;
    String linkRequestTourInfoButton;
    String currentPageTitleHowWeWork;
    String currentUrlHowWeWork;
    String currentUrlSearch;
    String currentPageTitleSearch;
    String currentUrlMedia;
    String currentPageTitleMedia;
    String currentUrlGifts;
    String currentPageTitleGifts;
    String currentUrlTour;
    String currentPageTitleTour;
    String currentUrlBlog;
    String currentPageTitleBlog;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 0)
    public void testMainPage(){
        mainPage.verifyHeartRomanceAbroadHeader();
        mainPage.clickLinkBookNow();
        titleBookNow = mainPage.verifyTitleBookNow();
        softAssert.assertEquals(titleBookNow,Data.expectedBOOKNOW, "Wrong Title!!!");
//        mainPage.testLinksOnMainPage();
//        mainPage.clickAllNavBarTabs();
        mainPage.checkYouTubeVideo();
        linkRequestTourInfoButton = mainPage.verifyLinkRequestTourInfoButton();
        softAssert.assertEquals(linkRequestTourInfoButton, Data.expectedLinkTextRequestTourInfoButton);
        mainPage.clickRequestTourInfoButton();
        mainPage.clickJoinTodayLink();
        softAssert.assertAll();
    }

    @Test
    public void clickAllNavBarTabs(){
        System.out.println("--- Verifying Navigation Bar Tabs ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.MAIN_PAGE_NAV_BAR_TABS));
        List<WebElement> links = mainPage.collectAllNavBarTabs();
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            System.out.print(i+1 + ". ");
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            if (info.contains("WORK")){
                currentPageTitleHowWeWork = driver.getTitle();
                currentUrlHowWeWork = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleHowWeWork,Data.expectedPageTitleHowWeWork);
                Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);
            }
            if (info.contains("PRETTY WOMEN")){
                currentPageTitleSearch = driver.getTitle();
                currentUrlSearch = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleSearch, Data.expectedPageTitleSearch);
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
                driver.findElement(Locators.GALLERY_PICTURE_SEARCH);
            }
            if (info.contains("PHOTOS")){
                currentPageTitleMedia = driver.getTitle();
                currentUrlMedia = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleMedia, Data.expectedPageTitleMedia);
                Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
                driver.findElement(Locators.GALLERY_PICTURE_MEDIA);
            }
            if (info.contains("GIFTS")){
                currentPageTitleGifts = driver.getTitle();
                currentUrlGifts = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleGifts, Data.expectedPageTitleGifts);
                Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
                driver.findElement(Locators.GALLERY_PICTURE_GIFTS);
            }
            if (info.contains("TOUR")){
                currentPageTitleTour = driver.getTitle();
                currentUrlTour = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleTour, Data.expectedPageTitleTour);
                Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
                driver.findElement(Locators.GALLERY_PICTURE_TOUR);
            }
            if (info.contains("BLOG")){
                currentPageTitleBlog = driver.getTitle();
                currentUrlBlog = driver.getCurrentUrl();
                Assert.assertEquals(currentPageTitleBlog, Data.expectedPageTitleBlog);
                Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
                driver.findElement(Locators.BLOG_TITLE);
            }if (info.contains("SIGN IN")){
                driver.findElement(Locators.SIGNIN_TITLE);
            }
            driver.get(Data.MAIN_URL);
            links = mainPage.collectAllNavBarTabs();
        }
    }

    @Test(priority = 1)
    public void smokeTestMainPage(){
        System.out.println("Running smokeTestMainPage()");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.MAIN_PAGE_NAV_BAR_TABS));
        List<WebElement> mainTabs = driver.findElements(Locators.MAIN_PAGE_NAV_BAR_TABS);
        for (int i = 0; i < mainTabs.size(); i++) {
            String info = mainTabs.get(i).getText();
            mainTabs.get(i).click();
            driver.get(Data.MAIN_URL);
            mainTabs = driver.findElements(Locators.MAIN_PAGE_NAV_BAR_TABS);
        }
    }




}


