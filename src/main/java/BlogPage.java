import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogPage extends BaseActions{
    String currentUrlBlog;
    String currentPageTitleBlog;
    String actualTitle;

    public BlogPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public String verifyTitleBlog(){
        // Verify 'BLOG' page Title
        System.out.println("--- Verifying 'BLOG' page Title ---");
        currentPageTitleBlog = driver.getTitle();
        System.out.println("Current PageTitle of 'BLOG' page is:  '" + currentPageTitleBlog + "'");
        System.out.println("Expected PageTitle of 'BLOG' page is: '" + Data.expectedPageTitleBlog + "'");
        if (currentPageTitleBlog.equals(Data.expectedPageTitleBlog)){
            System.out.println("Current  PageTitle of 'BLOG' page is equal to expected PageTitle of 'BLOG' page.");
        }
        else {
            System.out.println("Current  PageTitle of 'BLOG' page is NOT equal to expected PageTitle of 'BLOG' page.");
        }
        return currentPageTitleBlog;
    }

    public String verifyUrlBlog(){
        // Verifying 'BLOG' page current url
        System.out.println("--- Verifying 'BLOG' page current url ---");
        currentUrlBlog = driver.getCurrentUrl();

        System.out.println("Current Url of 'BLOG' page is:  '" + currentUrlBlog + "'");
        System.out.println("Expected Url of 'BLOG' page is: '" + Data.expectedUrlBlog + "'");
        if (currentUrlBlog.equals(Data.expectedUrlBlog)){
            System.out.println("Current Url of 'BLOG' page is equal to expected url of 'BLOG' page.");
        }
        else {
            System.out.println("Current Url of 'BLOG' page is NOT equal to expected url of 'BLOG' page.");
        }
        return currentUrlBlog;

    }

    @Test
    public void testLinksOnBlogPage(){
        System.out.println("--- Testing links on 'BLOG' page ---");
        checkLinksOnWebPage("//a", "href");
        checkLinksOnWebPage("//img", "src");
    }

    public void clickAllLinksBlogPage(){ // How to move assertion to test classes in this case???
        // Clicking all links in 'Blog' info content block
        System.out.println("--- Clicking all links from 'BLOG' page ---");
        List<WebElement> links = driver.findElements(Locators.ALL_LINKS);
        System.out.println("List size: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(i+1 + ". " + info);
            links.get(i).click();
            if (info.contains("Kharkov dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KharkovDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKharkovDatingAgency);
            }
            if (info.contains("Kiev dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KievDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingAgency);
            }
            if (info.contains("Odessa dating agency")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("OdessaDatingAgency's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedOdessaDatingAgency);
            }
            if (info.contains("Mail order girls")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("MailOrderGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMailOrderGirls);
            }
            if (info.contains("Beautiful urkainian girls")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("BeautifulUkrainianGirls' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedBeautifulUkrainianGirls);
            }
            if (info.contains("Real Ukrainian brides")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("RealUkrainianBrides' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedRealUkrainianBrides);
            }
            if (info.contains("Eastern European women")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("EasternEuropeanWomen's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedEasternEuropeanWomen);
            }
            if (info.contains("Marriage agency in Ukraine")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("MarriageAgencyUkraine's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedMarriageAgencyUkraine);
            }
            if (info.contains("Kiev dating site")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("KievDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedKievDatingSite);
            }
            if (info.contains("Find Ukrainian girlfriend")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("FindUkrainianGirlfriend's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFindUkrainianGirlfriend);
            }
            if (info.contains("Slavic women for marriage")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedSlavicWomenMarriage);
            }
            if (info.contains("How to marry Ukrainian lady")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("SlavicWomenForMarriage's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedHowToMarryUkrainianLady);
            }
            if (info.contains("Free Ukrainian dating site")){
                actualTitle = driver.findElement(By.xpath("//h1")).getText();
                System.out.println("FreeUkrainianDatingSite's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedFreeUkrainianDatingSite);
            }
            if (info.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//h2")).getText();
                System.out.println("9Factors' actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expected9Factors);
            }
            if (info.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")){
                actualTitle = driver.findElement(By.xpath("//span[contains(text(),'You may have asked yourself if dating and courting')]")).getText();
                System.out.println("Difference's actual title is: " + actualTitle);
                Assert.assertEquals(actualTitle,Data.expectedDifference);
            }

            driver.navigate().to(currentUrlBlog);
            links = driver.findElements(Locators.ALL_LINKS);
        }
    }

}
