package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");

        //using js Executer to highlight the username box
        // declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //execute script
        js.executeScript("arguments[0].style.border='3px solid red'",username);

        // click the login button
        WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0].click();",loginbtn);

        // window scroll down
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,250)", "");



    }
}
