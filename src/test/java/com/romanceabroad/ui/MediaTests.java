package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MediaTests extends BaseUI {
    String linkPhotos;
    String titlePhotos;
    String urlPhotos;
    String actualTitle;



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

    @Test
    public void testUserTabs() {
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
            if (i == 0){
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
                String textMedia = driver.findElement(Locators.TEXT_MEDIA).getText();
                if (textMedia.contains(Data.textMedia)){
                    System.out.println("Text media is correct!");
                }
                Assert.assertTrue(textMedia.contains(Data.textMedia), "Text media is NOT correct!");
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
                mainPage.javaWaitSec(2);
                Assert.assertTrue(driver.findElement(Locators.MEDIA_ALBUM).isDisplayed());
            }
            links = driver.findElements(Locators.MEDIA_LINKS);
        }
    }



}
