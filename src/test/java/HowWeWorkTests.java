import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI{
    String linkHowWeWork;
    String titleHowWeWork;
    String urlHowWeWork;

    @Test
    public void testHowWeWork() {
        linkHowWeWork = mainPage.verifyLinkHowWeWork();
        Assert.assertEquals(linkHowWeWork, Data.expectedLinkTextHowWeWork);
        mainPage.clickLinkHowWeWork();
        titleHowWeWork = howWeWorkPage.verifyTitleHowWeWork();
        Assert.assertEquals(titleHowWeWork, Data.expectedPageTitleHowWeWork);
        urlHowWeWork = howWeWorkPage.verifyUrlHowWeWork();
        Assert.assertEquals(urlHowWeWork, Data.expectedUrlHowWeWork);
//        howWeWorkPage.testLinksOnHowWeWorkPage();
        howWeWorkPage.checkLeftMenuGroup();
        howWeWorkPage.checkHeaderMenuTabsVERSION1();
//        howWeWorkPage.checkHeaderMenuTabsVERSION2(); // is not working
        howWeWorkPage.checkInnerMenuLinks();
        howWeWorkPage.checkFooterMenuTabs();
        howWeWorkPage.verifyLanguage();
    }

}
