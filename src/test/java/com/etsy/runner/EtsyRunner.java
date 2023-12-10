package com.etsy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class will run all our feature files or our test in one place whitch is EtsyRunner
@Run with annotation comes from JUnit, this will run out feature files and stepDefinitions

@CucumberOptions it's just special class with some keywords

feature = we need to provide the path of feature files ex: src/test/resource/etsy

glue = here we provide the path for stepDefinition class. It does not start from src instead
        it will start from under green java folder (test source folder)
        ex: com/etsy/step_definition

 dryRun = it will indicate whether our test should run or not based on true/false
            if we set dryRun = true, then our test will not run and if we are missing our
            snippets this dryRun = false, it will run our tests

 tags = is needed when we give tag names in our feature file
          ex:
          if etsy.feature file has a tag as @smoke at the beginning, based on that tag
          our test will run. We can provide multiple tags such as @smoke, @regression
          naming of tags do not matter.
 */

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/etsy",  // is the location of our feature files
        glue = "com/etsy/step_definitions",   // this is the path/location of our step/definitions
        dryRun = false, //this can be toggled between true and false. See the note above
        tags = "@smoke"

)
public class EtsyRunner {

}
