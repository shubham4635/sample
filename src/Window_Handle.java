import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window_Handle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
driver.get("https://www.imagicaaworld.com/theme-park/?utm_source=google_sem&utm_medium=brand_keywords&gad_source=1&gclid=CjwKCAjwte-vBhBFEiwAQSv_xetRPuY7mHTC5kgB7PdlwVrhC_e9ujeTxv8_-LMhr8W_3lYSoKn85BoCrZcQAvD_BwE");
driver.findElement(By.xpath("//*[@id='ae_header--2']/div/div/div[2]/div/ul/li[5]/a/img")).click();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID:" + parentWindow);
        driver.findElement(By.xpath("//*[@id='subscribe-button']/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        Set<String>allWindow=driver.getWindowHandles();
        for (String x:allWindow){
            if(!parentWindow.equals(x)){
                System.out.println("Child Window" +x);
                driver.switchTo().window(x);


            }
        }
    }
}
