import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Date_Select {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(1);
        WebElement element= driver.findElement(By.id("datepicker1"));
        element.click();
        List<WebElement>all=driver.findElements(By.className("ui-datepicker-calendar"));
        for(WebElement date:all){
            if(date.getText().contentEquals("21")){
                date.click();
                break;
            }
        }



    }
}
