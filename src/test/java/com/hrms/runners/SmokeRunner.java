package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class) // configutation our class
@CucumberOptions(features = "src/test/resources/features/"// "classpath:features"
		, glue = "com/hrms/steps",
		dryRun = false,
		// DRY DOnt repeat yourself,if set true scan all gherkinsteps
		// have implementation code
		monochrome = true,
        strict = true, 
		tags = "@smoke",
	    plugin = { "pretty",
	    		"html:target/cucumber-default-report",
				"json:target/cucumber.json"
				//"rerun:target/failed.txt"
}
)

public class SmokeRunner {

}
