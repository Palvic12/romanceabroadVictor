import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI{
    String titleBookNow;
    String linkRequestTourInfoButton;

    @Test
    public void testMainPage(){
        mainPage.verifyHeartRomanceAbroadHeader();
        mainPage.clickLinkBookNow();
        titleBookNow = mainPage.verifyTitleBookNow();
        Assert.assertEquals(titleBookNow,Data.expectedBOOKNOW);
//        mainPage.testLinksOnMainPage();
        mainPage.clickAllNavBarTabs();
        mainPage.checkYouTubeVideo();
        linkRequestTourInfoButton = mainPage.verifyLinkRequestTourInfoButton();
        Assert.assertEquals(linkRequestTourInfoButton, Data.expectedLinkTextRequestTourInfoButton);
        mainPage.clickRequestTourInfoButton();
        mainPage.clickJoinTodayLink();

    }




}


