package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GiftTests extends BaseUI {
    String linkGifts;
    String titleGifts;
    String urlGifts;

    @DataProvider(name = "SearchGifts")
    public static Object[][] searchGifts() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("SearchGifts.csv")).stream().forEach(s-> {

            String[] data = s.split(",");
            out.add(new Object[]{data[0]});

        });

        return out.toArray(new Object[out.size()][]);
    }

    @Test(dataProvider = "SearchGifts")
    public  void testGiftPage(String gift){
        SoftAssert softAssert = new SoftAssert();
        linkGifts = mainPage.verifyLinkGifts();
        softAssert.assertEquals(linkGifts, Data.expectedLinkTextGifts);
        softAssert.assertTrue(driver.findElement(Locators.LINK_GIFT).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkGifts();
        titleGifts = giftPage.verifyTitleGifts();
        softAssert.assertEquals(titleGifts, Data.expectedPageTitleGifts);
        urlGifts = giftPage.verifyUrlGifts();
        softAssert.assertEquals(urlGifts, Data.expectedUrlGifts);
//        giftPage.checkBestsellersLinks();
        giftPage.searchGifts(gift);
//        giftPage.testLinksOnGiftsPage();
        softAssert.assertAll();
    }

}
