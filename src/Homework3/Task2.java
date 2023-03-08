package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
      // we need to find the common value to all the checkboxes. here is (class='cb1-element) this locator is for all the checkboxes
       List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));

         // iterate through the list
        // using For inhenced loop
         /*
          for(WebElement check:option){
            String checkBox=check.getAttribute("value");
            if(checkBox.equals("Option-4")){
                check.click();
                */

         // using normal loop
           for (int i = 0; i <checkBox.size() ; i++) {
            String value=checkBox.get(i).getAttribute("value");
            //check if this is the desired one
            //if yes click it, if no continue iterate
            if(value.equalsIgnoreCase("Option-2")){
                checkBox.get(i).click();

        }

           }
       }
    }

