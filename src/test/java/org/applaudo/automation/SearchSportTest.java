package org.applaudo.automation;

import org.applaudo.automation.taller5.BaseTest;
import org.applaudo.automation.taller5.GooglePage;
import org.applaudo.automation.taller5.SportPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchSportTest extends BaseTest {

    GooglePage google;
    SportPage sport;

    @BeforeMethod(enabled = true)
    public void googleSearchSport() throws InterruptedException {
        google = new GooglePage(driver);
        sport = new SportPage(driver);
        google.typeSport();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sport.getCookiesButton().click();
    }

    @Test(priority = 0, groups = "sport")
    public void checkSportFields() throws InterruptedException {
        sport.checkSport();
    }

    @Test(priority = 1, groups = "sport")
    public void clickUsa(){
        sport.getUsaMenu().click();
    }

    @Test(priority = 2, groups = "sport")
    public void clickVenezuela(){
        sport.getVenezuelaMenu().click();
    }

    @Test(priority = 3, groups = "sport")
    public void clickColombia(){
        sport.getColombiaMenu().click();
    }

    @Test(priority = 4, groups = "sport")
    public void clickChile(){
        sport.getChileMenu().click();
    }

    @Test(priority = 5, groups = "sport")
    public void clickMexico(){
        sport.getMexicoMenu().click();
    }

    @Test(priority = 6, groups = "sport")
    public void clickArgentina(){
        sport.getArgentinaMenu().click();
    }

    @Test(priority = 7, groups = "sport")
    public void clickUk(){
        sport.getUkMenu().click();
    }
}
