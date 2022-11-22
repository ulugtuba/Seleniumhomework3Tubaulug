package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = ".searchResultsRowClass > tr > td:nth-child(1)")
    public List<WebElement> searchResultClassifieds;

    @FindBy(css = ".searchResultsRowClass > tr > td.searchResultsTitleValue")
    public List<WebElement> classifiedsTitle;

    @FindBy(css = ".searchResultsRowClass > tr > td:nth-child(7)")
    public List<WebElement> classifiedsKM;

    @FindBy(css = ".searchResultsRowClass > tr > td.searchResultsPriceValue")
    public List<WebElement> classifiedsPrice;

    public Integer getClassifiedSize() {

        return searchResultClassifieds.size();
    }

    public void clickFirstClassified() {
        searchResultClassifieds.get(0).click();
    }

    public String getFirstClassifiedTitle() {

        return classifiedsTitle.get(0).getText();
    }

    public String getFirstClassifiedKM(){
        return classifiedsKM.get(0).getText();
    }

    public String getFirstClassifiedPrice(){
        return classifiedsPrice.get(0).getText();
    }
}
