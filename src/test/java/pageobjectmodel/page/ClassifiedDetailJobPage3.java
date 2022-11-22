package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedDetailJobPage3 extends BasePage {
    public ClassifiedDetailJobPage3(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = "//button[text()='Devam Et']")
    public WebElement devametButton;

    public void clickDevamEtButton(){
        devametButton.click();
    }
}


