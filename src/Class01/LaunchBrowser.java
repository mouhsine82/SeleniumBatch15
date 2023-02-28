package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver which is from selenium tool
        WebDriver driver=new ChromeDriver();

        // open the website  facebook.com by using get method.
        driver.get("https://www.facebook.com/");

        // get the current url that is there in the browser

       String URL=driver.getCurrentUrl();
        System.out.println(URL);

        // get the title of the webpage

       String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        Thread.sleep(3000); // this is to slow down 3 sec shutting the windows browser quickly

        // close the whole (more than 1 tab) browser
        driver.quit();




    }
}