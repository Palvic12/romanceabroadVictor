import org.testng.annotations.Test;


public class TestTests extends BaseUI{ //extends BaseUI
    String currentUrlSearch;



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
    public void selectRandomDropDownList(){
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i+1 + ". ");
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








}
