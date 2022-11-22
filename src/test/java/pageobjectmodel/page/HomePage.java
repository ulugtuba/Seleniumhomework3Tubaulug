package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "[title='Otomobil']")
    public WebElement otomobil;

    public void clickOtomobil() {
        otomobil.click();
    }

    @FindBy(xpath = "//a[@title='iphone 12 mini']")

    public WebElement popularSearch;

    public String getPopularSearch() {

        return popularSearch.getText();

    }

    @FindBy(id = "#secure-login")
    public WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    @FindBy(id = "username")

    public WebElement loginMail;

    public void ınputMail() {

        loginMail.sendKeys("tuba@mailinator.com");

    }

    @FindBy(id = "password")

    public WebElement password;

    public void ınputPassword() {

        password.sendKeys("tuba3436");
    }

    @FindBy(id = "userLoginSubmitButton")

    public WebElement SubmitButton;

    public void loginSubmitButton() {

        SubmitButton.click();
    }

    @FindBy(id = "searchText")

    public WebElement searchText;

    public void getSearchText() {

        searchText.sendKeys("ıphone 13 pro max");

    }

    @FindBy(css ="[value = 'Ara']")
    public WebElement searchButton;

    public void clickSearchButton(){
        searchButton.click();

    }
    @FindBy(id = "post-new-classified")

    public WebElement postClassifiedButton;

    public void clickPostClassifiedButton() {
        postClassifiedButton.click();
    }

}


