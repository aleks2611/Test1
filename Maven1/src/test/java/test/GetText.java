package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetText {

    WebDriver driver;
    String baseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");

    }

    @Test
    public void TxtGet() throws Exception {
        driver.get(baseUrl);
        WebElement buttonElement = driver.findElement(By.id("opentab"));
        String elementText = buttonElement.getText();
        buttonElement.click();
        System.out.println("Trext on element is " + elementText.isEmpty());
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }
}
