package Calendar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.Utility;

import java.time.Duration;

public class AutocompleteDemo {
    String baseUrl;
    WebDriver driver;

    Utility utility;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://www.goibibo.com/";
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before");
        this.utility = new Utility(driver);

    }

    @Test
    public void verifyInputFiledFrom() throws Exception {
        String textInputField = "Aki voli Miska";
        String classNameFrom = "sc-hiCibw";
        String xpathInput = "//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div[2]/div/input";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Open the browser with url:https://www.goibibo.com/
        driver.get(baseUrl);

        //Find element 'From' and click on them
        WebElement fromElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classNameFrom)));
        fromElement.click();

        // Find input field in element 'From'
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathInput)));
        inputElement.sendKeys(textInputField);


        // Verify text
        Assert.assertEquals(inputElement.getAttribute("value"), textInputField);
    }

    @AfterClass
    public void tearDown() throws Exception {


        System.out.println("After");
        driver.quit();
    }

}
