package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));

        //check if the check box    "click on this check box" is Selected if yes check the box
        boolean isCheckBoxSelected= checkBox.isSelected();
        if(!isCheckBoxSelected) {
            checkBox.click();

        }
        // check gain if the checkbox is Selected or not

       //isCheckBoxSelected=checkBox.isSelected();
        System.out.println("The status of selection is "+checkBox.isSelected());


    }
}
