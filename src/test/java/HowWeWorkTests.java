import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI{

    String currentUrlHowWeWork;
    String currentPageTitleHowWeWork;
    String currentLinkTextHowWeWork;



    @Test
    public void testHowWeWork() {

        System.out.println("             *** testHowWeWorkPage ***");


        // Verifying 'HOW WE WORK' page LinkText
        System.out.println("--- Verifying 'HOW WE WORK' page LinkText ---");
        WebElement howWeWorkLink = driver.findElement(Locators.LINK_HOW_WE_WORK);
        currentLinkTextHowWeWork = howWeWorkLink.getText();
        System.out.println("Current LinkText of 'HowWeWork' page is:  " + currentLinkTextHowWeWork);
        System.out.println("Expected LinkText of 'HowWeWork' page is: " + Data.expectedLinkTextHowWeWork);
        if (currentLinkTextHowWeWork.equals(Data.expectedLinkTextHowWeWork)){
            System.out.println("Current LinkText of 'HowWeWork' page is equal to expected LinkText of 'HowWeWork' page");
        }
        else {
            System.out.println("Current LinkText of 'HowWeWork' page is NOT equal to expected LinkText of 'HowWeWork' page");
        }
        Assert.assertEquals(currentLinkTextHowWeWork, Data.expectedLinkTextHowWeWork);
        // Click "HOW WE WORK" link
        howWeWorkLink.click();
        // Verifying 'HOW WE WORK' page Title
        System.out.println("--- Verifying 'HOW WE WORK' page Title ---");
        currentPageTitleHowWeWork = driver.getTitle();
        System.out.println("Current PageTitle of 'HowWeWork' page is:  " + currentPageTitleHowWeWork);
        System.out.println("Expected PageTitle of 'HowWeWork' page is: " + Data.expectedPageTitleHowWeWork);
        if (currentPageTitleHowWeWork.equals(Data.expectedPageTitleHowWeWork)){
            System.out.println("Current  PageTitle of 'HowWeWork' page is equal to expected PageTitle of 'HowWeWork' page");
        }
        else {
            System.out.println("Current  PageTitle of 'HowWeWork' page is NOT equal to expected PageTitle of 'HowWeWork' page");
        }
        Assert.assertEquals(currentPageTitleHowWeWork, Data.expectedPageTitleHowWeWork);

        // Verifying 'HOW WE WORK' page current url
        System.out.println("--- Verifying 'HowWeWork' page current url ---");
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println("Current Url of 'HowWeWork' page is:  " + currentUrlHowWeWork);
        System.out.println("Expected Url of 'HowWeWork' page is: " + Data.expectedUrlHowWeWork);
        if (currentUrlHowWeWork.equals(Data.expectedUrlHowWeWork)){
            System.out.println("Current Url of 'HowWeWork' page is equal to expected url of 'HowWeWork' page");
        }
        else {
            System.out.println("Current Url of 'HowWeWork' page is NOT equal to expected url of 'HowWeWork' page");
        }
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);



    }

}
