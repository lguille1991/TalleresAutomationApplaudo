package org.applaudo.automation.taller5;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SportPage {
    WebDriver driver;


    private By españaMenu = By.cssSelector("a[href='https://www.sport.es/es/']");
    private By usaMenu = By.cssSelector("a[href='https://www.sport.es/us/']");
    private By venezuelaMenu = By.cssSelector("a[href='https://www.sport.es/ve/']");
    private By colombiaMenu = By.cssSelector("a[href='https://www.sport.es/co/']");
    private By chileMenu = By.cssSelector("a[href='https://www.sport.es/cl/']");
    private By mexicoMenu = By.cssSelector("a[href='https://www.sport.es/mx/']");
    private By argentinaMenu = By.cssSelector("a[href='https://www.sport.es/ar/']");
    private By ukMenu = By.cssSelector("a[href='https://www.sport.es/en/']");
    private By cookiesButton = By.id("didomi-notice-agree-button");
    private By sportHome = By.cssSelector("body > div.header.new-header.es > div.edition-lang > div");
    private By menuRibbon = By.cssSelector("body > div.header.new-header.es > div.edition-lang > div > div.editions >" +
            " ul > li");

    public SportPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getEspañaMenu() {
        return driver.findElement(españaMenu);
    }

    public WebElement getUsaMenu() {
        return driver.findElement(usaMenu);
    }

    public WebElement getVenezuelaMenu() {
        return driver.findElement(venezuelaMenu);
    }

    public WebElement getColombiaMenu() {
        return driver.findElement(colombiaMenu);
    }

    public WebElement getChileMenu() {
        return driver.findElement(chileMenu);
    }

    public WebElement getMexicoMenu() {
        return driver.findElement(mexicoMenu);
    }

    public WebElement getArgentinaMenu() {
        return driver.findElement(argentinaMenu);
    }

    public WebElement getUkMenu() {
        return driver.findElement(ukMenu);
    }

    public WebElement getCookiesButton() {
        return driver.findElement(cookiesButton);
    }

    public WebElement getSportHome() {
        return driver.findElement(sportHome);
    }

    public List<WebElement> getMenuRibbon() {
        return driver.findElements(menuRibbon);
    }

    public void checkSport() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(getMenuRibbon().size(),9);
        System.out.println("Expected: 9 | Actual: " + getMenuRibbon().size());
        sa.assertEquals(getEspañaMenu().getText(),"España");
        System.out.println("Expected: España | Actual: " + getEspañaMenu().getText());
        sa.assertEquals(getUsaMenu().getText(),"Estados Unidos");
        System.out.println("Expected: Estados Unidos | Actual: " + getUsaMenu().getText());
        sa.assertEquals(getVenezuelaMenu().getText(),"Venezuela");
        System.out.println("Expected: Venezuela | Actual: " + getVenezuelaMenu().getText());
        sa.assertEquals(getColombiaMenu().getText(),"Colombia");
        System.out.println("Expected: Colombia | Actual: " + getColombiaMenu().getText());
        sa.assertEquals(getChileMenu().getText(),"Chile");
        System.out.println("Expected: Chile | Actual: " + getChileMenu().getText());
        sa.assertEquals(getMexicoMenu().getText(),"México");
        System.out.println("Expected: México | Actual: " + getMexicoMenu().getText());
        sa.assertEquals(getArgentinaMenu().getText(),"Argentina");
        System.out.println("Expected: Argentina | Actual: " + getArgentinaMenu().getText());
        sa.assertEquals(getUkMenu().getText(),"Reino unido");
        System.out.println("Expected: Reino unido | Actual: " + getUkMenu().getText());
        sa.assertAll();
    }

    public void clickUsa(){
        getUsaMenu().click();
    }

    public void clickVenezuela(){
        getVenezuelaMenu().click();
    }

    public void clickColombia(){
        getColombiaMenu().click();
    }

    public void clickChile(){
        getChileMenu().click();
    }

    public void clickMexico(){
        getMexicoMenu().click();
    }

    public void clickArgentina(){
        getArgentinaMenu().click();
    }

    public void clickUk(){
        getUkMenu().click();
    }
}
