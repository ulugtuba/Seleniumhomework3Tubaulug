package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClassifiedCategorySelectPage1 extends BasePage{
    public ClassifiedCategorySelectPage1(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (css="[icon-id='9'']")
    WebElement jobClassified;

    public void selectJobClassifed(){
        wait.until(ExpectedConditions.visibilityOfAllElements(jobClassified));
        jobClassified.click();

    }
}
