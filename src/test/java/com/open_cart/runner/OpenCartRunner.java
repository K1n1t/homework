package com.open_cart.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/OpenCart",
        glue = "com/open_cart/steps",
        dryRun = false,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty", "json:target/cucumber-reports/Cucumber.json"}
        //monochrome = true
)
public class OpenCartRunner {


}
