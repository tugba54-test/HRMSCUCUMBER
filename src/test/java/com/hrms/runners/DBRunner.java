package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class) // configutation our class
@CucumberOptions(features = "src/test/resources/features/Database.feature"// "classpath:features"
		, glue = "com/hrms/DbSteps",
		dryRun = false,
		// DRY DOnt repeat yourself,if set true scan all gherkinsteps
		// have implementation code
				 plugin = { "pretty",
				    		"html:target/html/cucumber-dbTesting",
							"json:target/cucumber.json"},
		monochrome = true
       // tags= {};
)

public class DBRunner {

}
