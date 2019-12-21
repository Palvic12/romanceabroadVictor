import org.testng.annotations.Test;

public class SignInTests extends BaseUI {
    String currentLinkTextSignIn;

    @Test
    public void testSignIn(){
        mainPage.clickSignInLink();
        signInPage.completeSignInForm();
        signInPage.ckeckErrorSignIn();
    }
}
