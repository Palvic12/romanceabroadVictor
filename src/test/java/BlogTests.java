import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    String currentLinkTextBlog;
    String currentUrlBlog;
    String currentPageTitleBlog;



    @Test
    public  void testBlogPage(){
        System.out.println("             *** test'BLOG' Page ***");
        // Verify 'BLOG' page LinkText
        System.out.println("--- Verifying 'TOUR TO UKRAINE' page LinkText ---");
        WebElement blogLink = driver.findElement(Locators.LINK_BLOG);
        currentLinkTextBlog = blogLink.getText();
        System.out.println("Current LinkText of 'BLOG' page is:  " + currentLinkTextBlog);
        System.out.println("Expected LinkText of 'BLOG' page is: " + Data.expectedLinkTextBlog);
        if (currentLinkTextBlog.equals(Data.expectedLinkTextBlog)){
            System.out.println("Current LinkText of 'BLOG' page is equal to expected LinkText of 'BLOG' page");
        }
        else {
            System.out.println("Current LinkText of 'BLOG' page is NOT equal to expected LinkText of 'BLOG' page");
        }
        Assert.assertEquals(currentLinkTextBlog, Data.expectedLinkTextBlog);
        // Click "BLOG" link
        blogLink.click();//
        // Verify 'BLOG' page Title
        System.out.println("--- Verifying 'BLOG' page Title ---");
        currentPageTitleBlog = driver.getTitle();
        System.out.println("Current PageTitle of 'BLOG' page is:  " + currentPageTitleBlog);
        System.out.println("Expected PageTitle of 'BLOG' page is: " + Data.expectedPageTitleBlog);
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
        System.out.println("Current Url of 'BLOG' page is:  " + currentUrlBlog);
        System.out.println("Expected Url of 'BLOG' page is: " + Data.expectedUrlBlog);
        if (currentUrlBlog.equals(Data.expectedUrlBlog)){
            System.out.println("Current Url of 'BLOG' page is equal to expected url of 'BLOG' page.");
        }
        else {
            System.out.println("Current Url of 'BLOG' page is NOT equal to expected url of 'BLOG' page.");
        }
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

//        driver.findElement(Locators.LINK_BLOG).click();
//        currentUrlBlog = driver.getCurrentUrl();
//        System.out.println("Current Url of 'BLOG' page is:  " + currentUrlBlog);
//        System.out.println("Expected Url of 'BLOG' page is: " + Data.expectedUrlBlog);
//        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }
}
