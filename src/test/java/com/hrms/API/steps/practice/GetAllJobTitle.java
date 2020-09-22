package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.hrms.API.utils.APIConstants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllJobTitle {
	
String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	
	RequestSpecification request;
	Response response;
	static String employeeID;
	
	@Given("PO prepares request to retrieve all job titles")
	public void po_prepares_request_to_retrieve_all_job_titles() {
	    request=given().header("Content-type", "application/json")
				.header("Authorization", TokenGenerationSteps.token).log().all();
	}

	@When("PO Get call to retrieve the job titles")
	public void po_Get_call_to_retrieve_the_job_titles() {
	    response=request.when().get(APIConstants.GET_JOB_TITLES_ENDPOINT);
	    response.prettyPrint();
	}

	@Then("the status code for retrieving job titles is {int}")
	public void the_status_code_for_retrieving_job_titles_is(Integer int1) {
	    response.then().assertThat().statusCode(int1);
	}

	@Then("the retrieved job titles {string} is matches the data")
	public void the_retrieved_job_titles_is_matches_the_data(String jobtitle, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String ,String>> expectedData=dataTable.asMaps(String.class, String.class);	
		List<Map<String, String>> actualData =  response.jsonPath().get(jobtitle);		
		int index = 0;		
   for(Map<String,String> map:expectedData) {
	   Set<String> keys= map.keySet();
	   for(String key:keys){
		   String expectedValue =map.get(key);
		   String actualValue =actualData.get(index).get(key);
		   Assert.assertEquals("it is not equal",expectedValue, actualValue);
	   }
	   index++;
   }
	}




}
