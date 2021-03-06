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
    private By sportLink = By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.r > a > div > cite");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBar() {
        return driver.findElement(searchBar);
    }

    public WebElement getSearchBtn() {
        return driver.findElement(searchBtn);
    }

    public By getLuckyButton() {
        return luckyButton;
    }

    public By getMarcaLink() {
        return marcaLink;
    }

    public void typeMarca() throws InterruptedException {
        getSearchBar().sendKeys("marca",Keys.ENTER);
        Thread.sleep(3000);
        System.out.println("Buscando Marca");
        driver.findElement(marcaLink).click();
    }

    public void typeSport(){
        getSearchBar().sendKeys("sport",Keys.ENTER);
        System.out.println("Buscando Sport");
        driver.findElement(marcaLink).click();
    }

    public void typeSearchKeyword(){
        getSearchBar().sendKeys("sport",Keys.ENTER);
        System.out.println("Buscando Sport");
        driver.findElement(marcaLink).click();
    }

}
