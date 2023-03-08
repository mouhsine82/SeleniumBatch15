package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on Radio button Male
        WebElement gender=driver.findElement(By.cssSelector("input[value='Male']"));

        // check if the radio button is enabled
        boolean isEnabledMale=gender.isEnabled();
        System.out.println("The button male is enabled "+isEnabledMale);// true

        // check if the radio button is displayed
        boolean isDisplayed=gender.isDisplayed();
        System.out.println(isDisplayed);// true

        // check if the radio button is selected
        boolean isSelectedMale=gender.isSelected();
        System.out.println(isSelectedMale);// false

        // if the radio button is not selected click on it
        if(!isSelectedMale){   // false so it will click
            gender.click();
        }

        // check if the radio button is selected after click
        isSelectedMale=gender.isSelected(); // true coz it already selected
        System.out.println("The status of selection is "+isSelectedMale);

    }
}
