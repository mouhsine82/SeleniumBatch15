package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        // switch to the iframe which contains the input box
        // 1st method switch to an iframe using  "index"
        driver.switchTo().frame(0);
        // this s will shift the focus to the first frame
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
        //send some text
        textBox.sendKeys("I am here");

        // get the text (click on the below link:) from parent window
        driver.switchTo().defaultContent();
        //find the text & print
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("The text is "+text.getText());

        // get the text (enter name) in iframe & print
        // 2nd Method switch to an iframe using "name or id"
        driver.switchTo().frame("iframe_a");
        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is "+getLabel.getText());

        // switch focus to the main page (parent window)
        driver.switchTo().defaultContent();

        //3rd Method switch to an iframe using "WebElement"
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);

        //  clear what ever written in the text box (variable is already declared)
        textBox.clear();




    }
}
