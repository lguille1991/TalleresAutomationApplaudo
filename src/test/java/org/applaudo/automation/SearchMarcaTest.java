package org.applaudo.automation;

import org.applaudo.automation.taller5.BaseTest;
import org.applaudo.automation.taller5.MarcaPage;
import org.testng.annotations.Test;
import org.applaudo.automation.taller5.GooglePage;
import org.testng.asserts.SoftAssert;

public class SearchMarcaTest extends BaseTest {

    GooglePage google;
    MarcaPage marca;

    @Test
    public void googleSearchMarca() throws InterruptedException {
        google = new GooglePage(driver);
        marca = new MarcaPage(driver);
        google.typeMarca();
        marca.checkMarca();
    }
}
