import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{
    String linkJoinButton;

    @Test
    public  void testRegistration(){
        linkJoinButton = mainPage.verifyLinkJoinButton();
        Assert.assertEquals(linkJoinButton, Data.expectedLinkTextRegistration);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
//        mainPage.clickNextButton(); // Next button not working
    }







}
