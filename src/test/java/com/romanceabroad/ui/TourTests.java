package com.romanceabroad.ui;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TourTests extends BaseUI {
    String linkTourToUkraine;
    String titleTourToUkraine;
    String urlTourToUkraine;

    @Test
    public  void testTourPage(){
        SoftAssert softAssert = new SoftAssert();
        linkTourToUkraine = mainPage.verifyLinkTourToUkraine();
        softAssert.assertEquals(linkTourToUkraine, Data.expectedLinkTextTour, "Wrong Link Text!");
        mainPage.clickLinkTourToUkraine();
        titleTourToUkraine = tourPage.verifyTitleTourToUkraine();
        softAssert.assertEquals(titleTourToUkraine, Data.expectedPageTitleTour, "Wrong title!");
        urlTourToUkraine = tourPage.verifyUrlTourToUkraine();
//        tourPage.testLinksOnTourToUkrainePage();
        softAssert.assertEquals(urlTourToUkraine, Data.expectedUrlTour, "Wrong URL!");
        tourPage.verifyRelatedItems();
        softAssert.assertAll();
    }
}
