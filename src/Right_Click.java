import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Right_Click {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement element= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
        Actions actions=new Actions(driver);
        actions.contextClick()
                .pause(Duration.ofSeconds(4))
                .perform();

    }
}

