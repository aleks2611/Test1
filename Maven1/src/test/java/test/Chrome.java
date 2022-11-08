package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome {
    static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Test1\\Maven1\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseURl = ("https://letskodeit.teachable.com");
        driver.get(baseURl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.id("email")).sendKeys("letscode@gmail.com");

        // driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.tagName("a")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.close();



     /*  driver.navigate().to("https://www.youtube.com/watch?v=x_bEQ-AVYAY&ab_channel=%C5%BDeljkoSamard%C5%BEi%C4%87");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   */

    }
}

