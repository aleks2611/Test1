package pageClass;

import demo.LoginDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private static final Logger logger = LogManager.getLogger(LoginDemo.class);
    WebDriver driver;
    String baseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://www.expedia.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");

    }

    @Test
    public void test() {
        driver.get(baseUrl);
        SearchPage.originTextBox(driver).click();
        logger.info("Origin text method click");
        SearchPage.originTextBox(driver).sendKeys("NewYork");
        logger.info("Origin text method send keys NewYork");
        SearchPage.destinationTextBox(driver).sendKeys("Chicago");
        logger.info("Destination text box");


    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }
}
