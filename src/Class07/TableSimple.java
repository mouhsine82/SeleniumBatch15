package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        // task 1  table level based access
        // get the whole table accessed and print it on the console
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String tableData= table.getText();
       // System.out.println(tableData);

        //task2 get the row of the table and print them
        // print the row that contains company Google
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        // print the rows
        for(WebElement row:rows){
            String rowText= row.getText();
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }

        // task3  column level access
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
          for(WebElement column:columns){
              System.out.println(column.getText());

          }
          //task 4 just print the first colum of every row
        List<WebElement> firstColumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
          for (WebElement firstCol:firstColumns){
              System.out.println(firstCol.getText());
          }
    }
}
