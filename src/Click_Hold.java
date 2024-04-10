import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Click_Hold {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement click=driver.findElement(By.xpath("//li[text()='B']"));
        Actions action=new Actions(driver);
                action.clickAndHold(click).
                        .pause(Duration.ofSeconds(6))
                        .release(click)
                        .perform();

    }
}
