package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalendarTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // enter username and password and click on login
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement recBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recBtn.click();
        WebElement calendar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calendar.click();
        // pass the year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selYear=new Select(year);
        selYear.selectByValue("2006");
        // pass the month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.sendKeys("May");

        boolean isFound = false;
        while (!isFound) {
            List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement day : days) {
                String dayText = day.getText();
                if (dayText.equalsIgnoreCase("12")) {
                    day.click();
                    isFound = true;
                    break;

                }
            }

        }
    }
}









