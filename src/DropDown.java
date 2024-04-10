import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Launch the URL using get ()
        driver.get("https://demo.seleniumeasy.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Checkbox Demo']")).click();
        Thread.sleep(2000);
        boolean value = driver.findElement(By.xpath("//label[1][@class='checkbox-inline']//input")).isSelected();
        if (value == true) {
            System.out.println("Already Selected");
        } else {
            driver.findElement(By.xpath("//label[1][@class='checkbox-inline']//input")).click();
        }

        }
    }

