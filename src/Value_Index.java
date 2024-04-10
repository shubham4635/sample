import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Value_Index {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        Select selectDay= new Select(driver.findElement(By.id("day")));
        selectDay.selectByIndex(15);
        Select selectMonth= new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("12");
        Select selectYear= new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1985");

    }
}
