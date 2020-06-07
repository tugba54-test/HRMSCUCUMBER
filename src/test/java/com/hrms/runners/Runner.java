package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)//configutation our class
@CucumberOptions(
		features="src/test/resources/features/SearchEmployee.feature"//"classpath:features"
		 ,glue="com/hrms/steps"
		, dryRun=true,//DRY DOnt repeat yourself,if set true scan all gherkinsteps
		//have implementation code
	  //  ,tags="smoke"
		//,strict=true
	 monochrome=true
		)
	
	public class Runner{
	
}
		