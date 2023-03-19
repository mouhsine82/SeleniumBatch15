package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // always connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // next the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        // next open google.com
        driver.get("https://www.google.com/");
        // slow down
        Thread.sleep(3000);
        // navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        // go back
        driver.navigate().back();
        Thread.sleep(3000);
        // go to facebook again
        driver.navigate().forward();
        Thread.sleep(3000);
        // refresh the page
        driver.navigate().refresh();

        // close the browser this will close the current tab only
        driver.close();

    }
}
