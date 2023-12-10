package com.tublr.steps_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class TubmlrHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver() {
        BrowserUtil2.getURL(driver, "tumblrURL");
    }
}
