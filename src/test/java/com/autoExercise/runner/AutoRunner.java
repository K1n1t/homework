package com.autoExercise.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/autoExercise/autoContactUs",
        glue = "com/autoExercise/steps",
        dryRun = true,
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)
public class AutoRunner {

}
