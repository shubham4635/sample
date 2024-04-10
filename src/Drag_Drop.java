import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Drag_Drop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop)
                .pause(Duration.ofSeconds(3)).release()
                .build().perform();
    }
}
