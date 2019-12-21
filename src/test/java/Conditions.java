import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI{ // extends BaseUI

//    public void  testRadioButtons(){
    //    @Test // String mainUrl = "https://www.computerhope.com/jargon/r/radiobut.htm";
    // L8 9:35

//        if (driver.findElement(By.xpath("//input[@value='V3']")).isSelected()){
//            System.out.println("This element is already selected.");
//        } else{
//            driver.findElement(By.xpath("//input[@value='V3']")).click();
//        }
//    }
//    @Test
//    public void test4(){
//        WebElement linkSearch = driver.findElement(Locators.LINK_SEARCH);
//
//        if (linkSearch.getText().contains("PRETTY WOMEN")){
//            linkSearch.click();
//        } else {
//            Assert.fail("We can't find 'Pretty Women' link");
//        }
//    }

//    @Test
//    public void test5(){
//        WebElement linkSearch = driver.findElement(Locators.LINK_SEARCH);
//
//        if (linkSearch.isDisplayed()){
//            linkSearch.click();
//        } else {
//            Assert.fail("We can't find 'Pretty Women' link");
//        }
//    }

//    @Test
//    public void test6(){
//        mainPage.clickJoinButton();
//        mainPage.completeFirstPartOfRegistration();
//        WebElement checkBox = driver.findElement(Locators.CHECK_BOX);
//
//        if (!checkBox.isSelected()){
//            checkBox.click();
//            System.out.println("Checkbox is selected");
//
//        }
//    }

    @Test
    public void test7(){

        List<Integer> crunchifyList1 = new ArrayList<Integer>(Arrays.asList(5, 10, 19));
       int sum = crunchifyList1.get(0) + crunchifyList1.get(1);
        System.out.println(sum);
        for (int i = 0; i < 50; i++){
            System.out.println("Hi guys!!!");
        }

    }

    @Test
    public void test8(){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++){
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.navigate().back();
            links= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }
    }


}
