package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigateBetweenPages {
    WebDriver driver;
    String baseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");

    }

    @Test
    public void LogInTest1() throws Exception {

        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("This is current URl" + currentUrl);
        String urlToNavigate = "https://courses.letskodeit.com/practice";
        driver.navigate().to(urlToNavigate);

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Driver go back");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is" + currentUrl);


        Thread.sleep(2000);


        driver.navigate().forward();
        System.out.println("Idemo napred");
        currentUrl = driver.getCurrentUrl();


        Thread.sleep(200);

        driver.navigate().refresh();
        System.out.println("Refresh strane");
        currentUrl = driver.getCurrentUrl();


    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }
}
