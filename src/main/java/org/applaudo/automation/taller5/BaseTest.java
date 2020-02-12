package org.applaudo.automation.taller5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", chromePath);
        String baseURL = "http://www.google.com/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
