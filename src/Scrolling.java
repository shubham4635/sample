import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.javatpoint.com/");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
        javascriptExecutor.executeScript("window.scrollBy(344,0)");

    }
}
