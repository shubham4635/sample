import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Double_Click {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement click=driver.findElement(By.xpath("//*[@id='post-body-3062664932371252844']/div/button"));
        Actions actions=new Actions(driver);
        actions.doubleClick(click)
                .pause(Duration.ofSeconds(3))
                .perform();
        Alert a=driver.switchTo().alert();
        a.accept();
    }
}
