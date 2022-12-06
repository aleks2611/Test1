package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTask {

    WebDriver driver;

    String baseUrl;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        baseUrl = "https://letskodeit.teachable.com";
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Java Practice\\Test1\\Maven1\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test@email.com");
        WebElement passwordField = driver.findElement(By.id("email"));
        passwordField.sendKeys("abcabc");
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
}
