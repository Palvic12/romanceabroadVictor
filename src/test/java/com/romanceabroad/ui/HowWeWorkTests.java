package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HowWeWorkTests extends BaseUI{
    String linkHowWeWork;
    String titleHowWeWork;
    String urlHowWeWork;
    String info;
    String actualTitle;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testHowWeWork() {
        linkHowWeWork = mainPage.verifyLinkHowWeWork();
        softAssert.assertEquals(linkHowWeWork, Data.expectedLinkTextHowWeWork, "Wrong Link Text!");
        softAssert.assertTrue(driver.findElement(Locators.LINK_HOW_WE_WORK).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkHowWeWork();
        titleHowWeWork = howWeWorkPage.verifyTitleHowWeWork();
        softAssert.assertEquals(titleHowWeWork, Data.expectedPageTitleHowWeWork, "Wrong title!");
        urlHowWeWork = howWeWorkPage.verifyUrlHowWeWork();
        softAssert.assertEquals(urlHowWeWork, Data.expectedUrlHowWeWork);
//        howWeWorkPage.testLinksOnHowWeWorkPage();
//        howWeWorkPage.verifyLanguage();//!
        softAssert.assertAll();
    }

    @Test
    public void checkHeaderMenuTabs(){
        System.out.println("--- Checking Header Menu Tabs ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
        WebElement headerButtonFindLogIn = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
        List<WebElement> links = driver.findElements(Locators.HEADER_MENU_LINKS);
        links.add(headerLinkHeart);
        links.add(headerButtonFindPeople);
        links.add(headerButtonFindLogIn);
        System.out.println("Number of elements in the list: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            System.out.print(i+1 + ". ");
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            if (i == 0) {
                actualTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
                System.out.println("Header Link Gifts Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkGiftsTxt);
            }
            if (i == 1) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Tour to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkTourToUkraineTxt);
            }
            if (i == 2) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Link Individual trip to Uktaine Txt' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkIndividualTourTxt);
            }
            if (i == 3) {
                actualTitle = driver.getTitle();
                System.out.println("Header Link Heart' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderLinkHeart);
                driver.get(Data.HOW_WE_WORK_PAGE);
            }
            if (i == 4) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Header Button Find People' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderButtonFindPeople);
            }
            if (i == 5) {
                actualTitle = driver.findElement(Locators.SIGNIN_TITLE).getText();
                System.out.println("Header Button Login' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHeaderButtonLogin);
                driver.get(Data.HOW_WE_WORK_PAGE);
            }
            headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
            headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
            headerButtonFindLogIn = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
            links = driver.findElements(Locators.HEADER_MENU_LINKS);
            links.add(headerLinkHeart);
            links.add(headerButtonFindPeople);
            links.add(headerButtonFindLogIn);
        }
    }



    @Test
    public void checkLeftMenuGroup(){
        driver.get(Data.HOW_WE_WORK_PAGE);
        System.out.println("--- Checking Left Menu Group ---");
        WebElement open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
        open_menu_btn.click();
        List<WebElement> links = testPage.collectLeftMenuGroupLinks();
        System.out.println("Number of links in Left Menu Group: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("HOME")){
                actualTitle = driver.getTitle();
                System.out.println("HOME's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHOME, "Wrong title!");
            }
            if (info.contains("SIGN UP")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SIGN UP's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSIGN_UP, "Wrong title!");
            }
            if (info.contains("LOGIN")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("LOGIN's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedLOGIN, "Wrong title!");
            }
            if (info.contains("NEWS")){
                actualTitle = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9']")).getText();
                System.out.println("NEWS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedNEWS, "Wrong title!");
            }
            if (info.contains("POLLS")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("POLLS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPOLLS, "Wrong title!");
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
            open_menu_btn.click();
            links = howWeWorkPage.collectLeftMenuGroupLinks();
            howWeWorkPage.javaWaitSec(2);
        }
        WebElement close_menu_btn = driver.findElement(Locators.CLOSE_MENU_BTN);
        close_menu_btn.click();
    }

    @Test
    public void checkInnerMenuLinks(){
        System.out.println("--- Checking Inner Menu Links ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        List<WebElement> links = howWeWorkPage.collectInnerMenuLinksHowWeWorkPage();
        System.out.println("Number of links in Inner menu: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("Advertising")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("Advertising's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedAdvertising, "Wrong title!");
            }
            if (info.contains("Terms of use")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTermsOfUse, "Wrong title!");
            }
            if (info.contains("Privacy Policy")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPrivacyPolicy, "Wrong title!");
            }
            if (info.contains("How it works")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowItWorks, "Wrong title!");
            }
            if (info.contains("Shipping terms")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("ShippingTerms's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedShippingTerms, "Wrong title!");
            }
            if (info.contains("Travel to Ukraine")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("TravelToUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTravelToUkraine, "Wrong title!");
            }
            if (info.contains("Blog")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("Blog's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBlog, "Wrong title!");
            }
            if (info.contains("Kharkov dating agency")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("KharkovDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKharkovDatingAgency, "Wrong title!");
            }
            if (info.contains("Kiev dating agency")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("KievDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingAgency, "Wrong title!");
            }
            if (info.contains("Odessa dating agency")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("OdessaDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedOdessaDatingAgency, "Wrong title!");
            }
            if (info.contains("Mail order girls")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("MailOrderGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMailOrderGirls, "Wrong title!");
            }
            if (info.contains("Beautiful urkainian girls")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("BeautifulUkrainianGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBeautifulUkrainianGirls, "Wrong title!");
            }
            if (info.contains("Real Ukrainian brides")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("RealUkrainianBrides' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedRealUkrainianBrides, "Wrong title!");
            }
            if (info.contains("Eastern European women")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("EasternEuropeanWomen's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedEasternEuropeanWomen, "Wrong title!");
            }
            if (info.contains("Marriage agency in Ukraine")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("MarriageAgencyUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMarriageAgencyUkraine, "Wrong title!");
            }
            if (info.contains("Kiev dating site")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("KievDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingSite, "Wrong title!");
            }
            if (info.contains("Find Ukrainian girlfriend")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("FindUkrainianGirlfriend's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFindUkrainianGirlfriend, "Wrong title!");
            }
            if (info.contains("Slavic women for marriage")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSlavicWomenMarriage, "Wrong title!");
            }
            if (info.contains("How to marry Ukrainian lady")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowToMarryUkrainianLady, "Wrong title!");
            }
            if (info.contains("Free Ukrainian dating site")){
                actualTitle = howWeWorkPage.getAnyTitle();
                System.out.println("FreeUkrainianDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFreeUkrainianDatingSite, "Wrong title!");
            }
            if (info.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//h2")).getText();
                System.out.println("9Factors' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expected9Factors, "Wrong title!");
            }
            if (info.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//span[contains(text(),'You may have asked yourself if dating and courting')]")).getText();
                System.out.println("Difference's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedDifference, "Wrong title!");
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            howWeWorkPage.javaWaitSec(1);
            links = howWeWorkPage.collectInnerMenuLinksHowWeWorkPage();
        }
    }

    @Test
    public void checkFooterMenuTabs(){
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

    @Test(dataProvider = "ContactUs", dataProviderClass = DataProviders.class)
    public void testContactUsDProv(String reason, String subject, String message) {
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


}
