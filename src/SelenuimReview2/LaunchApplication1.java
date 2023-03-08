package SelenuimReview2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");


        // Capture (Title,URL) we can use this to validate that the test case is happened successfully
        String pageTitle=driver.getTitle();
        System.out.println("The title of page is "+pageTitle);

        //Capture URL
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL "+currentUrl);

        //Capture page source
        String pageSource=driver.getPageSource();
        System.out.println("Page source is "+pageSource);

        // Page Refresh
        driver.navigate().refresh();

        // Browser close will close current tab
        driver.close();
        // Browser quit will close all the related tabs
        driver.quit();


    }
}
