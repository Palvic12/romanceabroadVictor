import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    @Test
    public  void testTourPage(){
        mainPage.clickTourToUkraineLink();
        tourPage.verifyTourToUkraineTitleUrl();
    }
}
