package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // locate the web element
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use select class because this drop down has select tag
        Select sel=new Select(dropDown);

        //using Select class we have 3 different methods to select the desired option
        // 1st (Select by index)
        sel.selectByIndex(2);
        Thread.sleep(2000);

        // 2nd (Select by Value)
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        // 3rd (Select by visible text)
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);

    }
}
