package org.applaudo.automation;

import org.applaudo.automation.taller5.BaseTest;
import org.testng.annotations.Test;
import org.applaudo.automation.taller5.GooglePage;

public class SearchMarcaTest extends BaseTest {

    GooglePage google;

    @Test
    public void googleSearchMarca(){
        google = new GooglePage(driver);
        google.typeMarca();
    }
}
