package org.applaudo.automation.taller5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarcaPage {
    WebDriver driver;

    private By marcaLink = By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > div > cite");
    private By fulbolMenu = By.cssSelector("a[data-menu-active='futbol']");
    private By fulbolBaloncesto = By.cssSelector("a[data-menu-active='futbol']");
    private By fulbolMotor = By.cssSelector("a[data-menu-active='futbol']");
    private By fulbolPolideportivo = By.cssSelector("a[data-menu-active='futbol']");
    private By fulbolMenu2 = By.cssSelector("a[data-menu-active='futbol']");

}
