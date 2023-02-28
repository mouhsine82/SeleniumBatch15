package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Mouhsine");
        driver.findElement(By.name("customer.lastName")).sendKeys("Boukhris");
        driver.findElement(By.id("customer.address.street")).sendKeys("4532 ABC street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Las vegas");
        driver.findElement(By.id("customer.address.state")).sendKeys("Nevada");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("89148");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("702-543-9876");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("Mouhsine82");
        driver.findElement(By.id("customer.password")).sendKeys("Abcd1234");
        driver.findElement(By.name("repeatedPassword")).sendKeys(("Abcd1234"));
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
