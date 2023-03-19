package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("tester");

        // clear the username text box using method clear()
        username.clear();  // That's why we create variable, so it is easy to call it

        // clear the password

       // to get the text username which is beside the username text box
       WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //to get the text password which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText= passwordText.getText();
        System.out.println(passText);

    }
}
