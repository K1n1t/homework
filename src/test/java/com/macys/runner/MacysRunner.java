package com.macys.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = "src/test/resources/macys",
    glue = "com/macys/steps",
    dryRun = false,
    //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
      //      "pretty", "json:target/cucumber-reports/Cucumber.json"}
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)

public class MacysRunner {
}
