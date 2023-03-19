package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement pimTub=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimTub.click();

        List<WebElement> ids=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i=0;i< ids.size();i++){
            String text=ids.get(i).getText();

            if(text.equalsIgnoreCase("52444A")){
                System.out.println(text);
                System.out.println("The ID is located at row number "+(i+1));

                WebElement checkBox=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox.click();
            }
        }


    }
}
