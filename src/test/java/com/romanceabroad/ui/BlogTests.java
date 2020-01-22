package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class BlogTests extends BaseUI {
    String linkTextBlog;
    String titleBlog;
    String urlBlog;
    String nameOfArticle;
    String actualTitle;

    @Test
    public  void testBlogPage(){
        SoftAssert softAssert = new SoftAssert();
        linkTextBlog = mainPage.verifyLinkBlog();
        softAssert.assertEquals(linkTextBlog, Data.expectedLinkTextBlog);
        softAssert.assertTrue(driver.findElement(Locators.LINK_BLOG).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkBlog();
        titleBlog = blogPage.verifyTitleBlog();
        softAssert.assertEquals(titleBlog, Data.expectedPageTitleBlog);
        urlBlog = blogPage.verifyUrlBlog();
        softAssert.assertEquals(urlBlog, Data.expectedUrlBlog);
//        blogPage.testLinksOnBlogPage();
//        blogPage.clickAllLinksBlogPage();
        softAssert.assertAll();
    }

    @Test
    public void testArticlesAndTitles(){
        Assert.assertTrue(driver.findElement(Locators.LINK_BLOG).isDisplayed(), "Element is not displayed");
        mainPage.clickLinkBlog();
        System.out.println("--- Clicking all links from 'BLOG' page ---");
        List<WebElement> links = blogPage.collectAllLinksBlogPage();
        System.out.println("Number of links: " + "List size: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            nameOfArticle = links.get(i).getText();
            System.out.println(i+1 + ". " + nameOfArticle);
            links.get(i).click();
            if (nameOfArticle.contains("Advertising")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Advertising's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedAdvertising, "Wrong title!");
            }
            if (nameOfArticle.contains("Terms of use")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Terms of use's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTermsOfUse, "Wrong title!");
            }
            if (nameOfArticle.contains("Privacy Policy")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("PrivacyPolicy's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedPrivacyPolicy, "Wrong title!");
            }
            if (nameOfArticle.contains("How it works")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("HowItWorks's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowItWorks, "Wrong title!");
            }
            if (nameOfArticle.contains("Shipping terms")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("ShippingTerms's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedShippingTerms, "Wrong title!");
            }
            if (nameOfArticle.contains("Travel to Ukraine")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("TravelToUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedTravelToUkraine, "Wrong title!");
            }
            if (nameOfArticle.contains("Blog")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("Blog's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBlog, "Wrong title!");
            }
            if (nameOfArticle.contains("Kharkov dating agency")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KharkovDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKharkovDatingAgency, "Wrong title!");
            }
            if (nameOfArticle.contains("Kiev dating agency")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KievDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingAgency, "Wrong title!");
            }
            if (nameOfArticle.contains("Odessa dating agency")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("OdessaDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedOdessaDatingAgency, "Wrong title!");
            }
            if (nameOfArticle.contains("Mail order girls")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("MailOrderGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMailOrderGirls, "Wrong title!");
            }
            if (nameOfArticle.contains("Beautiful urkainian girls")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("BeautifulUkrainianGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBeautifulUkrainianGirls, "Wrong title!");
            }
            if (nameOfArticle.contains("Real Ukrainian brides")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("RealUkrainianBrides' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedRealUkrainianBrides, "Wrong title!");
            }
            if (nameOfArticle.contains("Eastern European women")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("EasternEuropeanWomen's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedEasternEuropeanWomen, "Wrong title!");
            }
            if (nameOfArticle.contains("Marriage agency in Ukraine")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("MarriageAgencyUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMarriageAgencyUkraine, "Wrong title!");
            }
            if (nameOfArticle.contains("Kiev dating site")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("KievDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingSite, "Wrong title!");
            }
            if (nameOfArticle.contains("Find Ukrainian girlfriend")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("FindUkrainianGirlfriend's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFindUkrainianGirlfriend, "Wrong title!");
            }
            if (nameOfArticle.contains("Slavic women for marriage")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle, Data.expectedSlavicWomenMarriage, "Wrong title!");
            }
            if (nameOfArticle.contains("How to marry Ukrainian lady")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowToMarryUkrainianLady, "Wrong title!");
            }
            if (nameOfArticle.contains("Free Ukrainian dating site")){
                actualTitle = blogPage.getAnyTitle();
                System.out.println("FreeUkrainianDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFreeUkrainianDatingSite, "Wrong title!");
            }
            if (nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//h2")).getText();
                System.out.println("9Factors' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expected9Factors, "Wrong title!");
            }
            if (nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//span[contains(text(),'You may have asked yourself if dating and courting')]")).getText();
                System.out.println("Difference's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedDifference, "Wrong title!");
            }

            driver.get(Data.BLOG_PAGE);
            blogPage.javaWaitSec(1);
            links = blogPage.collectAllLinksBlogPage();
        }
    }

}
