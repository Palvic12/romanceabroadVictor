import org.testng.annotations.Test;

public class SearchTests extends BaseUI{
    String currentPageTitleSearch;
    String currentUrlSearch;

    @Test
    public void testSearchPage(){
        mainPage.clickSearchLink();
        searchPage.verifySearchTitleUrl();
        searchPage.selectAge();
        searchPage.sortingCriteria();
        searchPage.sortASC();
        searchPage.sortDESC();
        searchPage.clickListViewLink();
        searchPage.clickGalleryViewLink();
        searchPage.clickNextPageSortBlock();
        searchPage.clickPreviousPageSortBlock();
        searchPage.clickLastPagePagination();
        searchPage.clickFirstPagePagination();
        searchPage.clickNextPagePagination();
        searchPage.clickPreviousPagePagination();
    }
}
