import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    @Test
    public  void testBlogPage(){
        mainPage.clickBlogLink();
        blogPage.verifyBlogTitleUrl();
        blogPage.clickAllLinksBlogPage();





//        driver.findElement(Locators.LINK_BLOG).click();
//        currentUrlBlog = driver.getCurrentUrl();
//        System.out.println("Current Url of 'BLOG' page is:  " + currentUrlBlog);
//        System.out.println("Expected Url of 'BLOG' page is: " + Data.expectedUrlBlog);
//        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }
}
