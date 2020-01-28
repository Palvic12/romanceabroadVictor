package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
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
    SoftAssert softAssert = new SoftAssert();
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

    @Test
    public void checkHeaderMenuTabs() {  // HowWeWorkTests.java,  code line: 47

        driver.get(Data.HOW_WE_WORK_PAGE);
        System.out.println("--- Checking Header Menu Tabs ---");
        System.out.println("Number of links in Header Menu: " + 9);
        WebElement headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
        headerLinkGiftsPix.click(); // 0
        headerLinkGiftsPixActualTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
        System.out.println("Header Link Gifts Pix' actual title is: " + headerLinkGiftsPixActualTitle);
        softAssert.assertEquals(headerLinkGiftsPixActualTitle, Data.expectedHeaderLinkGiftsPix);

        WebElement headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
        headerLinkGiftsTxt.click();
        headerLinkGiftsTxtActualTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
        System.out.println("Header Link Gifts Pix' actual title is: " + headerLinkGiftsTxtActualTitle);
        softAssert.assertEquals(headerLinkGiftsTxtActualTitle, Data.expectedHeaderLinkGiftsTxt);

        WebElement headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
        headerLinkTourToUkrainePix.click();
        headerLinkTourToUkrainePixActualTitle = blogPage.getAnyTitle();
        System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + headerLinkTourToUkrainePixActualTitle);
        softAssert.assertEquals(headerLinkTourToUkrainePixActualTitle, Data.expectedHeaderLinkTourToUkrainePix);

        WebElement headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
        headerLinkTourToUkraineTxt.click();
        headerLinkTourToUkraineTxtActualTitle = blogPage.getAnyTitle();
        System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + headerLinkTourToUkraineTxtActualTitle);
        softAssert.assertEquals(headerLinkTourToUkraineTxtActualTitle, Data.expectedHeaderLinkTourToUkraineTxt);

        WebElement headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
        headerLinkIndividualTourPix.click();
        headerLinkIndividualTourPixActualTitle = blogPage.getAnyTitle();
        System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + headerLinkIndividualTourPixActualTitle);
        softAssert.assertEquals(headerLinkIndividualTourPixActualTitle, Data.expectedHeaderLinkIndividualTourPix);

        WebElement headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
        headerLinkIndividualTourTxt.click();
        headerLinkIndividualTourTxtActualTitle = blogPage.getAnyTitle();
        System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + headerLinkIndividualTourTxtActualTitle);
        softAssert.assertEquals(headerLinkIndividualTourTxtActualTitle, Data.expectedHeaderLinkIndividualTourTxt);

        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
        headerLinkHeart.click();
        headerLinkHeartActualTitle = driver.getTitle();
        System.out.println("Header Link Heart' actual title is: " + headerLinkHeartActualTitle);
        softAssert.assertEquals(headerLinkHeartActualTitle, Data.expectedHeaderLinkHeart);

        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
        headerButtonFindPeople.click();
        headerButtonFindPeopleActualTitle = blogPage.getAnyTitle();
        System.out.println("Header Button Find People' actual title is: " + headerButtonFindPeopleActualTitle);
        softAssert.assertEquals(headerButtonFindPeopleActualTitle, Data.expectedHeaderButtonFindPeople);

        WebElement headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
        headerButtonLogin.click();
        headerButtonLoginActualTitle = driver.findElement(Locators.SIGNIN_TITLE).getText();
        System.out.println("Header Button Login' actual title is: " + headerButtonLoginActualTitle);
        softAssert.assertEquals(headerButtonLoginActualTitle, Data.expectedHeaderButtonLogin);
        softAssert.assertAll();
    }

    @Test
    public void checkHeaderMenuTabsVERSION1() { // HowWeWorkTests.java, code line: 32; TestPage.java,  code line: 87
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
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkrainePix);
            }
            if (i == 3) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkraineTxt);
            }
            if (i == 4) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkIndividualTourPix);
            }
            if (i == 5) {
                actualTitle = blogPage.getAnyTitle();
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
                actualTitle = blogPage.getAnyTitle();
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

    @Test
    public void checkHeaderMenuTabsVERSION2() { // HowWeWorkTests.java,  code line: 209
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
        List<WebElement> links = new ArrayList<>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,
                headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix,
                headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
        System.out.println("HeaderMenuTabsVERSION2 list size is: " + links.size());
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
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkrainePix);
            }
            if (i == 3) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkraineTxt);
            }
            if (i == 4) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Pix' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkIndividualTourPix);
            }
            if (i == 5) {
                actualTitle = blogPage.getAnyTitle();
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
                actualTitle = blogPage.getAnyTitle();
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
            links = new ArrayList<WebElement>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,
                    headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix,
                    headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
        }
    }


}
