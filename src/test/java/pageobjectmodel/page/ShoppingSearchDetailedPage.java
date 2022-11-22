package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingSearchDetailedPage extends BasePage{
    public ShoppingSearchDetailedPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css=".searchResultsRowClass > tr > td.searchResultsPriceValue")
    public List<WebElement> classifiedPrice;

    @FindBy(css= ".searchResultsRowClass > tr > td.searchResultsLocationValue")
    public List<WebElement> classifiedCityAndRegion;

    public String getFirstClassifiedPrice(){

        return classifiedPrice.get(0).getText();
    }
    public String getFirstClassifiedCityAndRegion(){

        return classifiedCityAndRegion.get(0).getText();

    }

}
