package Calendar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Calendarslection {
    WebDriver driver;
    String baseUrl;


    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://www.expedia.com/";
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");

    }

    @Test

    public void CalendarTest1() throws Exception {
        driver.get(baseUrl);
       /* WebElement element = driver.findElement(By.id("name"));
        String attributeValue = element.getAttribute("class");
        System.out.println("Value of attribute is: " + attributeValue);*/

        WebElement datepart = driver.findElement(By.id("d1-btn"));
        datepart.click();
        //Cliking on date field

        WebElement dateToSlect = driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]/td[4]/button"));
        dateToSlect.click();
        //Cliking on the only one date


    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }
}
