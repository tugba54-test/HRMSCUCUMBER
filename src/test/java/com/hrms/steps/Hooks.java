package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {
	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario -->" + scenario.getName());
		setUp();

	}

	@After
	public void end(Scenario scenario) {

		System.out.println("Ending scenario -->" + scenario.getName());
		byte[] pic;
		if (scenario.isFailed()) {
			pic = CommonMethods.takesScreenshot("failed/" + scenario.getName());
		} else {
			pic = CommonMethods.takesScreenshot("passed/" + scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());
		tearDown();
	}
}