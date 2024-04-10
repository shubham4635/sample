import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Proxy;

public class ScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("http://toolsqa.com/automation-practice-table/");
   driver.get("https://www.javatpoint.com/");
   Thread.sleep(1000);
   File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   Thread.sleep(1000);
   FileHandler.copy(file,new File("C:\\Users\\91705\\OneDrive\\Pictures\\Screenshot 2024-02-15 162855.png"));
   Thread.sleep(1200);
   driver.close();
    }
}
