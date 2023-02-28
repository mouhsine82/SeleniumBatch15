package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

       // send in the username
        driver.findElement(By.id("email")).sendKeys("mouhsine");
        driver.findElement(By.name("pass")).sendKeys("Younes2011");

        // click on the button create new account
        //driver.findElement(By.linkText("Create new account")).click();

        // forget password
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();


    }
}
