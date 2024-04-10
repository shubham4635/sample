import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.redbus.in/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='rail_tickets_vertical']")).click();
        Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.close();
    }
}
