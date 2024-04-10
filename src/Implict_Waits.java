import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implict_Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://adactin.com/HotelApp/index.php");

        driver.findElement(By.id("username")).sendKeys("iokat");
        driver.findElement(By.id("password")).sendKeys("Ven@123");
        driver.findElement(By.id("login")).click();
    }
}
