import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {
    String linkSignIn;
    String signInErrorAlert;

    @Test
    public void testSignIn(){
        linkSignIn = mainPage.verifyLinkSignIn();
        Assert.assertEquals(linkSignIn, Data.expectedLinkTextSignIn);
        mainPage.clickLinkSignIn();
        signInPage.completeFormSignIn();
        signInErrorAlert = signInPage.ckeckErrorSignIn();
        Assert.assertEquals(signInErrorAlert, Data.expectedSignInErrorAlert);
    }
}
