import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {
    String linkGifts;
    String titleGifts;
    String urlGifts;

    @Test
    public  void testGiftPage(){
        linkGifts = mainPage.verifyLinkGifts();
        Assert.assertEquals(linkGifts, Data.expectedLinkTextGifts);
        mainPage.clickGiftsLink();
        titleGifts = giftPage.verifyTitleGifts();
        Assert.assertEquals(titleGifts, Data.expectedPageTitleGifts);
        urlGifts = giftPage.verifyUrlGifts();
//        giftPage.testLinksOnGiftsPage();
        Assert.assertEquals(urlGifts, Data.expectedUrlGifts);
        giftPage.checkBestsellersLinks();
    }

}
