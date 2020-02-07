package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestPage extends BaseActions{
    String currentUrlHowWeWork;
    String currentPageTitleHowWeWork;
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
    String currentLinkTextHowWeWork;
    String currentLinkTextSearch;
    String currentLinkTextMedia;
    String currentLinkTextGifts;
    String currentLinkTextTour;
    String currentLinkTextBlog;
    String currentLinkTextSignIn;
    String currentLinkTextJoinButton;
    boolean checkboxConfirmation;
    String currentLinkTextRequestTourInfoButton;
    String actualTitle;
    String info;

    public TestPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public String verifyTitleBlog(){
        // Verify 'BLOG' page Title
        System.out.println("--- Verifying 'BLOG' page Title ---");
        currentPageTitleBlog = driver.getTitle();
        System.out.println("Current PageTitle of 'BLOG' page is:  '" + currentPageTitleBlog + "'");
        System.out.println("Expected PageTitle of 'BLOG' page is: '" + Data.expectedPageTitleBlog + "'");
        if (currentPageTitleBlog.equals(Data.expectedPageTitleBlog)){
            System.out.println("Current  PageTitle of 'BLOG' page is equal to expected PageTitle of 'BLOG' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'BLOG' page is NOT equal to expected PageTitle of 'BLOG' page.");
        }
        return currentPageTitleBlog;
    }

    public String verifyUrlBlog(){
        // Verifying 'BLOG' page current url
        System.out.println("--- Verifying 'BLOG' page current url ---");
        currentUrlBlog = driver.getCurrentUrl();

        System.out.println("Current Url of 'BLOG' page is:  '" + currentUrlBlog + "'");
        System.out.println("Expected Url of 'BLOG' page is: '" + Data.expectedUrlBlog + "'");
        if (currentUrlBlog.equals(Data.expectedUrlBlog)){
            System.out.println("Current Url of 'BLOG' page is equal to expected url of 'BLOG' page.");
        }
        else {
            System.out.println("Current Url of 'BLOG' page is NOT equal to expected url of 'BLOG' page.");
        }
        return currentUrlBlog;

    }

    public void testLinksOnBlogPage(){
        System.out.println("--- Testing links on 'BLOG' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public List<WebElement> collectAllLinksOfArticles(){
        // Clicking all links in 'Blog' info content block
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_LINKS);
        return links;
    }

    public List<WebElement> collectLeftMenuGroupLinks(){
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_GROUP);
        return links;
    }





}
