package com.amazon.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.ConfigReader;
import utils.DriverHelper;

public class AmazonHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("amazonURL"));
    }

    @After
    public void tearDown(Scenario scenario){
        BrowserUtil2.takeScreenshotCucumber(scenario, driver);
    }
}
