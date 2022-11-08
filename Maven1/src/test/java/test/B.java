package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class B {

    Test a = new A();

    public static class ImplictWaitDemo {
        WebDriver driver;
        String baseUrl;

        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
            driver = new ChromeDriver();

            baseUrl = "https://courses.letskodeit.com/practice";
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            System.out.println("Before");

        }public void test() throws Exception {
            driver.get(baseUrl);
            WebElement element = driver.findElement(By.id("name"));
            String attributeValue = element.getAttribute("class");
            System.out.println("Value of attribute is: " + attributeValue);


        }
        @After
        public void tearDown() throws Exception {
            System.out.println("After");
            driver.quit();
        }
    }
}
