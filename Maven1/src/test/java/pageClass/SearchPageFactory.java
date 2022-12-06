package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {
    @FindBy(xpath = "//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")
    WebElement flightsTab;

    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a")
    WebElement roundTrip;
    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[3]/a")
    WebElement multiCityDestination;

    public void clickFlightTab() {
        flightsTab.click();
    }

    public void clickRoundTrip() {
        roundTrip.click();
    }

    public void clickMultiCityTrip() {
        multiCityDestination.click();
    }

}
