import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {
    String currentLinkTextSignIn;

    @Test
    public void testSignIn(){
        // Click the 'SIGN IN' link
        WebElement signInLink = driver.findElement(Locators.LINK_SIGN_IN);
        signInLink.click();
        //Enter email
        WebElement textFieldSignInEmail = driver.findElement(Locators.TEXT_FIELD_SIGNIN_EMAIL);  // Email text field
        wait.until(ExpectedConditions.visibilityOf(textFieldSignInEmail));
        textFieldSignInEmail.click();
        textFieldSignInEmail.sendKeys(Data.email);
        //Enter password
        WebElement textFieldSignInPassword = driver.findElement(Locators.TEXT_FIELD_SIGNIN_PASSWORD); // Password text field
        wait.until(ExpectedConditions.elementToBeClickable(textFieldSignInPassword));
        textFieldSignInPassword.sendKeys(Data.password);
        // Click SIGNIN button
        WebElement signInButton = driver.findElement(Locators.BUTTON_SIGN_IN); //SIGNIN button
        signInButton.click();
    }

}
