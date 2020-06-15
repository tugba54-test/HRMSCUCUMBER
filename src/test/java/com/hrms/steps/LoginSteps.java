package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	@Given("I enter valid username")
	public void i_enter_valid_username() {
		BaseClass.setUp();
		sendText(login.username, "Admin");

	}

	@Given("I enter valid password")
	public void i_enter_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click login button")
	public void i_click_login_button() {
		jsClick(login.loginBtn);

	}

	@Then("I succesfully login HRMS")
	public void i_succesfully_login_HRMS() {
		boolean isLogoDisplayed = dashboard.logo.isDisplayed();
		Assert.assertTrue(isLogoDisplayed);
		tearDown();

	}

	@Given("I enter username {string}")
	public void i_enter_username(String string) {
		BaseClass.setUp();
		sendText(login.username, string);

	}

	@Then("i enter password {string}")
	public void i_enter_password(String string) {
		sendText(login.password, string);

	}

	@Then("I see  {string}")
	public void i_see(String string) {
		jsClick(login.loginBtn);
		String actErrMsg = login.errorMsg.getText();
		Assert.assertEquals("Error message mismatch", string, actErrMsg);
	}

	@When("i enter username and password I see error message")
	public void i_enter_username_and_password_I_see_error_message(io.cucumber.datatable.DataTable credentials) {

		BaseClass.setUp();
		List<Map<String, String>> maps = credentials.asMaps();

		for (Map<String, String> map : maps) {
			sendText(login.username, map.get("username"));
			sendText(login.password, map.get("password"));
			click(login.loginBtn);

			String actErrMsg = login.errorMsg.getText();
			String exErrMsg = map.get("errorMsg");
			Assert.assertEquals("Error message mismatch", exErrMsg, actErrMsg);

		}

	}

	@When("i enter username and password I see error message without header")
	public void i_enter_username_and_password_I_see_error_message_without_header(io.cucumber.datatable.DataTable dataTable) {
	   
		setUp();
		List<List<String>> lists = dataTable.asLists();
		for (List<String> list : lists) {
		sendText(login.username, list.get(0));	
		sendText(login.password, list.get(1));
			click(login.loginBtn);
			
			String actErrMsg = login.errorMsg.getText();
			String exErrMsg = list.get(2);
			Assert.assertEquals("Error message mismatch", exErrMsg, actErrMsg);

	   
	}



}}