package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //get the drop down
        WebElement multDropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));

        //use the select class
        Select sel=new Select(multDropDown);

        //select by value
        sel.selectByValue("New Jersey");

        //select by visible text
        sel.selectByVisibleText("Ohio");

        //to slow
        Thread.sleep(2000);

        // when it comes to MultiSelect drop down we can also Deselect
        //   Deselect by value
        sel.deselectByValue("New Jersey");

        // Deselect by visible text
        sel.deselectByVisibleText("Ohio");

        // to check if the multi drop down is multiple or not
        System.out.println("The drop down is Multiple: "+sel.isMultiple());
    }
}
