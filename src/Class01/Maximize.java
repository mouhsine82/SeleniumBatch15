package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        // Class01.Maximize the browser
        driver.manage().window().maximize();
       // full screen
        driver.manage().window().fullscreen();
        driver.close();
    }
}
