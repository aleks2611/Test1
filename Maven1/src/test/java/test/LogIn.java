package test;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogIn {


    WebDriver driver;
    String baseUrl ;

    @Before
    public void setUp() throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        baseUrl = "https://letskodeit.teachable.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");

    }

    @Test
    public void LogInTest() throws Exception {

        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]//a[@href='sign_in']")).click();
        System.out.println("Kliknuo je na Login dugme");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        System.out.println("Unece email");
        driver.findElement(By.id("password")).sendKeys("test");
        System.out.println("Password je unet");
        driver.findElement(By.id("email")).clear();
        System.out.println("Brisanje polja username");


    }


    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }


}

