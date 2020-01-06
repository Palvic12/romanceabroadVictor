import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {
    String linkTourToUkraine;
    String titleTourToUkraine;
    String urlTourToUkraine;

    @Test
    public  void testTourPage(){
        linkTourToUkraine = mainPage.verifyLinkTourToUkraine();
        Assert.assertEquals(linkTourToUkraine, Data.expectedLinkTextTour);
        mainPage.clickLinkTourToUkraine();
        titleTourToUkraine = tourPage.verifyTitleTourToUkraine();
        Assert.assertEquals(titleTourToUkraine, Data.expectedPageTitleTour);
        urlTourToUkraine = tourPage.verifyUrlTourToUkraine();
//        tourPage.testLinksOnTourToUkrainePage();
        Assert.assertEquals(urlTourToUkraine, Data.expectedUrlTour);
        tourPage.verifyRelatedItems();
    }
}
