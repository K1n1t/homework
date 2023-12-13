package com.luma.steps_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class LumaHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("lumaURL"));
    }
}
