package org.applaudo.automation;

import org.applaudo.automation.taller5.BaseTest;
import org.applaudo.automation.taller5.MarcaPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.applaudo.automation.taller5.GooglePage;

import java.util.concurrent.TimeUnit;

public class SearchMarcaTest extends BaseTest {

    GooglePage google;
    MarcaPage marca;

    @BeforeMethod(enabled = true)
    public void googleSearchMarca() throws InterruptedException {
        google = new GooglePage(driver);
        marca = new MarcaPage(driver);
        google.typeMarca();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        marca.getCookiesButton().click();
    }

    @Test(priority = 0, groups = "marca")
    public void checkMarcaFields(){
        marca.checkMarca();
    }

    @Test(priority = 1, groups = "marca")
    public void clickFutbol(){
        marca.getFulbolMenu().click();
    }

    @Test(priority = 2, groups = "marca")
    public void clickBaloncesto(){
        marca.getBaloncestoMenu().click();
    }

    @Test(priority = 3, groups = "marca")
    public void clickMotor(){
        marca.getMotorMenu().click();
    }

    @Test(priority = 4, groups = "marca")
    public void clickPolideportivo(){
        marca.getPolideportivoMenu().click();
    }

    @Test(priority = 5, groups = "marca")
    public void clickMas(){
        marca.getMasMenu().click();
    }
}
