package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-754493448%3A1678243125945898&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdVZbvfF4NuafdMUcZn6ZS1eSr1BtsfKmG7WKkLPqU51nbiSXL34vv_yXZBgwOHj_nyLVM8SQ");

        //click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        //click on privacy button
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // get window handles of all the windows that have been opened up we use Set coz doesn't maintain the order
        Set<String> windowHandles=driver.getWindowHandles();

        // print all window handles
        for(String wh:windowHandles){
            // switch the focus of the driver to help window
        driver.switchTo().window(wh);
        // check the title of the window to which out focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        // To verify we switched to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);
    }
}
