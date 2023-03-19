package class09;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScroll {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com/");
        // window scroll down
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1000)", "");
    }
}
