package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));

        WebElement text=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String sel=text.getText();
        System.out.println(sel);

    }
}
