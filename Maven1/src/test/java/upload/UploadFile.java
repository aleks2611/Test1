package upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UploadFile {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        baseUrl = "https://ps.uci.edu/~franklin/doc/file_upload.html";
        driver = new ChromeDriver();


        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void fileUpload() throws AWTException, InterruptedException {
        //driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();

        driver.findElement(By.id("identifierId")).sendKeys("aglisic1717@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("milosvolialex"); // Enter your password
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();
        //EnterPassword.enterPassword(driver); // Comment this
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
        driver.findElement(By.xpath("//div[@class='wO nr l1']//textarea")).sendKeys("letskodeit@gmail.com");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test File Upload");
        WebElement fileInput = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
        fileInput.click();
       /* WebElement fileButton = driver.findElement(By.name("userfile"));
        System.out.println(fileButton);
        fileButton.click();
        StringSelection ss = new StringSelection("C:\\Users\\Aki\\Desktop\\File\\aleksUploadFiles");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);*/

        // Ctrl + v
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//div[text()='Send']")).click();
    }

    @AfterClass
    public void afterClass() {
    }

}
