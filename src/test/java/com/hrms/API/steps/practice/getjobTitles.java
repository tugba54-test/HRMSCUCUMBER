package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import com.hrms.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getjobTitles {

	static String baseURI=RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	@Test
	public void getJobTitles(){
		
		RequestSpecification GetJobTitles=given().header("Content-type", "application/json")
				.header("Authorization", Constants.token).log().all();
		
		Response getJobTitleR=GetJobTitles.when().get("/jobTitle.php");
		
		getJobTitleR.prettyPrint();
		
		getJobTitleR.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void UpdateEmployee() {
		
		RequestSpecification UpdateEmpRequest=given().header("Content-type", "application/json")
				.header("Authorization", Constants.token).body("{\r\n" + 
						"  \"employee_id\": \"16447A\",\r\n" + 
						"  \"emp_firstname\": \"SyntaxUpdated\",\r\n" + 
						"  \"emp_lastname\": \"Updatedlast\",\r\n" + 
						"  \"emp_middle_name\": \"string\",\r\n" + 
						"  \"emp_gender\": \"F\",\r\n" + 
						"  \"emp_birthday\": \"2020-07-19\",\r\n" + 
						"  \"emp_status\": \"Employee\",\r\n" + 
						"  \"emp_job_title\": \"QA Tester\"\r\n" + 
						"}");
		
		Response UpdateResponse=UpdateEmpRequest.when().put("/updateEmployee.php");
		UpdateResponse.prettyPrint();
		
		UpdateResponse.then().assertThat().statusCode(200);
		
	}

}
