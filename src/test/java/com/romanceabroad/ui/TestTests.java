package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TestTests extends BaseUI { //extends com.romanceabroad.ui.BaseUI
    String currentUrlSearch;
    String linkJoinButton;
    String linkTextBlog;
    String titleBlog;
    String urlBlog;

    String nameOfArticle;
    String titleOfArticle;
    String actualTitle;
    String info;


    @Test
    public void testNevermind() throws InterruptedException {
//        Assert.assertEquals("Web", "Web is");
////        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
////        Assert.fail("Element is not displayed");
////
////        SoftAssert softAssert = new SoftAssert();
////        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "URL is wrong");
////        softAssert.assertAll();
//        mainPage.clickHowWeWorkLink();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1000)");
//        List<WebElement> footerMenuTabs = driver.findElements(Locators.WEB_ELEMENT_FOOTER_MENU_TABS);
//        System.out.println(footerMenuTabs.size()-1);
//        for (int i = 0; i < footerMenuTabs.size()-1; i++) {
//            String footer_menu_item_text = footerMenuTabs.get(i).getText();
//            System.out.println(footer_menu_item_text);
//            footerMenuTabs.get(i).click();
////            searchPage.timeWait(2000);
////            driver.navigate().back();
//            driver.get(Data.HOW_WE_WORK_PAGE);
//            js.executeScript("window.scrollBy(0, 1000)");
//            footerMenuTabs = driver.findElements(Locators.WEB_ELEMENT_FOOTER_MENU_TABS);
//        }

        // Header Tabs
        //WebElement[] elems = {wikipedia1, searchButton, letter};
//        List<String> crunchifyList1 = new ArrayList<String>(Arrays.asList("kiwi", "orange", "melon"));

//        driver.get(Data.HOW_WE_WORK_PAGE);
//        //***********************************************************************************************
//        System.out.println("--- Checking Header Menu Tabs ---");
//        System.out.println(9);
//        WebElement headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
//        headerLinkGiftsPix.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
//        headerLinkGiftsTxt.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
//        headerLinkTourToUkrainePix.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
//        headerLinkTourToUkraineTxt.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
//        headerLinkIndividualTourPix.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
//        headerLinkIndividualTourTxt.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
//        headerLinkHeart.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
//        headerButtonFindPeople.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
//        headerButtonLogin.click();
//        driver.get(Data.HOW_WE_WORK_PAGE);

////        //***********************************************************************************************
////        //checkHeaderMenuTabs()
//        System.out.println("--- Checking Header Menu Tabs ---");
//        driver.get(Data.HOW_WE_WORK_PAGE);
//        WebElement headerLinkGiftsPix = driver.findElement(Locators.HEADER_LINK_GIFTS_PIX);
//        WebElement headerLinkGiftsTxt = driver.findElement(Locators.HEADER_LINK_GIFTS_TXT);
//        WebElement headerLinkTourToUkrainePix = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_PIX);
//        WebElement headerLinkTourToUkraineTxt = driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE_TXT);
//        WebElement headerLinkIndividualTourPix = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_PIX);
//        WebElement headerLinkIndividualTourTxt = driver.findElement(Locators.HEADER_INDIVIDUAL_TOUR_TXT);
//        WebElement headerLinkHeart = driver.findElement(Locators.HEADER_LINK_HEART);
//        WebElement headerButtonFindPeople = driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE);
//        WebElement headerButtonLogin = driver.findElement(Locators.HEADER_BUTTON_LOGIN);
////
////
////        List<WebElement> headerMenuElements = new ArrayList<WebElement>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix, headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
//        List<WebElement> headerMenuElements = new ArrayList<>(Arrays.asList());
//        headerMenuElements.add(headerLinkGiftsPix);
//        headerMenuElements.add(headerLinkGiftsTxt);
//        headerMenuElements.add(headerLinkTourToUkrainePix);
//        headerMenuElements.add(headerLinkTourToUkraineTxt);
//        headerMenuElements.add(headerLinkIndividualTourPix);
//        headerMenuElements.add(headerLinkIndividualTourTxt);
//        headerMenuElements.add(headerLinkHeart);
//        headerMenuElements.add(headerButtonFindPeople);
//        headerMenuElements.add(headerButtonLogin);
//
//        System.out.println(headerMenuElements.size());
//        for (int i = 0; i < headerMenuElements.size(); i++) {
//            String headerMenuElementsText = headerMenuElements.get(i).getText();
//            System.out.println(i+1 + ". " + headerMenuElementsText);
//            if (headerMenuElements.get(i).isDisplayed()){
//                headerMenuElements.get(i).click();
//            }
////            headerMenuElements.get(i).click();
//            driver.get(Data.HOW_WE_WORK_PAGE);
//            headerMenuElements = new ArrayList<WebElement>(Arrays.asList(headerLinkGiftsPix, headerLinkGiftsTxt,headerLinkTourToUkrainePix, headerLinkTourToUkraineTxt, headerLinkIndividualTourPix, headerLinkIndividualTourTxt, headerLinkHeart, headerButtonFindPeople, headerButtonLogin));
////            headerMenuElements = new ArrayList<>(Arrays.asList());
//            searchPage.timeWait(2000);
//        }

        //************************************************************************************
//        driver.get(Data.MEDIA_PAGE);
//        List<WebElement> links = driver.findElements(Locators.MEDIA_LINKS);
//        System.out.println(links.size());
//        for (int i = 0; i < links.size(); i++) {
//            String info = links.get(i).getText();
//            System.out.println(i+1 + ". " + info);
//            links.get(i).click();
//            if (links.contains("All")){
//                // Click on 'ArrowDown' button
//                mainPage.timeWait(2000);
//                WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
//                arrowDownSorter.click();
//                // Click on 'ArrowUp' button
//                mainPage.timeWait(2000);
//                WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
//                arrowUpSorter.click();
//                // Choose criteria of sorting
//                WebElement listPhotosSorter = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Views count"); // Text: "Date"  "Views count" "Comments count"
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Comments count");
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Date");
//            }
//            if (links.contains("Photo")){
//                // Click on 'ArrowDown' button
//                mainPage.timeWait(2000);
//                WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
//                arrowDownSorter.click();
//                // Click on 'ArrowUp' button
//                mainPage.timeWait(2000);
//                WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
//                arrowUpSorter.click();
//                // Choose criteria of sorting
//                WebElement listPhotosSorter = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Views count"); // Text: "Date"  "Views count" "Comments count"
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Comments count");
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Date");
//            }
//            if (links.contains("Video")){
//                // Click on 'ArrowDown' button
//                mainPage.timeWait(2000);
//                WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
//                arrowDownSorter.click();
//                // Click on 'ArrowUp' button
//                mainPage.timeWait(2000);
//                WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
//                arrowUpSorter.click();
//                // Choose criteria of sorting
//                WebElement listPhotosSorter = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Views count"); // Text: "Date"  "Views count" "Comments count"
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Comments count");
//                mainPage.timeWait(1000);
//                mainPage.selectByText(listPhotosSorter, "Date");
//            }
//            links = driver.findElements(Locators.MEDIA_LINKS);
//        }


//        //**************************************************************************************************
//        driver.navigate().to("https://romanceabroad.com/content/view/beautiful-urkainian-girls");
//        String title = driver.getTitle();
//        String titleExpected = driver.findElement(By.xpath("//h1")).getText();
//        System.out.println(title);
//        System.out.println(titleExpected);
        //-----------------
//        driver.navigate().to();
////        mainPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_AGE_MIN, popa);
////        mainPage.selectItemDropDownRandomOption();
        //-----------


//        //**************************************************************************************************


//        // Left Menu Group
//        WebElement open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
//        open_menu_btn.click();
//        List<WebElement> left_menu_group = driver.findElements(Locators.LEFT_MENU_GROUP);
//        System.out.println(left_menu_group.size());
//        for (int i = 0; i < left_menu_group.size(); i++) {
//            String menu_item_text = left_menu_group.get(i).getText();
//            System.out.println(i+1 + ". " + menu_item_text);
//            left_menu_group.get(i).click();
//            driver.get(Data.HOW_WE_WORK_PAGE);
//            open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
//            open_menu_btn.click();
//            left_menu_group = driver.findElements(Locators.LEFT_MENU_GROUP);
//            searchPage.timeWait(2000);
//        }

//        List<WebElement> main_menu_tabs =driver.findElements(Locators.MAIN_MENU_TABS);
//        System.out.println(main_menu_tabs);
//        for (int i = 1; i < main_menu_tabs.size(); i++) {
//            String main_menu_tabs_text = main_menu_tabs.get(i).getText();
//            System.out.println(main_menu_tabs_text);
//            main_menu_tabs.get(i).click();
//            driver.get(Data.HOW_WE_WORK_PAGE);
//            main_menu_tabs =driver.findElements(Locators.MAIN_MENU_TABS);
//            searchPage.timeWait(2000);
//        }
//        WebElement findPeopleBtn = driver.findElement(By.xpath("//div[@class='menu-top-right-mobile']//a"));
//        WebElement findPeopleBtn = driver.findElement(By.xpath("//i[@class='fa fa-search fa-lg item']"));
//        findPeopleBtn.click();

    }

    //***************************************************************************
    //Lesson 14
    //***************************************************************************
//    @Test
//    public void testLinksOnMainPage() throws IOException {
////        mainPage.checkLinksOnWebPage("//a", "href");
////        mainPage.checkLinksOnWebPage("//a", "href");
////        driver.findElement(Locators.LINK_SEARCH);
////        mainPage.checkLinksOnWebPage("//a", "href");
////        mainPage.checkLinksOnWebPage("//a", "href");
//
////        driver.navigate().to("https://romanceabroad.com/users/search");
//        driver.navigate().to("https://makemysushi.com/404?");
//
////        driver.switchTo().frame("mainpanel");
//        // 1. Get the list of all the links and images:
//        List<WebElement> linksList = driver.findElements(By.tagName("a"));
//        linksList.addAll(driver.findElements(By.tagName("img")));
//
//        System.out.println("size of full links and images is: ---> " + linksList.size());
//
//
//        List<WebElement> activeLinks = new ArrayList<>();
//
//        //2. Iterate linksList: exclude all the links/images - doesn't have any href attribute
//        for (int i = 0; i < linksList.size(); i++) {
//            System.out.println(linksList.get(i).getAttribute("href"));
//            if (linksList.get(i).getAttribute("href")!=null && (!linksList.get(i).getAttribute("href").contains("javascript"))){
//                activeLinks.add(linksList.get(i));
//            }
//        }
//
//        // Get the size of active links list:
//        System.out.println("size of active links and images is: ---> " + activeLinks.size());
//
//        // 3. check the href url, with httpConnection api:
//        //20 -- Ok
//        //404 -- not found
//        //500 -- internal error
//        //400 -- bad request
//        for (int j = 0; j < activeLinks.size(); j++) {
//            HttpURLConnection connection = null;
//            try {
//                connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            connection.connect();
//            String response = connection.getResponseMessage(); //ok
//            connection.disconnect();
//            System.out.println(activeLinks.get(j).getAttribute("href") + " ---> " + response);
//
//        }
//
//    }
//
//    @Test
//    public void testLinksOnTourPage(){
//        System.out.println("--- Testing links on 'HowWeWork' page ---");
//        driver.findElement(Locators.LINK_BLOG).click();
//        mainPage.checkLinksOnWebPage("//a", "href");
//        mainPage.checkLinksOnWebPage("//img", "src");
//    }
//
//    @Test
//    public void selectRandomDropDownList(){
//        driver.findElement(Locators.LINK_SEARCH).click();
//        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
//        System.out.println(sizeOfDropDownListSortBy);
//        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
//            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
//            mainPage.javaWaitSec(2);//
//        }
//    }

    //***************************************************************************
    //Lesson 16
    //***************************************************************************

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i + 1 + ". ");
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(2);//
        }
    }














    /*https://www.guru99.com/implicit-explicit-waits-selenium.html

    String eTitle = "Demo Guru99 Page";
    String aTitle = "" ;

    //get the actual value of the title
    aTitle = driver.getTitle();
    //compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
    {
        System.out.println( "Test Passed") ;
    }
	else {
        System.out.println( "Test Failed" );
    }
    */

    //***************************************************************************
    //Lesson 17
    //***************************************************************************
//    @Test
//    public void testRegistration(){
//        linkJoinButton = mainPage.verifyLinkJoinButton();
//        Assert.assertEquals(linkJoinButton, Data.expectedLinkTextRegistration);
//        testPage.clickJoinButton();
//        testPage.completeFirstPartOfRegistration(Data.email, Data.password);
//        testPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.username,10), Data.phone,
//                Data.day, Data.month, Data.year, Data.city, Data.location);
////        testPage.clickNextButton(); // Next button not working
//    }

    //***************************************************************************
    //Lesson 18
    //***************************************************************************


    @Test
    public void testArticlesAndTitles() {
        mainPage.clickLinkBlog();
        System.out.println("--- Clicking all links from 'BLOG' page ---");
        List<WebElement> links = testPage.collectAllLinksOfArticles();
        System.out.println("Number of links: " + "List size: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            nameOfArticle = links.get(i).getText();
            System.out.println(i + 1 + ". " + nameOfArticle);
            links.get(i).click();
            if (nameOfArticle.contains("Advertising")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Advertising's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedAdvertising);
            }
            if (nameOfArticle.contains("Terms of use")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedTermsOfUse);
            }
            if (nameOfArticle.contains("Privacy Policy")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedPrivacyPolicy);
            }
            if (nameOfArticle.contains("How it works")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHowItWorks);
            }
            if (nameOfArticle.contains("Shipping terms")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("ShippingTerms's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedShippingTerms);
            }
            if (nameOfArticle.contains("Travel to Ukraine")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("TravelToUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedTravelToUkraine);
            }
            if (nameOfArticle.contains("Blog")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Blog's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedBlog);
            }
            if (nameOfArticle.contains("Kharkov dating agency")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KharkovDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedKharkovDatingAgency);
            }
            if (nameOfArticle.contains("Kiev dating agency")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KievDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedKievDatingAgency);
            }
            if (nameOfArticle.contains("Odessa dating agency")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("OdessaDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedOdessaDatingAgency);
            }
            if (nameOfArticle.contains("Mail order girls")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("MailOrderGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedMailOrderGirls);
            }
            if (nameOfArticle.contains("Beautiful urkainian girls")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("BeautifulUkrainianGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedBeautifulUkrainianGirls);
            }
            if (nameOfArticle.contains("Real Ukrainian brides")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("RealUkrainianBrides' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedRealUkrainianBrides);
            }
            if (nameOfArticle.contains("Eastern European women")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("EasternEuropeanWomen's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedEasternEuropeanWomen);
            }
            if (nameOfArticle.contains("Marriage agency in Ukraine")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("MarriageAgencyUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedMarriageAgencyUkraine);
            }
            if (nameOfArticle.contains("Kiev dating site")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KievDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedKievDatingSite);
            }
            if (nameOfArticle.contains("Find Ukrainian girlfriend")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("FindUkrainianGirlfriend's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedFindUkrainianGirlfriend);
            }
            if (nameOfArticle.contains("Slavic women for marriage")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedSlavicWomenMarriage);
            }
            if (nameOfArticle.contains("How to marry Ukrainian lady")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHowToMarryUkrainianLady);
            }
            if (nameOfArticle.contains("Free Ukrainian dating site")) {
                actualTitle = blogPage.getAnyTitle();
                System.out.println("FreeUkrainianDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedFreeUkrainianDatingSite);
            }
            if (nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
                actualTitle = driver.findElement(By.xpath("//h2")).getText();
                System.out.println("9Factors' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expected9Factors);
            }
            if (nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")) {
                actualTitle = driver.findElement(By.xpath("//span[contains(text(),'You may have asked yourself if dating and courting')]")).getText();
                System.out.println("Difference's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedDifference);
            }

            driver.get(Data.BLOG_PAGE);
            blogPage.javaWaitSec(1);
            links = testPage.collectAllLinksOfArticles();

        }
    }

    @Test
    public void testBlogPage() {
        linkTextBlog = mainPage.verifyLinkBlog();
        Assert.assertEquals(linkTextBlog, Data.expectedLinkTextBlog);
        mainPage.clickLinkBlog();
        titleBlog = blogPage.verifyTitleBlog();
        Assert.assertEquals(titleBlog, Data.expectedPageTitleBlog);
        urlBlog = blogPage.verifyUrlBlog();
        Assert.assertEquals(urlBlog, Data.expectedUrlBlog);
//        blogPage.testLinksOnBlogPage();
        blogPage.collectAllLinksBlogPage();
    }

    @Test
    public void clickAllLinksBlogPage() {
        driver.get(Data.BLOG_PAGE);
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_LINKS);
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);
            links.get(i).click();
            driver.get(Data.BLOG_PAGE);
            links = driver.findElements(Locators.BLOG_ALL_LINKS);

        }
    }


    @Test
    public void clickAllLinksBlogPage2() {
        driver.get(Data.BLOG_PAGE);
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);
            links.get(i).click();
            driver.get(Data.BLOG_PAGE);
            links = driver.findElements(Locators.BLOG_ALL_LINKS);

        }

    }

    @Test
    public void checkHeaderMenuTabsVERSION2() {
        testPage.checkHeaderMenuTabsVERSION2();
    }

    @Test
    public void checkLeftMenuGroup() {
        driver.get(Data.HOW_WE_WORK_PAGE);
        System.out.println("--- Checking Left Menu Group ---");
        WebElement open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
        open_menu_btn.click();
        List<WebElement> links = testPage.collectLeftMenuGroupLinks();
        System.out.println("Number of links in Left Menu Group: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);
            links.get(i).click();
            if (info.contains("HOME")) {
                actualTitle = driver.getTitle();
                System.out.println("HOME's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedHOME);
            }
            if (info.contains("SIGN UP")) {
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SIGN UP's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedSIGN_UP);
            }
            if (info.contains("LOGIN")) {
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("LOGIN's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedLOGIN);
            }
            if (info.contains("NEWS")) {
                actualTitle = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9']")).getText();
                System.out.println("NEWS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedNEWS);
            }
            if (info.contains("POLLS")) {
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("POLLS's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedPOLLS);
            }
            driver.get(Data.HOW_WE_WORK_PAGE);
            open_menu_btn = driver.findElement(Locators.OPEN_MENU_BTN);
            open_menu_btn.click();
            links = testPage.collectLeftMenuGroupLinks();
            testPage.javaWaitSec(2);
        }
        WebElement close_menu_btn = driver.findElement(Locators.CLOSE_MENU_BTN);
        close_menu_btn.click();
    }

    @Test
    public void testMediaPageM() {
        driver.get(Data.MEDIA_PAGE);
        mainPage.getDropDownListByIndex(By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']"), 0, 0);
        mainPage.getDropDownListByIndex(By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']"), 1, 0);
        mainPage.getDropDownListByIndex(By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']"), 2, 0);

    }


    @Test //from Alexei
    public void testMediaPageAuto1() {
        mainPage.clickLinkPhotos();
        List<WebElement> links = driver.findElements(Locators.MEDIA_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i + 1 + ". " + info);

            if (i != 0) {
                links.get(i).click();
            }

            // Choose criteria of sorting
            if (!info.contains("Albums")) {
                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                for (int j = 0; j < sizeOfSortByDropDownList; j++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    mediaPage.selectByIndex(sortByList, j);
                    mediaPage.javaWaitSec(1);
                }
            } else if (info.contains("Albums")) {
                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                for (int k = 1; k < sizeOfSortByDropDownList; k++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                    mediaPage.selectByIndex(sortByList, k);
                    mediaPage.javaWaitSec(1);

                    int sizeOfSortByDropDownList2 = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    for (int p = 0; p < sizeOfSortByDropDownList2; p++) {
                        WebElement sortByList2 = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                        mediaPage.selectByIndex(sortByList2, p);
                        mediaPage.javaWaitSec(1);
                    }
                }
            }
            // Click on 'ArrowDown' button
            mediaPage.javaWaitSec(2);
            WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
            arrowDownSorter.click();
            // Click on 'ArrowUp' button
            mainPage.javaWaitSec(2);
            WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
            arrowUpSorter.click();
            links = driver.findElements(Locators.MEDIA_LINKS);
        }
    }


    //***************************************************************************
    //Lesson 22
    //***************************************************************************
    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class)
    public void searchDifferentResults13(String minAge, String maxAge, String sortBy) { //searchPage
        System.out.println("testCase13");
        System.out.println("priority 3");
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);

        mainPage.clickLinkSearch();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX), maxAge);
        searchPage.clickMainSearchButton();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
//        searchPage.clickMainSearchButton();

        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);
        System.out.println("Number of users: " + infoAboutUser.size() / 2);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String[] splittedPhrase = info.split(", ");
                String age = splittedPhrase[1];
                int ageNum = Integer.parseInt(age);

                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + " is correct.");
                } else {
                    Assert.fail("Wrong age: " + ageNum);
                }

            }
            mainPage.javaWaitSec(1);

            infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);

        }
    }

    @Test
    public void testUserTabs() { // photos  43:00
        mainPage.clickLinkPhotos();
        List<WebElement> links = driver.findElements(Locators.MEDIA_LINKS);
        System.out.println("Number of links: " + links.size());
        actualTitle = mediaPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);
        System.out.println("Actual title is: " + actualTitle);
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            actualTitle = mediaPage.getAnyTitle();
            System.out.println("Actual title is: " + actualTitle);
            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }
            links = driver.findElements(Locators.MEDIA_LINKS);

            // Choose criteria of sorting
            if(!info.contains("Albums")){
                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                for (int j = 0; j < sizeOfSortByDropDownList; j++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    mediaPage.selectByIndex(sortByList, j);
                }
            }
            else if(info.contains("Albums")){
                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                for (int k = 1; k < sizeOfSortByDropDownList; k++) {
                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
                    mediaPage.selectByIndex(sortByList, k);

                    int sizeOfSortByDropDownList2 = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                    for (int p = 0; p < sizeOfSortByDropDownList2; p++) {
                        WebElement sortByList2 = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
                        mediaPage.selectByIndex(sortByList2, p);
                    }
                }
            }
            // Click on 'ArrowDown' button
            WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
            arrowDownSorter.click();
            // Click on 'ArrowUp' button
            WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
            arrowUpSorter.click();
            links = driver.findElements(Locators.MEDIA_LINKS);

        }
    }

    //***************************************************************************
    //Lesson 23
    //***************************************************************************
    @Test
    public void testUserTabs23() { // photos  43:00
        mainPage.clickLinkPhotos();
        List<WebElement> links = driver.findElements(Locators.MEDIA_LINKS);
        System.out.println("Number of links: " + links.size());
        actualTitle = mediaPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);
        System.out.println("Actual title is: " + actualTitle);
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            actualTitle = mediaPage.getAnyTitle();
            System.out.println("Actual title is: " + actualTitle);
            if (actualTitle.contains(Data.expectedTitleGallery) || actualTitle.contains(Data.expectedTitlePhotoGallery)
                    || actualTitle.contains(Data.expectedTitleVideoGallery) || actualTitle.contains(Data.expectedTitleGalleryAlbums)) {
                System.out.println("Title is valid: " + actualTitle);
            } else {
                Assert.fail("Title is not valid,");
            }


                /*Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }*/
            links = driver.findElements(Locators.MEDIA_LINKS);

//            // Choose criteria of sorting
//            if(!info.contains("Albums")){
//                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                for (int j = 0; j < sizeOfSortByDropDownList; j++) {
//                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                    mediaPage.selectByIndex(sortByList, j);
//                }
//            }
//            else if(info.contains("Albums")){
//                int sizeOfSortByDropDownList = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
//                for (int k = 1; k < sizeOfSortByDropDownList; k++) {
//                    WebElement sortByList = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS);
//                    mediaPage.selectByIndex(sortByList, k);
//
//                    int sizeOfSortByDropDownList2 = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                    for (int p = 0; p < sizeOfSortByDropDownList2; p++) {
//                        WebElement sortByList2 = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORTER);
//                        mediaPage.selectByIndex(sortByList2, p);
//                    }
//                }
//            }
//            // Click on 'ArrowDown' button
//            WebElement arrowDownSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_DOWN);
//            arrowDownSorter.click();
//            // Click on 'ArrowUp' button
//            WebElement arrowUpSorter = driver.findElement(Locators.PHOTO_SORTER_ARROW_UP);
//            arrowUpSorter.click();
//            links = driver.findElements(Locators.MEDIA_LINKS);

        }
    }

    @Test
    public void  checkAllRefineFilters(){
        driver.navigate().to("https://stopandshop.com/coupons-weekly-circular/digital-coupons/#/available");
        WebElement refineButton = driver.findElement(By.cssSelector(".c-sort-filter.c-sort-filter--min-300"));
        refineButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        mainPage.javaWaitSec(1);
        List<WebElement> checkBoxFiltersList =
                driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        System.out.println("Number of unchecked check boxes: " + checkBoxFiltersList.size());

        for (int i = 0; i <checkBoxFiltersList.size() ; i++) {
            Actions action = new Actions(driver);
            action.moveToElement(checkBoxFiltersList.get(i)).click().perform();
            mainPage.javaWaitSec(1);
            js.executeScript("window.scrollBy(0, 500)");
            mainPage.javaWaitSec(1);
            checkBoxFiltersList =
                    driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        }

        // Assert if all checkboxes are checked
        List<WebElement> checkBoxFiltersListChecked =
                driver.findElements(By.xpath("//div[@class='c-checkbox']//input[@checked='true']"));
        System.out.println("Number of checked check boxes:   " + checkBoxFiltersList.size());

        Assert.assertEquals(checkBoxFiltersListChecked.size(), checkBoxFiltersList.size());

    }





}
