import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;

public class BlogPage extends BaseActions{
    String currentUrlBlog;
    String currentPageTitleBlog;


    public BlogPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void verifyBlogTitleUrl(){
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
        Assert.assertEquals(currentPageTitleBlog, Data.expectedPageTitleBlog);

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
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

    public void clickAllLinksBlogPage(){
        // Clicking all links in 'Blog' info content block
        List<WebElement> links = driver.findElements(By.cssSelector("div.info-content-block.wysiwyg>ul>li>a"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.navigate().to(currentUrlBlog);
            links = driver.findElements(By.cssSelector("div.info-content-block.wysiwyg>ul>li>a"));
        }
    }

}
