package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // configutation our class
@CucumberOptions(features = "@target/failed.txt"
		, glue = "com/hrms/steps",

		monochrome = true,

		plugin = { "pretty", 
				//"html:target/cucumber-default-report",

		})

public class FailedRunner {

}
