package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ClassifiedCategorySelectPage2 extends BasePage {
    public ClassifiedCategorySelectPage2(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = "//span[text()='Eğitim']")
    public WebElement egitim;

    public void selectEgitim() {
        Select selectEgitim = new Select(egitim);
        selectEgitim.selectByValue("Egitim");
    }

    @FindBy (xpath="//span[text()='Fitness Eğitmeni']")
    public WebElement egitim2;

    public void selectEgitim2(){

    Select selectEgitim2 = new Select(egitim2);
    }

    @FindBy(xpath = "//button[text()='Devam']")
    public WebElement continueButton;

    public void setContinueButton()
    {
        continueButton.click();
    }


    }

