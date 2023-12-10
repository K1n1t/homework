package com.qa_fox.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/qaFox",
        glue = "com/qa_fox/steps_deffinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)

public class QAFoxRunner {
}
