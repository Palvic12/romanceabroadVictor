package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
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

    public void checkHeaderMenuTabsVERSION1() { // HowWeWorkTests.java,  code line: 109
        System.out.println("--- Checking Header Menu Tabs ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
        WebElement headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
        WebElement headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
        WebElement headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
        WebElement headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
        WebElement headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
        WebElement headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
        List<WebElement> links = new ArrayList<WebElement>();
        links.add(headerLinkGiftsPix);
        links.add(headerLinkGiftsTxt);
        links.add(headerLinkTourToUkrainePix);
        links.add(headerLinkTourToUkraineTxt);
        links.add(headerLinkIndividualTourPix);
        links.add(headerLinkIndividualTourTxt);
        links.add(headerLinkHeart);
        links.add(headerButtonFindPeople);
        links.add(headerButtonLogin);

        WebDriverWait listWait = new WebDriverWait(driver, 10);
        listWait.until(ExpectedConditions.visibilityOfAllElements(links));

        System.out.println("HeaderMenuTabsVERSION1 list size is: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);
//            ajaxClick(links.get(i));
            links.get(i).click();
            if (i == 0) {
                actualTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
                System.out.println("Header Link Gifts Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkGiftsPix);
            }
            if (i == 1) {
                actualTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
                System.out.println("Header Link Gifts Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkGiftsTxt);
            }
            if (i == 2) {
                actualTitle = getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkrainePix);
            }
            if (i == 3) {
                actualTitle = getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkraineTxt);
            }
            if (i == 4) {
                actualTitle = getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkIndividualTourPix);
            }
            if (i == 5) {
                actualTitle = getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkIndividualTourTxt);
            }
            if (i == 6) {
                actualTitle = driver.getTitle();
                System.out.println("Header Link Heart' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkHeart);
                driver.get(Data.HOW_WE_WORK_PAGE);
            }
            if (i == 7) {
                actualTitle = getAnyTitle();
                System.out.println("Header Button Find People' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderButtonFindPeople);
            }
            if (i == 8) {
                actualTitle = driver.findElement(Locators.SIGNIN_TITLE).getText();
                System.out.println("Header Button Login' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderButtonLogin);
            }
            headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
            headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
            headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
            headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
            headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
            headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
            headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
            headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
            headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
            links = new ArrayList<WebElement>();
            links.add(headerLinkGiftsPix);
            links.add(headerLinkGiftsTxt);
            links.add(headerLinkTourToUkrainePix);
            links.add(headerLinkTourToUkraineTxt);
            links.add(headerLinkIndividualTourPix);
            links.add(headerLinkIndividualTourTxt);
            links.add(headerLinkHeart);
            links.add(headerButtonFindPeople);
            links.add(headerButtonLogin);
        }
    }

    public List<WebElement> collectLeftMenuGroupLinks(){
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_GROUP);
        return links;
    }





}