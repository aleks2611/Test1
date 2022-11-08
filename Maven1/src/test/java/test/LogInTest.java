package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURl = "https://courses.letskodeit.com/practice";


        driver.get(baseURl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.findElement(By.name("enter-name")).sendKeys("Automation");
        driver.close();


    }

}
