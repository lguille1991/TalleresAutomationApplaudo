package org.applaudo.automation.taller5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MarcaPage {
    WebDriver driver;

    private By fulbolMenu = By.cssSelector("a[data-menu-active='futbol']");
    private By baloncestoMenu = By.cssSelector("a[data-menu-active='baloncesto']");
    private By motorMenu = By.cssSelector("a[data-menu-active='motor']");
    private By polideportivoMenu = By.cssSelector("a[data-menu-active='default']");
    private By masMenu = By.className("show-more-menu");
    private By cookiesButton = By.id("didomi-notice-agree-button");
    private By menuRibbon = By.cssSelector("body > header > div.main-nav-container > div > nav > ul > li");

    public MarcaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFulbolMenu() {
        return driver.findElement(fulbolMenu);
    }

    public WebElement getBaloncestoMenu() {
        return driver.findElement(baloncestoMenu);
    }

    public WebElement getMotorMenu() {
        return driver.findElement(motorMenu);
    }

    public WebElement getPolideportivoMenu() {
        return driver.findElement(polideportivoMenu);
    }

    public WebElement getMasMenu() {
        return driver.findElement(masMenu);
    }

    public WebElement getCookiesButton() {
        return driver.findElement(cookiesButton);
    }

    public List<WebElement> getMenuRibbon() {
        return driver.findElements(menuRibbon);
    }

    public void checkMarca(){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(getMenuRibbon().size(),6);
        System.out.println("Expected: 6 | Actual: " + getMenuRibbon().size());
        sa.assertEquals(getFulbolMenu().getText(),"Fútbol");
        System.out.println("Expected: Fútbol | Actual: " + getFulbolMenu().getText());
        sa.assertEquals(getBaloncestoMenu().getText(),"Baloncesto");
        System.out.println("Expected: Baloncesto | Actual: " + getBaloncestoMenu().getText());
        sa.assertEquals(getMotorMenu().getText(),"Motor");
        System.out.println("Expected: Motor | Actual: " + getMotorMenu().getText());
        sa.assertEquals(getPolideportivoMenu().getText(),"Polideportivo");
        System.out.println("Expected: Polideportivo | Actual: " + getPolideportivoMenu().getText());
        sa.assertEquals(getMasMenu().getText(),"Más");
        System.out.println("Expected: Más | Actual: " + getMasMenu().getText());
        sa.assertAll();

        /*getFulbolMenu().click();
        driver.navigate().back();
        getBaloncestoMenu().click();
        driver.navigate().back();
        getMotorMenu().click();
        driver.navigate().back();
        getPolideportivoMenu().click();
        driver.navigate().back();
        getMasMenu().click();*/

    }
}
