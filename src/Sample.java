import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.edubridgeindia.com/");          //launching the url on browser
        driver.manage().window().maximize();    // maximize the browser
        driver.findElement(By.cssSelector("#navbarsExample07 > div > a.text-nowrap.btn.new-singup.text-center.w-100.cursor")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("register_mobile_new")).sendKeys("23445556");
        Thread.sleep(1000);
        driver.findElement(By.id("register_name_new")).sendKeys("Shubham");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#register_email_new")).sendKeys("ShubhamKangune@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#zip_code_new")).sendKeys("422301");
        Thread.sleep(1000);
        driver.findElement(By.id("register_password_new")).sendKeys("Shubham");
        Thread.sleep(1000);
    driver.findElement(By.cssSelector("#registerFrmNew > div.regFormInp.mt-2.password_sec > div > div > div.input-group-addon.eye_tag > a > span")).click();
    }
}
