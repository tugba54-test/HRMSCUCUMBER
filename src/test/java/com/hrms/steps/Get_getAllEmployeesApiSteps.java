package com.hrms.steps;

import static io.restassured.RestAssured.given;

import javax.xml.ws.Response;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;

public class Get_getAllEmployeesApiSteps extends CommonMethods{
	
	private static RequestSpecification request;
	private io.restassured.response.Response response;
	
	@Given("user generates token")
	public void user_generates_token() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User creates request for SyntaxApi")
	public void user_creates_request_for_SyntaxApi() {
	   request=given().header("Authorization",SyntaxAPIAuthenticSteps.Token);
	}

	@When("getAllEmployees retrieves response")
	public void getallemployees_retrieves_response() {
	    response=request.when().get("/getAllEmployees.php");
	    response.prettyPrint();
	}

	@Then("Status Code is {int} for getAllEmployees")
	public void status_Code_is_for_getAllEmployees(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
