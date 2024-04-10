import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Iframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.javatpoint.com/");
        driver.manage().window().maximize();
        List<WebElement> all=driver.findElements(By.tagName("iframe"));
        System.out.println(all.size());
        driver.switchTo().frame((WebElement) By.xpath("/html/body/iframe[1]"));
        WebElement element= driver.findElement(By.xpath("/html/body/iframe[1]"));
        System.out.println(element.getText());
        driver.switchTo().parentFrame();
        WebElement frame= driver.findElement(By.name("googlefcInactive"));
        System.out.println(frame.getText());

    }
}
