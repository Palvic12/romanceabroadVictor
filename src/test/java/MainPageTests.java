import org.testng.annotations.Test;

public class MainPageTests extends BaseUI{

    @Test
    public void testMainPage(){
        mainPage.checkHeartRomanceAbroadHeader();
        mainPage.checkYouTubeVideo();
        mainPage.checkRequestTourInfoButton();
    }

}


