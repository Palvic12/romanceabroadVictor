import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class MainPage extends BaseActions{
    String currentLinkTextHowWeWork;
    String currentLinkTextSearch;
    String currentLinkTextMedia;
    String currentLinkTextGifts;
    String currentLinkTextTour;
    String currentLinkTextBlog;
    String currentLinkTextSignIn;
    boolean selectedCheckbox;
    String currentLinkTextRequestTourInfoButton;

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    // RED HEART HEADER
    public void checkHeartRomanceAbroadHeader(){
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

    // 'HOW WE WORK' link
    public void clickHowWeWorkLink(){
        // Verifying 'HOW WE WORK' page LinkText
        System.out.println("--- Verifying 'HOW WE WORK' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextHowWeWork, Data.expectedLinkTextHowWeWork);
        // Click "HOW WE WORK" link
        howWeWorkLink.click();
    }

    public void clickSearchLink(){
        // Verify 'SEARCH' page LinkText
        System.out.println("--- Verifying 'SEARCH' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextSearch, Data.expectedLinkTextSearch);
        // Click "PRETTY WOMEN" link
        searchLink.click();
    }

    public void clickPhotosLink(){
        System.out.println("             *** testFotosPage ***");
        // Verify 'PHOTOS' page LinkText
        System.out.println("--- Verifying 'PHOTOS' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextMedia, Data.expectedLinkTextMedia);
        // Click "PHOTOS" link
        photosLink.click();
    }

    public void clickGiftsLink(){
        System.out.println("             *** testGiftsPage ***");
        // Verify 'GIFTS' page LinkText
        System.out.println("--- Verifying 'GIFTS' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextGifts, Data.expectedLinkTextGifts);
        // Click "GIFTS" link
        giftsLink.click();//
    }

    public void clickTourToUkraineLink(){
        System.out.println("             *** test'TOUR TO UKRAINE' Page ***");
        // Verify 'TOUR TO UKRAINE' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextTour, Data.expectedLinkTextTour);
        // Click "TOUR TO UKRAINE" link
        tourLink.click();
    }

    public void clickBlogLink(){
        // Verify 'BLOG' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextBlog, Data.expectedLinkTextBlog);
        // Click "BLOG" link
        blogLink.click();//
    }

    public void clickSignInLink(){
        // Verify 'SIGN IN' page LinkText
        System.out.println("--- Verifying 'SIGN IN' page LinkText ---");
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
        Assert.assertEquals(currentLinkTextSignIn, Data.expectedLinkTextSignIn);
        // Click the 'SIGN IN' link
        signInLink.click();
    }

    // 'JOIN FOR FREE NOW' Button

    public void clickJoinButton(){
        // Click the Registration button
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION); // 'JOIN FOR FREE NOW' button
        registrationButton.click();
    }
    public void completeFirstPartOfRegistration(){
        //Enter email
        WebElement emailTextField = driver.findElement(Locators.TEXT_FIELD_EMAIL); // Email text field
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.sendKeys(Data.email);
        //Enter password
        WebElement passwordTextField = driver.findElement(Locators.TEXT_FIELD_PASSWORD); // Password text field
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextField));
        passwordTextField.sendKeys(Data.password);
        // Click NEXT button
        WebElement nextButton = driver.findElement(Locators.BUTTON_NEXT); //NEXT button (after Password)
        nextButton.click();
    }
    public void completeSecondPartOfRegistration(){
        // Enter username
        WebElement usernameTextField = driver.findElement(Locators.TEXT_FIELD_USERNAME); // Username text field
        usernameTextField.sendKeys(generateNewNumber(Data.username,10));
        // Pick a date
        WebElement birtDate = driver.findElement(Locators.DROP_DOWN_DAY); // Date of birth
        birtDate.click();
        List<WebElement> day_list = driver.findElements(By.xpath("//div[@id='daySelect']//li//a"));
        int day_list_size = day_list.size();
        System.out.println("The size of 'day_list' is: " + day_list_size);
        for (int i = 0; i < day_list_size; i++){
            System.out.print(day_list.get(i).getText() + " ");
        }
        for (int i = 0; i < day_list_size; i++){
            if (day_list.get(i).getText().contains("18")){ // Enter the date
                day_list.get(i).click();
                break;
            }
        }
        // Pick a month
        WebElement birtMonth = driver.findElement(Locators.DROP_DOWN_MONTH); // Month of birth
        birtMonth.click();
        List<WebElement> month_list = driver.findElements(By.xpath("//div[@id='monthSelect']//li//a"));
        int month_list_size = month_list.size();
        System.out.println();
        System.out.println("The size of 'month_list' is: " + month_list_size);
        for (int i = 0; i < month_list_size; i++){
            System.out.print(month_list.get(i).getText() + " ");
        }
        for (int i = 0; i < month_list_size; i++){
            if (month_list.get(i).getText().contains("Jun")){ //Enter the month
                month_list.get(i).click();
                break;
            }
        }
        // Pick a year
        WebElement birtYear = driver.findElement(Locators.DROP_DOWN_YEAR);  // Year of birth
        birtYear.click();
        List<WebElement> year_list = driver.findElements(By.xpath("//div[@id='yearSelect']//li//a"));
        int year_list_size = year_list.size();
        System.out.println("The size of 'year_list' is: " + year_list_size);
        for ( int i = 0; i < year_list_size; i++){
            System.out.print(year_list.get(i).getText() + " ");
        }
        for ( int i = 0; i < year_list_size; i++){
            if (year_list.get(i).getText().contains("1991")){ // Enter the year
                year_list.get(i).click();
                break;
            }
        }
        // Enter phone number
        WebElement phoneTextField = driver.findElement(Locators.TEXT_FIELD_PHONE);
        phoneTextField.sendKeys(Data.phone);
        // Enter location
        WebElement locationTextField = driver.findElement(Locators.TEXT_FIELD_LOCATION);
        locationTextField.clear();
        locationTextField.sendKeys("Bellevue, Washington, United States");
        // Click checkbox
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX);
        selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println();
        System.out.println("Checkbox previously selected: " + selectedCheckbox + " !!!!!!!!");
        if (!selectedCheckbox){
            checkboxConfirmation.click();
            System.out.println("Checkbox had been selected now.");
        }
    }

    public void clickNextButton(){
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
        timeWait(5000);
        WebElement youTubeVideoSurface = driver.findElement(By.cssSelector(".video-stream.html5-main-video"));
        youTubeVideoSurface.click();
        driver.switchTo().parentFrame();
        System.out.println("We are in back to parentFrame.");
    }

    public void checkRequestTourInfoButton(){
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
        Assert.assertEquals(currentLinkTextRequestTourInfoButton, Data.expectedLinkTextRequestTourInfoButton);
        boolean requestEnabledConfirm = requestTourInfoButton.isEnabled();

        if (requestEnabledConfirm){
            System.out.println("'REQUEST TOUR INFO' button is enabled");
        }
        else System.out.println("'REQUEST TOUR INFO' button is disabled");
        // Click 'REQUEST TOUR INFO' button
//        requestTourInfoButton.click();
    }

}
