package com.romanceabroad.ui;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MediaTests extends BaseUI {
    String linkPhotos;
    String titlePhotos;
    String urlPhotos;



    @Test
    public  void testMedia(){
        SoftAssert softAssert = new SoftAssert();
        linkPhotos = mainPage.verifyLinkPhotos();
        softAssert.assertEquals(linkPhotos, Data.expectedLinkTextMedia, "Wrong Link Text!");
        softAssert.assertTrue(driver.findElement(Locators.LINK_MEDIA).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkPhotos();
        titlePhotos = mediaPage.verifyTitlePhotos();
        softAssert.assertEquals(titlePhotos, Data.expectedPageTitleMedia, "Wrong title!");
        urlPhotos = mediaPage.verifyUrlPhotos();
        softAssert.assertEquals(urlPhotos, Data.expectedUrlMedia, "Wrong URL!");
        mediaPage.testMediaPageAuto();
//        mediaPage.testLinksOnMediaPage();
        softAssert.assertAll();
    }
}
