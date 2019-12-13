import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage extends BaseUI{


    String currentUrlHome;
    String currentPageTitleHome;
    String currentLinkTextHome;
    String currentLinkTextHowWeWork;
    int iFrame_number;
    String currentLinkTextSearch;
    String currentLinkTextMedia;
    String currentLinkTextGifts;
    String currentLinkTextTour;
    String currentLinkTextBlog;
    String currentLinkTextSignIn;
    String currentLinkTextRegistration;
    String currentLinkTextRequestTourInfoButton;
//    testHeartRomanceAbroadHeader()
//    testHomeLink();
//    testHowWeWorkLink();
//    testSearchPage();
//    testPhotosLink();
//    testGiftsLink();
//    testTourLink();
//    testBlogLink();
//    testSignInLink();
//    testRegistration();
//    testYouTubeVideo()
//    testRequestTourInfoButton();

    @Test
    public void testHeartRomanceAbroadHeader(){
        WebElement header = driver.findElement(Locators.HEART_ROMANCE_ABROAD);
        boolean headerIsDisplayed = header.isDisplayed();
        if (headerIsDisplayed){
            System.out.println("Header is displayed: " + headerIsDisplayed);
        }
        else {
            System.out.println("Header is displayed: " + headerIsDisplayed);
        }
    }

    @Test
    public void testHomeLink(){

        System.out.println("             *** testHomeLink ***");

        // Click "HOME" link
        WebElement homeLink = driver.findElement(Locators.LINK_HOME);
        homeLink.click();
        // Verifying 'Home' page Title
        System.out.println("--- Verifying 'Home' page Title ---");
        currentPageTitleHome = driver.getTitle();
        System.out.println("Current PageTitle of 'Home' page is:  " + currentPageTitleHome);
        System.out.println("Expected PageTitle of 'Home' page is: " + Data.expectedPageTitleHome);
        if (currentPageTitleHome.equals(Data.expectedPageTitleHome)){
            System.out.println("Current  PageTitle of 'Home' page is equal to expected PageTitle of 'Home' page");
        }
        else {
            System.out.println("Current  PageTitle of 'Home' page is NOT equal to expected PageTitle of 'Home' page");
        }
        Assert.assertEquals(currentPageTitleHome, Data.expectedPageTitleHome);
        // Verifying 'Home' page current url
        System.out.println("--- Verifying 'Home' page current url ---");
        currentUrlHome = driver.getCurrentUrl();
        System.out.println("Current Url of 'Home' page is:  " + currentUrlHome);
        System.out.println("Expected Url of 'Home' page is: " + Data.expectedUrlHome);
        if (currentUrlHome.equals(Data.expectedUrlHome)){
            System.out.println("Current Url of 'Home' page is equal to expected url of 'Home' page");
        }
        else {
            System.out.println("Current Url of 'Home' page is NOT equal to expected url of 'Home' page");
        }
        Assert.assertEquals(currentUrlHome, Data.expectedUrlHome);
        // Verifying 'Home' page LinkText
        System.out.println("--- Verifying 'Home' page LinkText ---");
        currentLinkTextHome = homeLink.getText();
        System.out.println("Current LinkText of 'Home' page is:  " + currentLinkTextHome);
        System.out.println("Expected LinkText of 'Home' page is: " + Data.expectedLinkTextHome);
        if (currentLinkTextHome.equals(Data.expectedLinkTextHome)){
            System.out.println("Current LinkText of 'Home' page is equal to expected LinkText of 'Home' page");
        }
        else {
            System.out.println("Current LinkText of 'Home' page is NOT equal to expected LinkText of 'Home' page");
        }
        Assert.assertEquals(currentLinkTextHome, Data.expectedLinkTextHome);
        // Verifying presence of iFrames
        System.out.println("--- Verifying 'Home' page iFrame number ---");
        int iFrame_number = driver.findElements(By.tagName("iframe")).size();
        System.out.println("iFrames present on web page: " + iFrame_number);


    }
    @Test
    public void testHowWeWorkLink(){
        System.out.println("             *** test 'HOW WE WORK' Link ***");
        WebElement howWeWorkLink = driver.findElement(Locators.LINK_HOW_WE_WORK);
        currentLinkTextHowWeWork = howWeWorkLink.getText();
        System.out.println("Current LinkText of 'HowWeWork' link is:  " + currentLinkTextHowWeWork);
        System.out.println("Expected LinkText of 'HowWeWork' link is: " + Data.expectedLinkTextHowWeWork);
        if (currentLinkTextHowWeWork.equals(Data.expectedLinkTextHowWeWork)){
            System.out.println("Current LinkText of 'HowWeWork' link is equal to expected LinkText of 'HowWeWork' link");
        }
        else {
            System.out.println("Current LinkText of 'HowWeWork' link is NOT equal to expected LinkText of 'HowWeWork' link");
        }
        Assert.assertEquals(currentLinkTextHowWeWork, Data.expectedLinkTextHowWeWork);
        howWeWorkLink.click();
    }


    @Test
    public  void testSearchPage(){
        System.out.println("             *** testSearchLink / 'PRETTY WOMEN' Link***"); // 'PRETTY WOMEN' Link
        WebElement searchLink = driver.findElement(Locators.LINK_SEARCH); // "PRETTY WOMEN"
        currentLinkTextSearch = searchLink.getText();
        System.out.println("Current LinkText of 'PRETTY WOMEN' page is:  " + currentLinkTextSearch);
        System.out.println("Expected LinkText of 'PRETTY WOMEN' page is: " + Data.expectedLinkTextSearch);
        if (currentLinkTextSearch.equals(Data.expectedLinkTextSearch)){
            System.out.println("Current LinkText of 'PRETTY WOMEN' link is equal to expected LinkText of 'PRETTY WOMEN' link");
        }
        else {
            System.out.println("Current LinkText of 'PRETTY WOMEN' link is NOT equal to expected LinkText of 'PRETTY WOMEN' link");
        }
        Assert.assertEquals(currentLinkTextSearch, Data.expectedLinkTextSearch);
        searchLink.click();

    }

    @Test
    public  void testPhotosLink(){
        System.out.println("             *** testPhotosLink ***");
        // Verify 'PHOTOS' Link LinkText
        System.out.println("--- Verifying 'PHOTOS' link LinkText ---");
        WebElement photosLink = driver.findElement(Locators.LINK_MEDIA);
        currentLinkTextMedia = photosLink.getText();
        System.out.println("Current LinkText of 'PHOTOS' link is:  " + currentLinkTextMedia);
        System.out.println("Expected LinkText of 'PHOTOS' link is: " + Data.expectedLinkTextMedia);
        if (currentLinkTextMedia.equals(Data.expectedLinkTextMedia)){
            System.out.println("Current LinkText of 'PHOTOS' link is equal to expected LinkText of 'PHOTOS' link");
        }
        else {
            System.out.println("Current LinkText of 'PHOTOS' link is NOT equal to expected LinkText of 'PHOTOS' link");
        }
        Assert.assertEquals(currentLinkTextMedia, Data.expectedLinkTextMedia);
        // Click "PHOTOS" link
        photosLink.click();

    }

    @Test
    public  void testGiftsLink(){
        System.out.println("             *** testGiftsLink ***");
        // Verify 'GIFTS' link LinkText
        System.out.println("--- Verifying 'GIFTS' link LinkText ---");
        WebElement giftsLink = driver.findElement(Locators.LINK_GIFT);
        currentLinkTextGifts = giftsLink.getText();
        System.out.println("Current LinkText of 'GIFTS' link is:  " + currentLinkTextGifts);
        System.out.println("Expected LinkText of 'GIFTS' link is: " + Data.expectedLinkTextGifts);
        if (currentLinkTextGifts.equals(Data.expectedLinkTextGifts)){
            System.out.println("Current LinkText of 'GIFTS' page is equal to expected LinkText of 'GIFTS' page");
        }
        else {
            System.out.println("Current LinkText of 'GIFTS' link is NOT equal to expected LinkText of 'GIFTS' link");
        }
        Assert.assertEquals(currentLinkTextGifts, Data.expectedLinkTextGifts);
        // Click "GIFTS" link
        giftsLink.click();//
    }

    @Test
    public  void testTourLink(){
        System.out.println("             *** test'TOUR TO UKRAINE' Link ***");
        // Verify 'TOUR TO UKRAINE' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' link LinkText ---");
        WebElement tourLink = driver.findElement(Locators.LINK_TOUR);
        currentLinkTextTour = tourLink.getText();
        System.out.println("Current LinkText of 'TOUR TO UKRAINE' link is:  " + currentLinkTextTour);
        System.out.println("Expected LinkText of 'TOUR TO UKRAINE' link is: " + Data.expectedLinkTextTour);
        if (currentLinkTextTour.equals(Data.expectedLinkTextTour)){
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' link is equal to expected LinkText of 'TOUR TO UKRAINE' link");
        }
        else {
            System.out.println("Current LinkText of 'TOUR TO UKRAINE' link is NOT equal to expected LinkText of 'TOUR TO UKRAINE' link");
        }
        Assert.assertEquals(currentLinkTextTour, Data.expectedLinkTextTour);
        // Click "TOUR TO UKRAINE" link
        tourLink.click();//
    }

    @Test
    public  void testBlogLink(){
        System.out.println("             *** test'BLOG' Link ***");
        // Verify 'BLOG' link LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' link LinkText ---");
        WebElement blogLink = driver.findElement(Locators.LINK_BLOG);
        currentLinkTextBlog = blogLink.getText();
        System.out.println("Current LinkText of 'BLOG' link is:  " + currentLinkTextBlog);
        System.out.println("Expected LinkText of 'BLOG' link is: " + Data.expectedLinkTextBlog);
        if (currentLinkTextBlog.equals(Data.expectedLinkTextBlog)){
            System.out.println("Current LinkText of 'BLOG' link is equal to expected LinkText of 'BLOG' link");
        }
        else {
            System.out.println("Current LinkText of 'BLOG' link is NOT equal to expected LinkText of 'BLOG' link");
        }
        Assert.assertEquals(currentLinkTextBlog, Data.expectedLinkTextBlog);
        // Click "BLOG" link
        blogLink.click();
    }

    @Test
    public  void testSignInLink(){
        System.out.println("             *** test'SIGN IN' Link ***");
        // Click the 'SIGN IN' link
        System.out.println("--- Verifying 'SIGN IN' link LinkText ---");
        WebElement signInLink = driver.findElement(Locators.LINK_SIGN_IN);
        currentLinkTextSignIn = signInLink.getText();
        System.out.println("Current LinkText of 'SIGN IN' link is:  " + currentLinkTextSignIn);
        System.out.println("Expected LinkText of 'SIGN IN' link is: " + Data.expectedLinkTextSignIn);
        if (currentLinkTextSignIn.equals(Data.expectedLinkTextSignIn)){
            System.out.println("Current LinkText of 'SIGN IN' link is equal to expected LinkText of 'SIGN IN' link");
        }
        else {
            System.out.println("Current LinkText of 'SIGN IN' link is NOT equal to expected LinkText of 'SIGN IN' link");
        }
        Assert.assertEquals(currentLinkTextSignIn, Data.expectedLinkTextSignIn);
        // Click "BLOG" link
        signInLink.click();

    }

    @Test
    public  void testRegistration(){ // 'JOIN FOR FREE NOW' Link

        // Verifying 'JOIN FOR FREE NOW' LinkText
        System.out.println("--- Verifying 'JOIN FOR FREE NOW' LinkText ---");
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION); // 'JOIN FOR FREE NOW' button
        currentLinkTextRegistration = registrationButton.getText();
        System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button is:  " + currentLinkTextRegistration);
        System.out.println("Expected LinkText of 'JOIN FOR FREE NOW' button  is: " + Data.expectedLinkTextRegistration);
        if (currentLinkTextRegistration.equals(Data.expectedLinkTextRegistration)){
            System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button is equal to expected LinkText of ''JOIN FOR FREE NOW' button");
        }
        else {
            System.out.println("Current LinkText of 'JOIN FOR FREE NOW' button  is NOT equal to expected LinkText of 'JOIN FOR FREE NOW' button ");
        }
        Assert.assertEquals(currentLinkTextRegistration, Data.expectedLinkTextRegistration);
        // Click 'JOIN FOR FREE NOW' button
        registrationButton.click();
        // Verify that registration window opens
        WebElement getStarted = driver.findElement(Locators.HEADER_GET_STARTED);
        boolean getStartedConfirmation = getStarted.isDisplayed();
        if (getStartedConfirmation){
            System.out.println("'JOIN FOR FREE NOW' button is working properly." );
        }
        else {
            System.out.println("'JOIN FOR FREE NOW' button is NOT working properly." ); // When fails, throws an exception and does not print the message
        }


    }

    @Test
    public void testYouTubeVideo(){
        // Scrol down page to youtube video
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        WebElement youTubeVideo = driver.findElement(Locators.LINK_YOU_TUBE_VIDEO);
        driver.switchTo().frame(youTubeVideo);
        WebElement youTubePlayButton = driver.findElement(Locators.BUTTON_YOU_TUBE_PLAY);
        youTubePlayButton.click();
        timeWait(5000);
        driver.findElement(By.cssSelector(".video-stream.html5-main-video")).click();
        System.out.println(driver.getTitle());
    }

    @Test
    public void testRequestTourInfoButton(){
        // Verifying 'REQUEST TOUR INFO' Button LinkText
        System.out.println("--- Verifying 'REQUEST TOUR INFO' BUTTON LinkText ---");
        // Scrol down page to 'REQUEST TOUR INFO' Button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700)");
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
        Assert.assertEquals(currentLinkTextRequestTourInfoButton, Data.expectedLinkTextRequestTourInfoButton);
        boolean requestEnabledConfirm = requestTourInfoButton.isEnabled();

        if (requestEnabledConfirm){
            System.out.println("'REQUEST TOUR INFO' button is enabled");
        }
        else System.out.println("'REQUEST TOUR INFO' button is disabled");



    }











}


