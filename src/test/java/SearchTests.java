import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{
    String linkSearch;
    String titleSearch;
    String urlSearch;

    @Test
    public void testSearchPage(){
        linkSearch = mainPage.verifyLinkSearch();
        Assert.assertEquals(linkSearch, Data.expectedLinkTextSearch);
        mainPage.clickLinkSearch();
        titleSearch = searchPage.verifyTitleSearch();
        Assert.assertEquals(titleSearch, Data.expectedPageTitleSearch);
        urlSearch = searchPage.verifyUrlSearch();
        Assert.assertEquals(urlSearch, Data.expectedUrlSearch);
        searchPage.selectRandomMinAge();
        searchPage.selectRandomMaxAge();
        searchPage.selectRandomSortBy();
//        searchPage.testLinksOnSearchPage();
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

    @Test(enabled = false)
    public void selectRandomDropDownList(){
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            System.out.print(i+1 + ". ");
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(2);//
        }
    }


}
