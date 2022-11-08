package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import java.util.concurrent.TimeUnit;

public class Implicit {
    WebDriver driver;
    String baseUrl;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://letskodeit.teachable.com/";
        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        System.out.println("Before");

    }

    @Test

    public void GetAtributte() throws Exception {

        driver.get(baseUrl);
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();
        System.out.println("Cliked on logn pagr" + loginButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("Test");
        System.out.println("Enter test value in field" + emailField);


        //  String attributeValue = element.getAttribute("class");
        // System.out.println("Value of attribute is: " + attributeValue);


    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        driver.quit();
    }

}
