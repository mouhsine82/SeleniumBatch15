package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        /*
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify it is correct
         * logout
         * close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize page
        driver.manage().window().maximize();
        // send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        // click on the login button
        driver.findElement(By.className("button")).click();

        // verify that the title is "Web Orders
        String title= driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
        // logout
        driver.findElement(By.linkText("Logout")).click();

        driver.quit();
    }
}
