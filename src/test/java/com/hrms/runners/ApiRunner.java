package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // configutation our class
@CucumberOptions(features = "src/test/resources/features/APIWorkflow.feature/"// "classpath:features"
		, glue = "com/hrms/API/steps/practice",
		dryRun = false,
		// DRY Don't repeat yourself,if set true scan all gherkinsteps
		// have implementation code
		monochrome = true,
        strict = true, 
		tags = "@workflow",
				 plugin = { "pretty",
				    		"html:target/cucumber-default-report",
							"json:target/cucumber.json"
							//"rerun:target/failed.txt"
			}
	    

)

public class ApiRunner {

}
