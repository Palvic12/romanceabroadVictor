package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

    public List<WebElement> collectLeftMenuGroupLinks(){
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_GROUP);
        return links;
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

    public List<WebElement> collectInnerMenuLinksHowWeWorkPage(){
        // Clicking all Inner Menu Links from HowWeWorkPage
        List<WebElement> links = driver.findElements(Locators.WEB_ELEMENT_INNER_MENU_LINKS);
        return links;
    }

    public List<WebElement> collectFooterMenuTabs(){
        scrollToBottomOfPage();
        List<WebElement> links = driver.findElements(Locators.WEB_ELEMENT_FOOTER_MENU_TABS);
        return links;
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
