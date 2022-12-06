package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StateOfWebElement {
    static WebDriver driver;
    static String BaseUrl2;
    static String BaseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        BaseUrl2 = "https://www.expedia.com/Cars";
        BaseUrl = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void letsCCodeIt() throws Exception {
        driver.get(BaseUrl);
        WebElement texyBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box Dispayed" + texyBox.isDisplayed());

        Thread.sleep(3000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Cliked on hide button" + hideButton);


        Thread.sleep(3000);

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Text Box Dispayed" + showButton.isDisplayed());

        Thread.sleep(3000);
        // show-textbox
    }

    // @Test
    //public void expediaTets() throws Exception {
    //     driver.get(BaseUrl2);

    // }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
