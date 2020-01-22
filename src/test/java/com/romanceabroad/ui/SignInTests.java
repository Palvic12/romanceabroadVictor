package com.romanceabroad.ui;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignInTests extends BaseUI {
    String linkSignIn;
    String signInErrorAlert;

    @Test
    public void testSignIn(){
        SoftAssert softAssert = new SoftAssert();
        linkSignIn = mainPage.verifyLinkSignIn();
        softAssert.assertEquals(linkSignIn, Data.expectedLinkTextSignIn, "Wrong Link Text!");
        softAssert.assertTrue(driver.findElement(Locators.LINK_SIGN_IN).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkSignIn();
        signInPage.completeFormSignIn();
        signInErrorAlert = signInPage.ckeckErrorSignIn();
        softAssert.assertEquals(signInErrorAlert, Data.expectedSignInErrorAlert, "Wrong Alert!");
        softAssert.assertAll();
    }
}
