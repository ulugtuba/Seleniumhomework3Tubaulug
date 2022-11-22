package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryAutomobilePage extends BasePage{
    public CategoryAutomobilePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(className = "all-classifieds-link")
    public WebElement allClassifiedLink;

    public void clickAllClassifiedLink()
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(allClassifiedLink));
        allClassifiedLink.click();
    }
}
