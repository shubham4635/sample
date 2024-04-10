import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();driver.get("http://toolsqa.com/automation-practice-table/");
        List<WebElement>tData=driver.findElements(By.tagName("td"));
        for (WebElement data :tData){
            System.out.println(data.getText());
        }
    }
}