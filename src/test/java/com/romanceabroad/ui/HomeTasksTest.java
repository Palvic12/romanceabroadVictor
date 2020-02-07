package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomeTasksTest extends BaseUI { //extends com.romanceabroad.ui.BaseUI

    String actualTitle;
    String headerLinkGiftsPixActualTitle;
    String headerLinkGiftsTxtActualTitle;
    String headerLinkTourToUkrainePixActualTitle;
    String headerLinkTourToUkraineTxtActualTitle;
    String headerLinkIndividualTourPixActualTitle;
    String headerLinkIndividualTourTxtActualTitle;
    String headerLinkHeartActualTitle;
    String headerButtonFindPeopleActualTitle;
    String headerButtonLoginActualTitle;
    String signInErrorAlert;
    String info;
    SoftAssert softAssert = new SoftAssert();

    //************************************************************************************
    //Home Work 25
    //vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v

    @Test(dataProvider = "SignInNegative", dataProviderClass = DataProviders.class)
    public void testSignInNegative(String email, String password, boolean requirement) {// HomeWork25}
        mainPage.clickLinkSignIn();
        //Enter email
        WebElement textFieldSignInEmail = driver.findElement(Locators.TEXT_FIELD_SIGNIN_EMAIL);  // Email text field
        wait.until(ExpectedConditions.visibilityOf(textFieldSignInEmail));
        textFieldSignInEmail.click();
        textFieldSignInEmail.sendKeys(email);
        //Enter password
        WebElement textFieldSignInPassword = driver.findElement(Locators.TEXT_FIELD_SIGNIN_PASSWORD); // Password text field
        wait.until(ExpectedConditions.elementToBeClickable(textFieldSignInPassword));
        textFieldSignInPassword.sendKeys(password);
        // Click SIGNIN button
        WebElement signInButton = driver.findElement(Locators.BUTTON_SIGN_IN); //SIGNIN button
        signInButton.click();
        softAssert.assertTrue(driver.findElement(Locators.ERROR_MESSAGE_LOGIN_TEXT).isDisplayed());
        signInErrorAlert = signInPage.ckeckErrorSignIn();
        softAssert.assertEquals(signInErrorAlert, Data.expectedSignInErrorAlertEmail, "Wrong Alert!");
        softAssert.assertAll();
    }

    //***************************************************************************
    //Home Work 26
    //***************************************************************************
    @Test
    public void checkFooterMenuTabs(){ //HowWeWorkTests.java, code line 532
        System.out.println("--- Checking Footer Menu Tabs ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        howWeWorkPage.scrollToBottomOfPage();
        List<WebElement> links = howWeWorkPage.collectFooterMenuTabs();
        System.out.println(links.size()-1);
        for (int i = 0; i < links.size()-1; i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("Contact Us")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("ContactUs' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedContactUs, "Wrong title!");
            }
            if (info.contains("Sitemap")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("Sitemap's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSitemap, "Wrong title!");
            }
            if (info.contains("How it works")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowItWorks, "Wrong title!");
            }
            if (info.contains("NEWS")){
                actualTitle = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9']")).getText();
                System.out.println("NEWS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedNEWS, "Wrong title!");
            }
            if (info.contains("Privacy")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPrivacyPolicy, "Wrong title!");
            }
            if (info.contains("Terms of use")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTermsOfUse, "Wrong title!");
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            howWeWorkPage.scrollToBottomOfPage();
            links = howWeWorkPage.collectFooterMenuTabs();
        }
    }

    //************************************************************************************
    // QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS
    //vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v


    //^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^
    //QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS
    //*********************************************************************************************





    //***************************************************************************
    //Home Work 14
    //***************************************************************************


    public static final By LEFT_MENU_GROUP = By.xpath("//div[@class='main-menu']//li[@class='menu-group ']");
    public static final By ROW_MARRY_UKRAINIAN_LADY_LINK = By.xpath("//span[@itemscope='itemscope']//a[@href='https://romanceabroad.com/']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_MEDIA_SORTER = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    public static final By DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS = By.xpath("//div[@class='col-xs-12']//select[@id='album_id']");
    public static final By GALLERY_PICTURE_TOUR = By.xpath("//div[@class='product-main-media pg-thumbnail']//img[@class='img-rounded img-responsive']");
    public static final By LINK_TOUR = By.xpath("//li[@class='nav-item']//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LINK_SIGN_IN = By.xpath("//li[@class='nav-item']//a[@href='https://romanceabroad.com/users/login_form']");
    public static final By RELATED_ITEMS = By.xpath("//ul[@class='user-gallery']//img");
    public static final By BLOG_ALL_LINKS = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//a");

    //************************************************************************************
    //Home Work 17
    //vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v

    @Test
    public void testContactUs() { // HomeWork17
        mainPage.clickLinkBlog();
        mainPage.scrollToBottomOfPage();
        driver.findElement(Locators.FOOTER_LINK_CONTACT).click();
        actualTitle = blogPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedContactUs, "Title is not correct!");
        WebElement reasonTextBox = driver.findElement(Locators.CONTACT_US_REASON_SELECT);
        reasonTextBox.click();
        mainPage.getDropDownListByText(reasonTextBox, "Technical support");
        WebElement yourName = driver.findElement(Locators.CONTACT_US_NAME_TEXT_BOX);
        yourName.sendKeys(Data.username);
        WebElement yourEmail = driver.findElement(Locators.CONTACT_US_EMAIL_TEXT_BOX);
        yourEmail.sendKeys(Data.email);
        WebElement subject = driver.findElement(Locators.CONTACT_US_SUBJECT_TEXT_BOX);
        subject.sendKeys("Test contact");
        WebElement message = driver.findElement(Locators.CONTACT_US_MESSAGE_TEXT_AREA);
        message.sendKeys("We missed you!");
        WebElement securityCode = driver.findElement(Locators.CONTACT_US_SECURITY_CODE_TEXT_BOX);
        securityCode.sendKeys(mainPage.generateSecurityCode());
        WebElement sendButton = driver.findElement(Locators.CONTACT_US_SEND_BUTTON);
//        sendButton.click();
    }

    @Test(dataProvider = "ContactUs", dataProviderClass = DataProviders.class)
    public void testContactUsDProv(String reason, String subject, String message) { // HomeWork17
        mainPage.clickLinkBlog();
        mainPage.scrollToBottomOfPage();
        driver.findElement(Locators.FOOTER_LINK_CONTACT).click();
        actualTitle = blogPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedContactUs, "Title is not correct!");
        WebElement reasonTextBox = driver.findElement(Locators.CONTACT_US_REASON_SELECT);
        reasonTextBox.click();
        mainPage.getDropDownListByText(reasonTextBox, reason);
        WebElement yourName = driver.findElement(Locators.CONTACT_US_NAME_TEXT_BOX);
        yourName.sendKeys(Data.username);
        WebElement yourEmail = driver.findElement(Locators.CONTACT_US_EMAIL_TEXT_BOX);
        yourEmail.sendKeys(Data.email);
        driver.findElement(Locators.CONTACT_US_SUBJECT_TEXT_BOX).sendKeys(subject);
        driver.findElement(Locators.CONTACT_US_MESSAGE_TEXT_AREA).sendKeys(message);
        WebElement securityCode = driver.findElement(Locators.CONTACT_US_SECURITY_CODE_TEXT_BOX);
        securityCode.sendKeys(mainPage.generateSecurityCode());
        WebElement sendButton = driver.findElement(Locators.CONTACT_US_SEND_BUTTON);
//        sendButton.click();
    }
    //^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^
    //Home Work 17
    //*********************************************************************************************

    //************************************************************************************
    // QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS
    //vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v vvvvvvvv v v v v


    //^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^ ^ ^ ^ ^ ^^^^^^^^
    //QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS       QUESTIONS
    //*********************************************************************************************


}
