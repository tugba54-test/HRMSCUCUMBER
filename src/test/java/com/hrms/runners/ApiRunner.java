package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // configutation our class
@CucumberOptions(features = "src/test/resources/features/"// "classpath:features"
		, glue = "com/hrms/steps",
		dryRun = true,
		// DRY Don't repeat yourself,if set true scan all gherkinsteps
		// have implementation code
		monochrome = true,
        strict = true, 
		tags = "@testApiJune"
	    

)

public class ApiRunner {

}
