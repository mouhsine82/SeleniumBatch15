package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clicking on create new account
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Jon");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abcd1234");
        driver.findElement(By.id("month")).sendKeys("May");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("1980");

        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.close();

    }
}
