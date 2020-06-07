package com.hrms.steps;

import org.junit.Assert;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login1Steps extends CommonMethods {

	@Given("i enter  invalid username and password")
	public void i_enter_invalid_username_and_password() {

		sendText(login.username, "Ayse");
		sendText(login.password, "123456*&");
		jsClick(login.loginBtn);

	}

	

	
	
	@Then("i see error message")
	public void i_see_error_message() {
		
		 String Expected="Invalid credentials";
		  String act=login.errorMsg.getText();
		  Assert.assertEquals("mismatch Error message",Expected, act);
		  tearDown();
	    
	}
	
	@Given("user  navigated to HRMS")
	public void user_navigated_to_HRMS() {
	   BaseClass.setUp();
	}

	@When("user enters valid username and empty password")
	public void user_enters_valid_username_and_empty_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "");
		jsClick(login.loginBtn);
	}

	
	@Then("user see ?Password cannot be empty? error message")
	public void user_see_Password_cannot_be_empty_error_message() {
		String Expected="Username cannot be empty";
		  String actM=login.errorMsg.getText();
		  Assert.assertEquals("mismatch Error message",Expected, actM);
		  tearDown();
	}

	@Then("user see  ?Username cannot be empty? error message")
	public void user_see_Username_cannot_be_empty_error_message() {
		
		  String Expected="Password cannot be empty";
		  String act=login.errorMsg.getText();
		  Assert.assertEquals("mismatch Error message",Expected, act);
		  tearDown();
		}
	@Then("i see ?Password cannot be empty? error message")
	public void i_see_Password_cannot_be_empty_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("i see  ?Username cannot be empty? error message")
	public void i_see_Username_cannot_be_empty_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	}



	
	
	







