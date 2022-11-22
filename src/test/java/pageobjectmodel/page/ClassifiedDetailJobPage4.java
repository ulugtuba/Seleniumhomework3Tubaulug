package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedDetailJobPage4 extends BasePage{
    public ClassifiedDetailJobPage4(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (className = "new-add-button")
    public WebElement banaozelegitButton;

    public void successPage(){
        banaozelegitButton.click();
    }
}
