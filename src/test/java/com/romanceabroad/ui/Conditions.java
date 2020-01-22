package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class Conditions extends BaseUI{ // extends com.romanceabroad.ui.BaseUI

    @Test

//    public void test4(){
//        mainPage.clickJoinButton();
//        mainPage.completeFirstPartOfRegistration();
//        WebElement checkBox = driver.findElement(Locators.CHECK_BOX);
//        if (checkBox.isSelected()){
//            System.out.println("The checkbox is selected already.");
//        } else {
//            checkBox.click();
//            System.out.println("A have clicked checkbox right now");
//        }
//    }
//    public void test5(){
//        List<String> crunchifyList1 = new ArrayList<String>(Arrays.asList("kiwi", "orange", "melon"));
//        String element = crunchifyList1.get(0);
//        System.out.println(element);
//
//        if (crunchifyList1.contains("orange")){
//            System.out.println(crunchifyList1);
//        }
//    }

//    public void test6() {
//        String phrase = "Apple is inside list";
//        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));
//
//        crunchifyList1.add("melon");
//        System.out.println(crunchifyList1);
//        for (int i = 0; i < crunchifyList1.size(); i++) {
//            String element = crunchifyList1.get(i);
//            System.out.println(i + " iteration");
//            continue;
//        }
//    }

    //*************************************************************************************

    public void test7(){

    }

    @Test
    public void test8(){
//        mainPage.ajaxClick(driver.findElement(By.xpath("//a[contains(text(),'JOIN TODAY!')]")));
//        driver.findElement(By.xpath("//a[contains(text(),'JOIN TODAY!')]")).click();
//        mainPage.ajaxClick(Locators.MAIN_PAGE_NAV_BAR_TABS,4);
//        mainPage.performClick(Locators.MAIN_PAGE_NAV_BAR_TABS, 4);
        mainPage.scrollToBottomOfPage();

    }

    //*************************************************************************************

//    public void clickMediaTabs(){
//        WebElement photosLink = driver.findElement(Locators.LINK_MEDIA);
//        photosLink.click();
//        List<WebElement> photos_tabs_links = driver.findElements(By.xpath("//ul[@class='b-tabs']//li"));
//        System.out.println(photos_tabs_links.size());
//        for (int i = 0; i < photos_tabs_links.size(); i++) {
//            String tabs_text = photos_tabs_links.get(i).getText();
//            System.out.println(tabs_text);
//            photos_tabs_links.get(i).click();
//            photos_tabs_links = driver.findElements(By.xpath("//ul[@class='b-tabs']//li"));
//        }
//    }


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

//    @Test
//    public void test7(){
//
//        List<Integer> crunchifyList1 = new ArrayList<Integer>(Arrays.asList(5, 10, 19));
//       int sum = crunchifyList1.get(0) + crunchifyList1.get(1);
//        System.out.println(sum);
//        for (int i = 0; i < 50; i++){
//            System.out.println("Hi guys!!!");
//        }
//
//    }
//
//    @Test
//    public void test8(){
//        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
//        System.out.println(links.size());
//
//        for (int i = 0; i < links.size(); i++){
//            String info = links.get(i).getText();
//            System.out.println(info);
//            links.get(i).click();
//            driver.navigate().back();
//            links= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
//        }
//    }


}
