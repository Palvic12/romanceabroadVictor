import org.testng.annotations.Test;

public class GiftTests extends BaseUI {

    @Test
    public  void testGiftPage(){
        mainPage.clickGiftsLink();
        giftPage.verifyGiftsTitleUrl();
    }

}
