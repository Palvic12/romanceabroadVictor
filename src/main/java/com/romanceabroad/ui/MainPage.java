package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BaseActions{
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


    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    // RED HEART HEADER
    public void verifyHeartRomanceAbroadHeader(){
        System.out.println("--- Verifying 'RED HEART HEADER' BUTTON ---");
        WebElement header = driver.findElement(Locators.HEART_ROMANCE_ABROAD);
        boolean headerIsDisplayed = header.isDisplayed();
        if (headerIsDisplayed){
            System.out.println("Header is displayed: " + headerIsDisplayed);
        }
        else {
            System.out.println("Header is displayed: " + headerIsDisplayed);
        }
    }
    // DISCOUNT ALERT --> 'BOOK NOW'
    public void clickLinkBookNow(){
        System.out.println("--- Clicking 'BOOK NOW' LINK ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.DISCOUNT_ALERT));
        WebElement bookNow = driver.findElement(Locators.DISCOUNT_ALERT);
        boolean bookNowIsDisplayed = bookNow.isDisplayed();
        if (bookNowIsDisplayed){
            System.out.println("Header is displayed: " + bookNowIsDisplayed);
            bookNow.click();
        }
        else {
            System.out.println("Header is displayed: " + bookNowIsDisplayed);
        }
    }

    public String verifyTitleBookNow(){
        System.out.println("--- Verifying 'BOOK NOW' LINK ---");
        actualTitle = driver.findElement(By.xpath("//h1")).getText();
        System.out.println("BookNow's actual title is: " + actualTitle);
        driver.navigate().to(Data.MAIN_URL);
        return actualTitle;
    }

    public void testLinksOnMainPage(){
        driver.get(Data.MAIN_URL);
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public List<WebElement> collectAllNavBarTabs(){
        List<WebElement> links = driver.findElements(Locators.MAIN_PAGE_NAV_BAR_TABS);
        return links;
    }



    // 'HOW WE WORK' link
    public String verifyLinkHowWeWork(){
        // Verifying 'HOW WE WORK' page LinkText
        System.out.println("--- Verifying 'HOW WE WORK' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOW_WE_WORK));
        WebElement howWeWorkLink = driver.findElement(Locators.LINK_HOW_WE_WORK);
        currentLinkTextHowWeWork = howWeWorkLink.getText();
        System.out.println("Current LinkText of 'HowWeWork' page is:  '" + currentLinkTextHowWeWork + "'");
        System.out.println("Expected LinkText of 'HowWeWork' page is: '" + Data.expectedLinkTextHowWeWork + "'");
        if (currentLinkTextHowWeWork.equals(Data.expectedLinkTextHowWeWork)){
            System.out.println("Current LinkText of 'HowWeWork' page is equal to expected LinkText of 'HowWeWork' page");
        }
        else {
            System.out.println("Current LinkText of 'HowWeWork' page is NOT equal to expected LinkText of 'HowWeWork' page");
        }
        return currentLinkTextHowWeWork;
    }

    public void clickLinkHowWeWork(){
        // Click "HOW WE WORK" link
        System.out.println("--- Clicking 'HOW WE WORK' link ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOW_WE_WORK));
        WebElement howWeWorkLink = driver.findElement(Locators.LINK_HOW_WE_WORK);
        howWeWorkLink.click();
    }

    public String verifyLinkSearch(){
        // Verify 'SEARCH' page LinkText
        System.out.println("--- Verifying 'SEARCH' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SEARCH));
        WebElement searchLink = driver.findElement(Locators.LINK_SEARCH); // "PRETTY WOMEN"
        currentLinkTextSearch = searchLink.getText();
        System.out.println("Current LinkText of 'Search' page is:  '" + currentLinkTextSearch + "'");
        System.out.println("Expected LinkText of 'Search' page is: '" + Data.expectedLinkTextSearch + "'");
        if (currentLinkTextSearch.equals(Data.expectedLinkTextSearch)){
            System.out.println("Current LinkText of 'Search' page is equal to expected LinkText of 'Search' page");
        }
        else {
            System.out.println("Current LinkText of 'Search' page is NOT equal to expected LinkText of 'Search' page");
        }
        return currentLinkTextSearch;
    }

    public void clickLinkSearch(){
        // Click "PRETTY WOMEN" link
        System.out.println("--- Clicking 'PRETTY WOMEN' link ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SEARCH));
        WebElement searchLink = driver.findElement(Locators.LINK_SEARCH); // "PRETTY WOMEN"
        searchLink.click();
    }

    public String verifyLinkPhotos(){
        System.out.println("             *** testPhotosPage ***");
        // Verify 'PHOTOS' page LinkText
        System.out.println("--- Verifying 'PHOTOS' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        WebElement photosLink = driver.findElement(Locators.LINK_MEDIA);
        currentLinkTextMedia = photosLink.getText();
        System.out.println("Current LinkText of 'PHOTOS' page is:  '" + currentLinkTextMedia + "'");
        System.out.println("Expected LinkText of 'PHOTOS' page is: '" + Data.expectedLinkTextMedia + "'");
        if (currentLinkTextMedia.equals(Data.expectedLinkTextMedia)){
            System.out.println("Current LinkText of 'PHOTOS' page is equal to expected LinkText of 'PHOTOS' page");
        }
        else {
            System.out.println("Current LinkText of 'PHOTOS' page is NOT equal to expected LinkText of 'PHOTOS' page");
        }
        return currentLinkTextMedia;
    }

    public void clickLinkPhotos(){
        // Click "PHOTOS" link
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        System.out.println("--- Clicking 'PHOTOS' link ---");
        WebElement photosLink = driver.findElement(Locators.LINK_MEDIA);
        photosLink.click();
    }

    public String verifyLinkGifts(){
        System.out.println("             *** testGiftsPage ***");
        // Verify 'GIFTS' page LinkText
        System.out.println("--- Verifying 'GIFTS' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_GIFT));
        WebElement giftsLink = driver.findElement(Locators.LINK_GIFT);
        currentLinkTextGifts = giftsLink.getText();
        System.out.println("Current LinkText of 'GIFTS' page is:  '" + currentLinkTextGifts + "'");
        System.out.println("Expected LinkText of 'GIFTS' page is: '" + Data.expectedLinkTextGifts + "'");
        if (currentLinkTextGifts.equals(Data.expectedLinkTextGifts)){
            System.out.println("Current LinkText of 'GIFTS' page is equal to expected LinkText of 'GIFTS' page");
        }
        else {
            System.out.println("Current LinkText of 'GIFTS' page is NOT equal to expected LinkText of 'GIFTS' page");
        }
        return currentLinkTextGifts;
    }

    public void clickLinkGifts(){
        // Click "GIFTS" link
        WebElement giftsLink = driver.findElement(Locators.LINK_GIFT);
        wait.until(ExpectedConditions.elementToBeClickable(giftsLink));
        System.out.println("--- Clicking 'GIFTS' link ---");
        giftsLink.click();//
    }

    public String verifyLinkTourToUkraine(){
        System.out.println("             *** test'TOUR TO UKRAINE' Page ***");
        // Verify 'TOUR TO UKRAINE' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_TOUR));
        WebElement tourLink = driver.findElement(Locators.LINK_TOUR);
        currentLinkTextTour = tourLink.getText();
        System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is:  '" + currentLinkTextTour + "'");
        System.out.println("Expected LinkText of 'TOUR TO UKRAINE' page is: '" + Data.expectedLinkTextTour + "'");
        if (currentLinkTextTour.equals(Data.expectedLinkTextTour)){
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is equal to expected LinkText of 'TOUR TO UKRAINE' page");
        }
        else {
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' page is NOT equal to expected LinkText of 'TOUR TO UKRAINE' page");
        }
        return currentLinkTextTour;
    }

    public void clickLinkTourToUkraine(){
        // Click "TOUR TO UKRAINE" link
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_TOUR));
        System.out.println("--- Clicking 'OUR TO UKRAINE' link ---");
        WebElement tourLink = driver.findElement(Locators.LINK_TOUR);
        tourLink.click();
    }

    public String verifyLinkBlog(){
        // Verify 'BLOG' page LinkText
        System.out.println("--- Verifying 'BLOG' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_BLOG));
        WebElement blogLink = driver.findElement(Locators.LINK_BLOG);
        currentLinkTextBlog = blogLink.getText();
        System.out.println("Current LinkText of 'BLOG' page is:  '" + currentLinkTextBlog + "'");
        System.out.println("Expected LinkText of 'BLOG' page is: '" + Data.expectedLinkTextBlog + "'");
        if (currentLinkTextBlog.equals(Data.expectedLinkTextBlog)){
            System.out.println("Current LinkText of 'BLOG' page is equal to expected LinkText of 'BLOG' page");
        }
        else {
            System.out.println("Current LinkText of 'BLOG' page is NOT equal to expected LinkText of 'BLOG' page");
        }
        return currentLinkTextBlog;
    }

    public void clickLinkBlog(){
        // Click "BLOG" link
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_BLOG));
        System.out.println("--- Clicking 'BLOG' link ---");
        WebElement blogLink = driver.findElement(Locators.LINK_BLOG);
        blogLink.click();
    }

    public String verifyLinkSignIn(){
        // Verify 'SIGN IN' page LinkText
        System.out.println("--- Verifying 'SIGN IN' page LinkText ---");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SIGN_IN));
        WebElement signInLink = driver.findElement(Locators.LINK_SIGN_IN);
        currentLinkTextSignIn = signInLink.getText();
        System.out.println("Current LinkText of 'SIGN IN' link is: '" + currentLinkTextSignIn + "'");
        System.out.println("Expected LinkText of 'SIGN IN' link is: '" + Data.expectedLinkTextSignIn + "'");
        if (currentLinkTextSignIn.equals(Data.expectedLinkTextSignIn)){
            System.out.println("Current LinkText of 'SIGN IN' link is equal to expected LinkText of 'SIGN IN' link");
        }
        else {
            System.out.println("Current LinkText of 'SIGN IN' link is NOT equal to expected LinkText of 'SIGN IN' link");
        }
        return currentLinkTextSignIn;
    }

    public void clickLinkSignIn(){
        // Click the 'SIGN IN' link
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SIGN_IN));
        WebElement signInLink = driver.findElement(Locators.LINK_SIGN_IN);
        signInLink.click();
    }

    // 'JOIN FOR FREE NOW' Button

    public String verifyLinkJoinButton(){
        // Verify 'JOIN FOR FREE NOW' button LinkText
        System.out.println("--- Verifying 'JOIN FOR FREE NOW' button LinkText ---");
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION); // 'JOIN FOR FREE NOW' button
        currentLinkTextJoinButton = registrationButton.getText();
        System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button is:  '" + currentLinkTextJoinButton + "'");
        System.out.println("Expected LinkText of 'JOIN FOR FREE NOW' button is: '" + Data.expectedLinkTextRegistration + "'");
        if (currentLinkTextJoinButton.equals(Data.expectedLinkTextRegistration)){
            System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button is equal to expected LinkText of 'JOIN FOR FREE NOW' button");
        }
        else {
            System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button is NOT equal to expected LinkText of 'JOIN FOR FREE NOW' button");
        }
        return currentLinkTextJoinButton;
    }

    public void clickJoinButton(){
        // Click the Registration button
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION); // 'JOIN FOR FREE NOW' button
//        registrationButton.click();
        ajaxClick(registrationButton);
    }

    public void completeFirstPartOfRegistration(String email, String password){
        //Enter email
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.TEXT_FIELD_EMAIL)));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email); // Email text field

        //Enter password
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password); // Password text field
    }

    public void clickNextButton1(){
        // Click NEXT button
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.BUTTON_NEXT_FIRST_PART)));
        driver.findElement(Locators.BUTTON_NEXT_FIRST_PART).click(); //NEXT button (after Password)
    }

    public void completeSecondPartOfRegistration(String username, String phone, String day,
                                                 String month, String year, String city, String location){
        // Enter username
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(username); // Username text field

        // Pick a month
        driver.findElement(Locators.DROP_DOWN_MONTH).click(); // Month of birth
        clickValueOfLists(Locators.MONTH_LIST, month);

        // Pick a date
        wait.until(ExpectedConditions.elementToBeClickable(Locators.DROP_DOWN_DAY));
        driver.findElement(Locators.DROP_DOWN_DAY).click(); // Date of birth
        clickValueOfLists(Locators.DAY_LIST, day);



        // Pick a year
        driver.findElement(Locators.DROP_DOWN_YEAR).click();  // Year of birth
        clickValueOfLists(Locators.YEAR_LIST, year);

        // Enter phone number
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);

        // Click checkbox
        driver.findElement(Locators.CHECK_BOX_CONFIRMATION).click();

        // Enter location
        driver.findElement(Locators.TEXT_FIELD_LOCATION).clear();
        driver.findElement(Locators.TEXT_FIELD_LOCATION).sendKeys(city);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LOCATION_LIST));
        clickValueOfLists(Locators.LOCATION_LIST, location);

    }

    public void clickNextButton2(){
        // Click NEXT button
        WebElement nextButton2 = driver.findElement(Locators.BUTTON_NEXT2); //NEXT button (after check box)
        //nextButton2.click(); // button id disabled
    }

    public void checkYouTubeVideo(){
        System.out.println("--- Verifying YouTubeVideo ---");
        // Scrol down page to youtube video
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700)");
        WebElement youTubeVideo = driver.findElement(Locators.LINK_YOU_TUBE_VIDEO);
        driver.switchTo().frame(youTubeVideo);
        System.out.println("We are in iFrame.");
        WebElement youTubePlayButton = driver.findElement(Locators.BUTTON_YOU_TUBE_PLAY);
        youTubePlayButton.click();
        System.out.println("YouTube video playing");
        javaWaitSec(5);
        WebElement youTubeVideoSurface = driver.findElement(Locators.YOU_TUBE_VIDEO_SURFACE);
        youTubeVideoSurface.click();
        System.out.println("YouTube video stoped");
        driver.switchTo().parentFrame();
        System.out.println("We are in back to parentFrame.");
    }

    public String verifyLinkRequestTourInfoButton(){
        // Verifying 'REQUEST TOUR INFO' Button LinkText
        System.out.println("--- Verifying 'REQUEST TOUR INFO' BUTTON LinkText ---");
        WebElement requestTourInfoButton = driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO);
        currentLinkTextRequestTourInfoButton = requestTourInfoButton.getText();
        System.out.println("Current LinkText of 'REQUEST TOUR INFO' button is:  " + currentLinkTextRequestTourInfoButton);
        System.out.println("Expected LinkText of 'REQUEST TOUR INFO' button  is: " + Data.expectedLinkTextRequestTourInfoButton);
        if (currentLinkTextRequestTourInfoButton.equals(Data.expectedLinkTextRequestTourInfoButton)){
            System.out.println("Current LinkText of 'REQUEST TOUR INFO' button is equal to expected LinkText of 'REQUEST TOUR INFO' button");
        }
        else {
            System.out.println("Current LinkText of 'REQUEST TOUR INFO' button  is NOT equal to expected LinkText of 'REQUEST TOUR INFO' button ");
        }
        boolean requestEnabledConfirm = requestTourInfoButton.isEnabled();
        if (requestEnabledConfirm){
            System.out.println("'REQUEST TOUR INFO' button is enabled");
        }
        else System.out.println("'REQUEST TOUR INFO' button is disabled");
        return currentLinkTextRequestTourInfoButton;
    }

    public void clickRequestTourInfoButton(){
        // Click 'REQUEST TOUR INFO' button
        WebElement requestTourInfoButton = driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO);
//        requestTourInfoButton.click();
    }

    public void clickJoinTodayLink(){
        System.out.println("--- Clicking 'JOIN TODAY' LINK ---");
        WebElement joinTodayLink = driver.findElement(Locators.JOIN_TODAY_LINK);
        ajaxClick(joinTodayLink);
    }


}
