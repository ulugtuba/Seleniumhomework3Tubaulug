package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedDetailJobPage2 extends BasePage{
    public ClassifiedDetailJobPage2(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "(//button[text()='Devam Et'])[2]")
    public WebElement devametButton;

    public void clickDevamEtButton(){
        devametButton.click();
    }
}
