package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods{
	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario -->"+scenario.getName());
		setUp();
	
	}
	
	@After
	public void end() {
		// System.out.println("Ending scenario -->"+scenario.getName());
//		if(scenario.isFailed()) {
//			System.out.println("Test FAIL -->"+ scenario.getName());
//			byte[] picture=takesScreenshot("/failed/"+scenario.getName());
//			scenario.embed(picture, "image/png");
//		}else {
//			System.out.println("Test PASS -->"+ scenario.getName());
//			byte[] picture=takesScreenshot("/passed/"+scenario.getName());
//			scenario.embed(picture, "image/png");
//		}
		tearDown();
	}
}

