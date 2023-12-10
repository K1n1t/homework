package com.webOrder.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/webOrder",
        glue = "com/webOrder/steps",
        dryRun = false,
       // tags = "@smoke"
      plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
              "pretty", "json:target/cucumber-reports/Cucumber.json"}
        //monochrome = true
)

public class WebOrderRunner {
}
