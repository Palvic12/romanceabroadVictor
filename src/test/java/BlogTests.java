import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {
    String linkTextBlog;
    String titleBlog;
    String urlBlog;

    @Test
    public  void testBlogPage(){
        linkTextBlog = mainPage.verifyLinkBlog();
        Assert.assertEquals(linkTextBlog, Data.expectedLinkTextBlog);
        mainPage.clickLinkBlog();
        titleBlog = blogPage.verifyTitleBlog();
        Assert.assertEquals(titleBlog, Data.expectedPageTitleBlog);
        urlBlog = blogPage.verifyUrlBlog();
        Assert.assertEquals(urlBlog, Data.expectedUrlBlog);
//        blogPage.testLinksOnBlogPage();
        blogPage.clickAllLinksBlogPage();
    }
}
