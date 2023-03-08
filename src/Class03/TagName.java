package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        // get all the links
        // all links are in tag <a> which also called anchor tag
        //use tagName for this
        List<WebElement> tags=driver.findElements(By.tagName("a"));
        // in order to print we need to iterator
        for(WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);
        }

    }
}
