package seleniumReview03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthPopUps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //use login info in the link to login automatically 









            }
        }


