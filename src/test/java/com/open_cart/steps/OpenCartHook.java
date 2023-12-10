package com.open_cart.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class OpenCartHook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("openCartURL"));
    }
}
