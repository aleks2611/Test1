package Calendar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CalendarPartTwo {
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
    public void calendarTest2() {
        driver.get(baseUrl);
        WebElement datepart = driver.findElement(By.id("d1-btn"));
        datepart.click();
        WebElement dateToSlect = driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]/td[4]/button"));
        dateToSlect.click();
        WebElement caMonth = driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]"));
        dateToSlect.click();

        List<WebElement> allValidDates = caMonth.findElements(By.tagName("td"));
        for (WebElement date : allValidDates) {
            //if (date.getText().equals("31")) ;
            //date.click();
            //break;
            System.out.println(date);
        }



   /*     for (int i = 0; i <= allValidDates.size(); i++) {
            if (allValidDates.get(i).getText().equals("31")) ;
            allValidDates.get(i).click();
            break;

        }
        allValidDates.forEach(date -> {

            if (date.getText().equals("31")) {
                date.click();
            }

        });
*/

    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }
}
