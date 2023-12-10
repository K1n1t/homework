package com.qa_fox.steps_deffinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class QaFoxHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        BrowserUtil2.getURL(driver, "qaFoxURL");
    }
}
