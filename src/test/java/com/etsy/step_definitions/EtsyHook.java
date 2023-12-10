package com.etsy.step_definitions;

import org.junit.Before;
import org.openqa.selenium.Beta;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class EtsyHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void  setDriver(){
        driver.get(ConfigReader.readProperty("etsyURL"));
    }
}
