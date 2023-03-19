package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        //use switchTo
      Alert alert=driver.switchTo().alert(); // this popup only have OK option
      Thread.sleep(5000);
      alert.accept();

      // This popup has 2 option OK and CANCEL
      // this HW
       driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
       Alert alert1=driver.switchTo().alert();
       Thread.sleep(5000);
       alert1.dismiss();


        // click on the Alert and entering the input value
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(5000);

        //switch focus to alert
        alert.sendKeys("Mouhsine");

        //accept it
        alert.accept();





    }
}
