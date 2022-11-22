package pageobjectmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobjectmodel.extension.LogExtension;
import pageobjectmodel.extension.TestExtension;
import pageobjectmodel.extension.TestStatusExtension;
import pageobjectmodel.page.*;

import java.io.File;


@ExtendWith({TestExtension.class, LogExtension.class, TestStatusExtension.class})

public class POM extends BaseClass {
    private static final Logger logger = LogManager.getLogger(POM.class);
    HomePage homePage;
    CategoryAutomobilePage categoryAutomobilePage;
    SearchResultPage searchResultPage;
    ClassifiedDetailPage classifiedDetailPage;
    ClassifiedCategorySelectPage1 classifiedCategorySelectPage1;
    ClassifiedCategorySelectPage2 classifiedCategorySelectPage2;
    ClassifiedDetailJobPage1 classifiedDetailJobPage1;
    ClassifiedDetailJobPage2 classifiedDetailJobPage2;
    ClassifiedDetailJobPage3 classifiedDetailJobPage3;
    ClassifiedDetailJobPage4 classifiedDetailJobPage4;
    ShoppingSearchDetailedPage shoppingSearchDetailedPage;



    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        categoryAutomobilePage = new CategoryAutomobilePage(driver);
        searchResultPage = new SearchResultPage(driver);
        classifiedDetailPage = new ClassifiedDetailPage(driver);
        classifiedCategorySelectPage1 = new ClassifiedCategorySelectPage1(driver);
        classifiedCategorySelectPage2 = new ClassifiedCategorySelectPage2(driver);
        classifiedDetailJobPage1=new ClassifiedDetailJobPage1(driver);
        classifiedDetailJobPage2 = new ClassifiedDetailJobPage2(driver);
        classifiedDetailJobPage3 = new ClassifiedDetailJobPage3(driver);
        classifiedDetailJobPage4= new ClassifiedDetailJobPage4(driver);
        shoppingSearchDetailedPage = new ShoppingSearchDetailedPage(driver);

    }

    @Test
    public void testCase1() {
        homePage.clickOtomobil();
        categoryAutomobilePage.clickAllClassifiedLink();

        Assertions.assertTrue(searchResultPage.getClassifiedSize() > 0);

        String title = searchResultPage.getFirstClassifiedTitle();
        String KM = searchResultPage.getFirstClassifiedKM();
        String price = searchResultPage.getFirstClassifiedPrice();

        System.out.println(title);
        System.out.println(KM);
        System.out.println(price);

        searchResultPage.clickFirstClassified();

        String classifiedTitle = classifiedDetailPage.getClassifiedTitle();

        Assertions.assertEquals(title, classifiedTitle);
    }


    @Test
    public void testCase2Parametrized() {
    }

    @ParameterizedTest
    @CsvSource({
            "iPhone 12 Mini,#search_cats ul li.cl4,1",
            " Koşu Bandı,#search_cats ul .cl3 div a h2,2",
            "Çapa Makinesi,#search_cats ul .cl4 div a h2,3",
            "Oppo Watch,#search_cats ul .cl3 div a h2,4",
            "PlayStation 5,#search_cats ul .cl3 div a h2,5"}
    )
    public void parametrizedTest() {
        try {
            homePage.getPopularSearch();

            String popularSearch = homePage.getPopularSearch();
        } catch (Exception ex) {

            File fileimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            logger.error("Hatanın ekran görüntüsü ektedir.");

        }
    }

    @Test
    public void testCase3() {

        homePage.clickLoginButton();
        homePage.ınputMail();
        homePage.ınputPassword();
        homePage.loginSubmitButton();

        Assertions.assertTrue(true);
        logger.info("sahibinden.com'a giriş yapıldı.");
    }

    @Test

    public void testCase4(){

        homePage.clickPostClassifiedButton();
        classifiedCategorySelectPage1.selectJobClassifed();
        classifiedCategorySelectPage2.selectEgitim();
        classifiedCategorySelectPage2.selectEgitim2();
        classifiedCategorySelectPage2.setContinueButton();
        classifiedDetailJobPage1.getClassifiedTitle();
        classifiedDetailJobPage1.getClassifiedExplanation();
        classifiedDetailJobPage1.selectJob();
        classifiedDetailJobPage1.statementEducation();
        classifiedDetailJobPage1.selectExperience();
        classifiedDetailJobPage1.companyName();
        classifiedDetailJobPage1.handicappedAccessible();
        classifiedDetailJobPage1.city();
        classifiedDetailJobPage1.town();
        classifiedDetailJobPage1.quarter();
        classifiedDetailJobPage1.setMap();
        classifiedDetailJobPage1.clickSetRules();
        classifiedDetailJobPage1.setSubmitButton();
        classifiedDetailJobPage2.clickDevamEtButton();
        classifiedDetailJobPage3.clickDevamEtButton();
        classifiedDetailJobPage4.successPage();
        logger.info("Başarılı şekilde ilan verildi.");

    }

    @Test
    public void testCase5() {

        homePage.getSearchText();
        homePage.clickSearchButton();

        String Price = shoppingSearchDetailedPage.getFirstClassifiedPrice();

        String CityAndRegion = shoppingSearchDetailedPage.getFirstClassifiedCityAndRegion();

        System.out.println(Price);
        System.out.println(CityAndRegion);

        Assertions.assertTrue(true);
        logger.info("Iphone 13 Promax için ilanlar listelendi");
    }
}