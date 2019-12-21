import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI{

    @Test
    public void testHowWeWork() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.verificationHowWeWorkPage();
        howWeWorkPage.checkInnerMenuLinks();
    }
}
