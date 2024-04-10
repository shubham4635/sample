import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explict_Wait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/");
        Thread.sleep(1000);
        WebElement webElement=driver.findElement(By.xpath("//*[@id='link']/div/ul/li[5]/a"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(21));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
   Thread.sleep(2000);
   driver.navigate().refresh();
   driver.close();
    }
}
