package org.applaudo.automation.taller5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    public WebDriver driver;
    public String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    @BeforeMethod
    public void launchBrowser(){
        //Create a map to store  preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

        //add key and value to map as follow to switch off browser notification
        //Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

        //Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

        System.setProperty("webdriver.chrome.driver", chromePath);
        String baseURL = "http://www.google.com/";
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
