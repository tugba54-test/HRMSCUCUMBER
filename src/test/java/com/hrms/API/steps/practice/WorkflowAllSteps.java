package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.hrms.API.utils.APIConstants;
import com.hrms.API.utils.PayloadConstants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class WorkflowAllSteps {
	
	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	
	RequestSpecification request;
	Response response;
	static String employeeID;
	
	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
		request =given().header("Content-Type", "application/json").header("Authorization", TokenGenerationSteps.token)
				.body(PayloadConstants.createEmployeePayload());
	}
	@When("a POST call is made to create an employee")
	public void a_POST_call_is_made_to_create_an_employee() {
		response = request.when().post(APIConstants.CREATE_EMPLOYEE_ENDPOINT);
	}
	@Then("the status code for creating an employee is {int}")
	public void the_status_code_for_creating_an_employee_is(int statusCode) {
		response.then().assertThat().statusCode(statusCode);
	}
	@Then("the employee is  created and response contains key {string} and value {string}")
	public void the_employee_is_created_and_response_contains_key_and_value(String key, String value) {
		response.then().assertThat().body(key, equalTo(value));
	}
	@Then("the employee ID {string} is stored as a global variable to be used for other calls")
	public void the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls(String empId) {
		 employeeID=response.body().jsonPath().getString(empId);
		System.out.println( employeeID);
	}
	
	@Given("a request is prepared to retrieve the created employee")
	public void a_request_is_prepared_to_retrieve_the_created_employee() {
	  request=given().header("Content-Type", "application/json").header("Authorization", TokenGenerationSteps.token)
			  .queryParam("employee_id",employeeID );
	}

	@When("a GET call is made to retrieve the created employee")
	public void a_GET_call_is_made_to_retrieve_the_created_employee() {
	   
		response=request.when().get(APIConstants.GET_ONE_EMPLOYEE_ENDPOINT);
		response.prettyPrint();
	}

	@Then("the status code for retrieving the created employee is {int}")
	public void the_status_code_for_retrieving_the_created_employee_is(Integer int1) {
	    response.then().assertThat().statusCode(int1);
	}

	@Then("the retrieved employee IDat {string} matches the globaly stored employee ID")
	public void the_retrieved_employee_IDat_matches_the_globaly_stored_employee_ID(String string) {
		String act=response.jsonPath().getString(string);
		//String empID = response.body().jsonPath().getString("employee[0].employee_id");
		//boolean verifyingEmpoyeeIDsMatch = empID.contentEquals(employeeID);
		Assert.assertTrue(act.contentEquals(employeeID));
	}

	@Then("the retrieved data at {string} matches the data used to create an employee with employee ID {string}")
	public void the_retrieved_data_at_matches_the_data_used_to_create_an_employee_with_employee_ID(String employeeObject, String responseEmployeeID, DataTable dataTable) {
	  List<Map<String ,String>> expectedData=dataTable.asMaps(String.class, String.class);	
		List<Map<String, String>> actualData =  response.jsonPath().get(employeeObject);		
		int index = 0;		
		for(Map<String, String> map : expectedData) {			
			Set<String> keys = map.keySet();		
			for(String key : keys) {
				String expectedValue = map.get(key);
				String actualValue = actualData.get(index).get(key);
				Assert.assertEquals(expectedValue, actualValue);
			}			
			index ++;			
		}	
		String empID = response.body().jsonPath().getString(responseEmployeeID);
		Assert.assertTrue(empID.contentEquals(employeeID));
	}
	   
	}



	