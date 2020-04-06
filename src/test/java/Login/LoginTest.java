package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
class LoginTests {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://identity.getpostman.com/login");
        Thread.sleep(5000);
        //1. maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("sulaimondamola96@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Damola@3029");
        driver.findElement(By.id("sign-in-btn")).click();

    }
    public static void main(String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}

