package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
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

        WebElement pimTub = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimTub.click();
        // get the employee id 52396A and click on the check associated with it

        // in order to find the desired ID using loop
        boolean idFound = false;
        while (!idFound) {  // loop to continue until ID not found
            // we should put the List webelement inside the loop so the ids will not  discard the ids element coz DOM will refresh (StaleElementReferenceException)
            List<WebElement> ids = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {  // loop for the first page the find ID
                String text = ids.get(i).getText();

                if (text.equalsIgnoreCase("52283A")) {
                    System.out.println(text);
                    System.out.println("The ID is located at row number " + (i + 1));
                    // to click on the particular checkBox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound = true;
                    break;  // this break the inner loop
                }
            }
            // click on the next page if the id not found in the 1st page using another loop
            if (!idFound) {  // if ID not found go to next page
                WebElement nextPage = driver.findElement(By.xpath("//a[text()='Next']"));
                nextPage.click();


            }
        }
    }
}
