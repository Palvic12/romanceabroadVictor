import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {
    String linkPhotos;
    String titlePhotos;
    String urlPhotos;

    @Test
    public  void testMedia(){
        linkPhotos = mainPage.verifyLinkPhotos();
        Assert.assertEquals(linkPhotos, Data.expectedLinkTextMedia);
        mainPage.clickLinkPhotos();
        titlePhotos = mediaPage.verifyTitlePhotos();
        Assert.assertEquals(titlePhotos, Data.expectedPageTitleMedia);
        urlPhotos = mediaPage.verifyUrlPhotos();
        Assert.assertEquals(urlPhotos, Data.expectedUrlMedia);
//        mediaPage.testLinksOnMediaPage();
        mediaPage.clickAllLink();
        mediaPage.photoSortDESC();
        mediaPage.photoSortASC();
        mediaPage.photoSortingCriteria();
        mediaPage.clickPhotoLink();
        mediaPage.photoSortDESC();
        mediaPage.photoSortASC();
        mediaPage.photoSortingCriteria();
        mediaPage.clickVideoLink();
        mediaPage.photoSortingCriteria();
        mediaPage.clickAlbumLink();
        mediaPage.sortAlbumsPortrait();
        mediaPage.photoSortingCriteria();
        mediaPage.photoSortDESC();
        mediaPage.photoSortASC();
        mediaPage.sortAlbumsAnimals();
        mediaPage.photoSortingCriteria();
        mediaPage.photoSortDESC();
        mediaPage.photoSortASC();
        mediaPage.sortAlbumsTravel();
        mediaPage.photoSortingCriteria();
        mediaPage.photoSortDESC();
        mediaPage.photoSortASC();
    }
}
