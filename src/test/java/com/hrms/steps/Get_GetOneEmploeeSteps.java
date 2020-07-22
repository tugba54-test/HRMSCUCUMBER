package com.hrms.steps;

import javax.xml.ws.Response;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;

public class Get_GetOneEmploeeSteps {
	
	
	/**Please import the following import static io.restassured.RestAsured.*
	 * you need to manually type it
	 */
			
	private static RequestSpecification request;
	private Response response;
	
	@Given("User creates request for retrieving one employee")
	public void user_creates_request_for_retrieving_one_employee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("getOneEmployee retrieves response")
	public void getoneemployee_retrieves_response() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Status code is {int} for getOneEmployee")
	public void status_code_is_for_getOneEmployee(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User  asserts given employee is retrieved")
	public void user_asserts_given_employee_is_retrieved() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
