package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    public static WebElement originTextBox(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/div[1]/button"));
        return element;
    }

    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.id("location-field-destination"));
        return element;
    }

    public static WebElement departureDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }

    public static WebElement returnDateTexttBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.id("search-button"));
        return element;
    }

    public static WebElement clickOnSearchButton(WebDriver driver) {
        element = searchButton(driver);
        element.click();
        return element;
    }

    public static WebElement navigateToFlightsTab(WebDriver driver) {
        driver.findElement(By.id("header-history")).click();
        element = driver.findElement(By.id("tab-flight-tab"));
        element.click();
        return element;
    }


}
