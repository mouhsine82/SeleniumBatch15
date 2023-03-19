package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com/");


        WebElement en=driver.findElement(By.xpath("//div[text()='EN']"));

        //action class to perform hover over, drag and drop, double click,right click, click and hold and much more look at the action class menu...
        Actions action=new Actions(driver);
       action.moveToElement(en).perform();

    }
}
