package pageobjectmodel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.TreeMap;

public class ClassifiedDetailJobPage1 extends BasePage{
    public ClassifiedDetailJobPage1(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css="[name='addClassifiedTitle']")
    public WebElement  classifiedTitle;

    @FindBy (id = "taTextElement7829143795501")
   public  WebElement classifiedExplanation;

    @FindBy(name="a103511")
    public WebElement ınterruptedException;

    @FindBy(name="a103512")
    public WebElement statementEducation;

    @FindBy(name="a103513")
    public WebElement selectExperience;

    @FindBy(name = "a104428")
    public WebElement companyName;

    @FindBy(name="a106397")
    public WebElement handicappedAccessible;

    @FindBy(name="town")
    public WebElement townSelect;

    @FindBy(name="city")
    public WebElement citySelect;

    @FindBy(name="town")
    public WebElement quarterSelect;

    @FindBy(css="[aria-label='Map']")
    public WebElement selectMap;

    @FindBy(css="[for='postRulesCheck']")
    public WebElement clickRules;

    @FindBy(css=".add-classified-footer button")
    public WebElement submitButton;


    public void getClassifiedTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElements(classifiedTitle));
        classifiedTitle.sendKeys("Test İş ilanı Test ilan İlan Matematik öğretmeni");
    }

    public void getClassifiedExplanation()
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(classifiedExplanation));
        classifiedExplanation.sendKeys("Açıklama Eğitmen İlan Test");
    }

    public void selectJob(){

        Select selectJob = new Select(ınterruptedException);
        selectJob.selectByVisibleText("Tam Zamanlı (Full Time");
    }

    public void statementEducation(){

        Select selectEducationStatement = new Select(statementEducation);
        selectEducationStatement.selectByVisibleText("En Az Üniversite Mezunu");
    }

    public void selectExperience() {

        Select experience = new Select(selectExperience);
        experience.selectByVisibleText("En Az 4 Yıl");
}

    public void companyName(){
        wait.until(ExpectedConditions.visibilityOfAllElements(companyName));
         companyName.sendKeys("Tuba Eğitim Kurumu");
}

    public void handicappedAccessible(){

        Select selectHandicappedAccessible = new Select(handicappedAccessible);
        selectHandicappedAccessible.selectByVisibleText("Evet");
}

     public void city ()
{
    Select selectCity = new Select(citySelect);
    selectCity.selectByValue("object:1047");
 }

       public void town ()
    {
        Select selectTown= new Select(townSelect);
        selectTown.selectByValue("object:1136");
    }


    public void quarter ()
    {
        Select selectQuarter = new Select(quarterSelect);
        selectQuarter.selectByValue("object:1201");
    }

    public void setMap(){

        selectMap.click();
    }

    public void clickSetRules ()
    {
        clickRules.click();
    }

       public void setSubmitButton(){
        submitButton.click();
    }

}
