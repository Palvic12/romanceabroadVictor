package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SearchTests extends BaseUI {
    String linkSearch;
    String titleSearch;
    String urlSearch;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;

    @Test(priority = 2, enabled = testCase12, groups = {"ie"})
    public void testSearchPageTestCase12() {
        SoftAssert softAssert = new SoftAssert();
        linkSearch = mainPage.verifyLinkSearch();
        softAssert.assertEquals(linkSearch, Data.expectedLinkTextSearch, "Wrong Link Text!");
        softAssert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkSearch();
        titleSearch = searchPage.verifyTitleSearch();
        softAssert.assertEquals(titleSearch, Data.expectedPageTitleSearch, "Wrong title!");
        urlSearch = searchPage.verifyUrlSearch();
        softAssert.assertEquals(urlSearch, Data.expectedUrlSearch, "Wrong URL!");
//        searchPage.selectRandomMinAge();
//        searchPage.selectRandomMaxAge();
//        searchPage.selectRandomSortBy();
//        searchPage.testLinksOnSearchPage();
        searchPage.selectAge();
        searchPage.sortingCriteria();
        searchPage.sortASC();
        searchPage.sortDESC();
        searchPage.clickListViewLink();
        searchPage.clickGalleryViewLink();
        searchPage.clickNextPageSortBlock();
        searchPage.clickPreviousPageSortBlock();
        searchPage.clickLastPagePagination();
        searchPage.clickFirstPagePagination();
        searchPage.clickNextPagePagination();
        searchPage.clickPreviousPagePagination();
        System.out.println("testCase12");
        System.out.println("priority 2");
        softAssert.assertAll();
    }

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 3, enabled = testCase13, groups = {"user", "admin"})
    public void searchDifferentResults13(String minAge, String maxAge, String sortBy) {
        System.out.println("testCase13");
        System.out.println("priority 3");
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);

        mainPage.clickLinkSearch();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX), maxAge);
//        searchPage.clickMainSearchButton();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
        searchPage.clickMainSearchButton();

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
            mainPage.javaWaitSec(3);

            infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);

        }

    }

    @Test(priority = 1, enabled = testCase11, groups = {"user", "admin"})
    public void selectRandomDropDownListOnSearchPageTestCase11() {
        mainPage.clickLinkSearch();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i + 1 + ". ");
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(2);//
        }
        System.out.println("testCase11");
        System.out.println("priority 1");
    }

    @Test
    public void testSplit() {
        String info = "Name, 23";
        String[] splittedPhrase = info.split(", ");
        String age = splittedPhrase[1];
        System.out.println(age);
    }


}
