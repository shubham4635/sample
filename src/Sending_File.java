import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sending_File {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/upload/");

        String path="C:\\Users\\91705\\OneDrive\\Documents\\sql commands.docx";
        driver.findElement(By.name("uploadfile_0")).sendKeys(path);;



    }

}


