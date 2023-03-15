package SeleniumReview03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingMulitipleCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        // using Enhanced For Loop
        for(WebElement day:days ){
            day.click();

        // using normal Loop
            for (int i = 0; i < days.size() ; i++) {
                days.get(i).click();



            }
        }
    }
}
