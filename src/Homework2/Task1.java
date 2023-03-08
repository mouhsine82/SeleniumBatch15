package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Task1 {
    public static void main(String[] args) {
        /*
        enter the message in the text box
click on show message
Enter value of a (edited)
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
 */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello everyone, This Mouhsine from Batch 15");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("200");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("50");
        WebElement total=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        total.click();
        WebElement sum=driver.findElement(By.xpath("//span[@id='displayvalue']"));
         String type= total.getAttribute("type");
        System.out.println("Attribute type is: "+type);
        System.out.println("The total is: "+sum.getText());
        driver.close();

    }
}
