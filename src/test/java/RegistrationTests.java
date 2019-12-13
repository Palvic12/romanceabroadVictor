import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationTests extends BaseUI{

//    testHowWeWork();
//    testSearchPage();
//    testPhotoPage();
//    testGiftPage();
//    testTourPage()
//    testBlogPage()
//    testRegistration()



    @Test
    public  void testRegistration(){
        System.out.println("             *** testRegistration ***");

        /*
        // PLAN :
         // Click the Registration button
         // Enter email
         // Enter password
         // Click NEXT button
         // Enter username
         // Pick a date
         // Pick a month
         // Pick a year
         // Enter phone number
         // Enter location
         // Click checkbox
         // Click NEXT button
         */

        // Click the Registration button
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION); // 'JOIN FOR FREE NOW' button
        registrationButton.click();
        //Enter email
        WebElement emailTextField = driver.findElement(Locators.TEXT_FIELD_EMAIL); // Email text field
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.sendKeys(Data.email);
        //Enter password
        WebElement passwordTextField = driver.findElement(Locators.TEXT_FIELD_PASSWORD); // Password text field
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextField));
        passwordTextField.sendKeys(Data.password);
        // Click NEXT button
        WebElement nextButton = driver.findElement(Locators.BUTTON_NEXT); //NEXT button (after Password)
        nextButton.click();
        // Enter username
        WebElement usernameTextField = driver.findElement(Locators.TEXT_FIELD_USERNAME); // Username text field
        usernameTextField.sendKeys(Data.username);
        // Pick a date
        WebElement birtDate = driver.findElement(Locators.DROP_DOWN_DAY); // Date of birth
        birtDate.click();
        List<WebElement> day_list = driver.findElements(By.xpath("//div[@id='daySelect']//li//a"));
        int day_list_size = day_list.size();
        System.out.println("The size of 'day_list' is: " + day_list_size);
        for (int i = 0; i < day_list_size; i++){
            System.out.print(day_list.get(i).getText() + " ");
        }
        for (int i = 0; i < day_list_size; i++){
            if (day_list.get(i).getText().contains("18")){ // Enter the date
                day_list.get(i).click();
                break;
            }
        }
        // Pick a month
        WebElement birtMonth = driver.findElement(Locators.DROP_DOWN_MONTH); // Month of birth
        birtMonth.click();
        List<WebElement> month_list = driver.findElements(By.xpath("//div[@id='monthSelect']//li//a"));
        int month_list_size = month_list.size();
        System.out.println();
        System.out.println("The size of 'month_list' is: " + month_list_size);
        for (int i = 0; i < month_list_size; i++){
            System.out.print(month_list.get(i).getText() + " ");
        }
        for (int i = 0; i < month_list_size; i++){
            if (month_list.get(i).getText().contains("Jun")){ //Enter the month
                month_list.get(i).click();
                break;
            }
        }
        // Pick a year
        WebElement birtYear = driver.findElement(Locators.DROP_DOWN_YEAR);  // Year of birth
        birtYear.click();
        List<WebElement> year_list = driver.findElements(By.xpath("//div[@id='yearSelect']//li//a"));
        int year_list_size = year_list.size();
        System.out.println("The size of 'year_list' is: " + year_list_size);
        for ( int i = 0; i < year_list_size; i++){
            System.out.print(year_list.get(i).getText() + " ");
        }
        for ( int i = 0; i < year_list_size; i++){
            if (year_list.get(i).getText().contains("1991")){ // Enter the year
                year_list.get(i).click();
                break;
            }
        }
        // Enter phone number
        WebElement phoneTextField = driver.findElement(Locators.TEXT_FIELD_PHONE);
        phoneTextField.sendKeys(Data.phone);
        // Enter location
        WebElement locationTextField = driver.findElement(Locators.TEXT_FIELD_LOCATION);
        locationTextField.sendKeys("Washington");
        // Click checkbox
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX); // Confirmation check box
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println("Checkbox is selected: " + selectedCheckbox + " !!!!!!!!");
        checkboxConfirmation.click();
        // Click NEXT button
        WebElement nextButton2 = driver.findElement(Locators.BUTTON_NEXT2); //NEXT button (after check box)
        //nextButton2.click(); // button id disabled
    }

    public void clickLeftMouse(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click();
    }





}
