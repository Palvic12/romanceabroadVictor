import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    @Test
    public  void testMedia(){
        mainPage.clickPhotosLink();
        mediaPage.verifyPhotosTitleUrl();
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
