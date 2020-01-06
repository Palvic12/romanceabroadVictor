import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowWeWorkPage extends BaseActions{
    String currentUrlHowWeWork;
    String currentPageTitleHowWeWork;
    String actualTitle;
    String info;


    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public String verifyTitleHowWeWork(){
        // Verifying 'HOW WE WORK' page Title
        System.out.println("--- Verifying 'HOW WE WORK' page Title ---");
        currentPageTitleHowWeWork = driver.getTitle();
        System.out.println("Current PageTitle of 'HowWeWork' page is:  '" + currentPageTitleHowWeWork + "'");
        System.out.println("Expected PageTitle of 'HowWeWork' page is: '" + Data.expectedPageTitleHowWeWork + "'");
        if (currentPageTitleHowWeWork.equals(Data.expectedPageTitleHowWeWork)){
            System.out.println("Current  PageTitle of 'HowWeWork' page is equal to expected PageTitle of 'HowWeWork' page");
        }
        else {
            System.out.println("Current  PageTitle of 'HowWeWork' page is NOT equal to expected PageTitle of 'HowWeWork' page");
        }
        return currentPageTitleHowWeWork;
    }
    public String verifyUrlHowWeWork(){
        // Verifying 'HOW WE WORK' page current url
        System.out.println("--- Verifying 'HowWeWork' page current url ---");
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println("Current Url of 'HowWeWork' page is:  '" + currentUrlHowWeWork + "'");
        System.out.println("Expected Url of 'HowWeWork' page is: '" + Data.expectedUrlHowWeWork + "'");
        if (currentUrlHowWeWork.equals(Data.expectedUrlHowWeWork)){
            System.out.println("Current Url of 'HowWeWork' page is equal to expected url of 'HowWeWork' page");
        }
        else {
            System.out.println("Current Url of 'HowWeWork' page is NOT equal to expected url of 'HowWeWork' page");
        }
        return  currentUrlHowWeWork;
    }

    public void testLinksOnHowWeWorkPage(){
        System.out.println("--- Testing links on 'HowWeWork' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }
    public void checkLeftMenuGroup(){
        System.out.println("--- Checking Left Menu Group ---");
        WebElement open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
        open_menu_btn.click();
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_GROUP);
        System.out.println("Number of links in Left Menu Group: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("HOME")){
                actualTitle = driver.getTitle();
                System.out.println("HOME's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHOME);
            }
            if (info.contains("SIGN UP")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SIGN UP's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSIGN_UP);
            }
            if (info.contains("LOGIN")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("LOGIN's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedLOGIN);
            }
            if (info.contains("NEWS")){
                actualTitle = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9']")).getText();
                System.out.println("NEWS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedNEWS);
            }
            if (info.contains("POLLS")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("POLLS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPOLLS);
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
            open_menu_btn.click();
            links = driver.findElements(Locators.LEFT_MENU_GROUP);
            javaWaitSec(2);
        }
        WebElement close_menu_btn = driver.findElement(Locators.CLOSE_MENU_BTN);
        close_menu_btn.click();
    }
    public void checkHeaderMenuTabsVERSION1(){
        System.out.println("--- Checking Header Menu Tabs ---");
        System.out.println("Number of links in Header Menu: " + 9);
        WebElement headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
        headerLinkGiftsPix.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
        headerLinkGiftsTxt.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
        headerLinkTourToUkrainePix.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
        headerLinkTourToUkraineTxt.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
        headerLinkIndividualTourPix.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
        headerLinkIndividualTourTxt.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
        headerLinkHeart.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
        headerButtonFindPeople.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
        WebElement headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
        headerButtonLogin.click();
        driver.get(Data.HOW_WE_WORK_PAGE);
    }
    public void checkHeaderMenuTabsVERSION2(){ // is not working
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
        List<WebElement> links = new ArrayList<>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix, headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            ajaxClick(links.get(i));
            driver.get(Data.HOW_WE_WORK_PAGE);
            links = new ArrayList<WebElement>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix, headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
        }
    }
    public void checkInnerMenuLinks() {
        System.out.println("--- Checking Inner Menu Links ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        List<WebElement> links = driver.findElements(Locators.WEB_ELEMENT_INNER_MENU_LINKS);
        System.out.println("Number of links in Inner menu: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("Advertising")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("Advertising's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedAdvertising);
            }
            if (info.contains("Terms of use")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTermsOfUse);
            }
            if (info.contains("Privacy Policy")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPrivacyPolicy);
            }
            if (info.contains("How it works")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowItWorks);
            }
            if (info.contains("Shipping terms")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("ShippingTerms's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedShippingTerms);
            }
            if (info.contains("Travel to Ukraine")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("TravelToUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTravelToUkraine);
            }
            if (info.contains("Blog")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("Blog's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBlog);
            }
            if (info.contains("Kharkov dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KharkovDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKharkovDatingAgency);
            }
            if (info.contains("Kiev dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KievDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingAgency);
            }
            if (info.contains("Odessa dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("OdessaDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedOdessaDatingAgency);
            }
            if (info.contains("Mail order girls")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("MailOrderGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMailOrderGirls);
            }
            if (info.contains("Beautiful urkainian girls")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("BeautifulUkrainianGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBeautifulUkrainianGirls);
            }
            if (info.contains("Real Ukrainian brides")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("RealUkrainianBrides' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedRealUkrainianBrides);
            }
            if (info.contains("Eastern European women")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("EasternEuropeanWomen's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedEasternEuropeanWomen);
            }
            if (info.contains("Marriage agency in Ukraine")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("MarriageAgencyUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMarriageAgencyUkraine);
            }
            if (info.contains("Kiev dating site")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KievDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingSite);
            }
            if (info.contains("Find Ukrainian girlfriend")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("FindUkrainianGirlfriend's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFindUkrainianGirlfriend);
            }
            if (info.contains("Slavic women for marriage")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSlavicWomenMarriage);
            }
            if (info.contains("How to marry Ukrainian lady")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowToMarryUkrainianLady);
            }
            if (info.contains("Free Ukrainian dating site")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("FreeUkrainianDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFreeUkrainianDatingSite);
            }
            if (info.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//h2")).getText();
                System.out.println("9Factors' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expected9Factors);
            }
            if (info.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//span[contains(text(),'You may have asked yourself if dating and courting')]")).getText();
                System.out.println("Difference's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedDifference);
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            javaWaitSec(1);
            links = driver.findElements(Locators.WEB_ELEMENT_INNER_MENU_LINKS);
        }
    }
    public void checkFooterMenuTabs(){
        System.out.println("--- Checking Footer Menu Tabs ---");
        driver.get(Data.HOW_WE_WORK_PAGE);
        scrollToBottomOfPage();
        List<WebElement> links = driver.findElements(Locators.WEB_ELEMENT_FOOTER_MENU_TABS);
        System.out.println(links.size()-1);
        for (int i = 0; i < links.size()-1; i++) {
            info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("Contact Us")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("ContactUs' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedContactUs);
            }
            if (info.contains("Sitemap")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("Sitemap's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSitemap);
            }
            if (info.contains("How it works")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowItWorks);
            }
            if (info.contains("NEWS")){
                actualTitle = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9']")).getText();
                System.out.println("NEWS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedNEWS);
            }
            if (info.contains("Privacy")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPrivacyPolicy);
            }
            if (info.contains("Terms of use")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTermsOfUse);
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            scrollToBottomOfPage();
            links = driver.findElements(Locators.WEB_ELEMENT_FOOTER_MENU_TABS);
        }
    }
    public void verifyLanguage(){
        scrollToBottomOfPage();
        WebElement russianLanguage = driver.findElement(Locators.LANGUAGE_RUSSIAN);
        javaWaitSec(1);
        russianLanguage.click();
        WebElement englishLanguage = driver.findElement(Locators.LANGUAGE_ENGLISH);
        javaWaitSec(1);
        englishLanguage.click();
    }



}
