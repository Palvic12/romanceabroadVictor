package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTests extends BaseUI{
    String linkJoinButton;



    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    public  void testRegistration2(String email, String username, boolean requirement){
        System.out.println(email);
        SoftAssert softAssert = new SoftAssert();
        linkJoinButton = mainPage.verifyLinkJoinButton();
        softAssert.assertEquals(linkJoinButton, Data.expectedLinkTextRegistration);
        softAssert.assertAll();
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, Data.password);
        if (!requirement){
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR_MESSAGE).isDisplayed());
        } else {
            mainPage.clickNextButton1();
            mainPage.completeSecondPartOfRegistration(username, Data.phone,
                    Data.day, Data.month, Data.year, Data.city, Data.location);
//        mainPage.clickNextButton2(); // Next button not working
        }

    }

    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public  void testRegistration(String email, String password, String day, String month, String year,
                                  String phone, String city, String location){
        SoftAssert softAssert = new SoftAssert();
        linkJoinButton = mainPage.verifyLinkJoinButton();
        softAssert.assertEquals(linkJoinButton, Data.expectedLinkTextRegistration);
        softAssert.assertTrue(driver.findElement(Locators.JOIN_TODAY_LINK).isDisplayed(), "Element is not displayed");
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.clickNextButton1();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.username,5), phone,
                day, month, year, city, location);
//        mainPage.clickNextButton(); // Next button not working
        softAssert.assertAll();
    }





}
