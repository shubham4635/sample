import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(7000);
        WebElement radioButton= driver.findElement(By.xpath("//label[text()='Female']"));
        boolean state =radioButton.isSelected();
        System.out.println(state);
    }


}
