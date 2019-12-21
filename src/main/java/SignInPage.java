import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignInPage extends BaseActions{
    String currentSignInErrorAlert;


    public SignInPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void completeSignInForm(){
        //Enter email
        timeWait(1000);
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

    public void ckeckErrorSignIn(){
        WebElement signInErrorMessageElement = driver.findElement(Locators.ERROR_MESSAGE_LOGIN_TEXT);
        currentSignInErrorAlert = signInErrorMessageElement.getText();

        System.out.println("Current signInErrorMessage of 'SIGN IN' page is:  '" + currentSignInErrorAlert + "'");
        System.out.println("Expected signInErrorMessage of 'SIGN IN' page is: '" + Data.expectedSignInErrorAlert + "'");
        if (currentSignInErrorAlert.equals(Data.expectedSignInErrorAlert)){
            System.out.println("Current  signInErrorMessage of 'SIGN IN' page is equal to expected signInErrorMessage of 'SIGN IN' page.");
        }
        else {
            System.out.println("Current  signInErrorMessage of 'SIGN IN' page is NOT equal to expected signInErrorMessage of 'SIGN IN' page.");
        }
        Assert.assertEquals(currentSignInErrorAlert, Data.expectedSignInErrorAlert);
    }

}
