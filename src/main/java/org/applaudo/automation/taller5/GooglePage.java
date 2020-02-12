package org.applaudo.automation.taller5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage{
    WebDriver driver;

    private By searchBar = By.name("q");
    private By searchBtn = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
    private By luckyButton = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnI']");
    private By marcaLink = By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > div > cite");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeMarca() {
        WebElement txtSearch = driver.findElement(searchBar);
        txtSearch.sendKeys("marca");
        txtSearch.sendKeys(Keys.ENTER);
        System.out.println("Buscando Marca");
        driver.findElement(marcaLink).click();
    }
}
