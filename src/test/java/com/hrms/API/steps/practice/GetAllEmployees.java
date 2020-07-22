package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	    @Test
		public void getAllEMployee() {
			
		RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTQ4OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTEzODA5MSwidXNlcklkIjoiNDkyIn0.E9yzfdZrrRSwsIbDH3gIdTEpjpr9w1-H13WqDb2BMqk";

		/**
		 * Preparing getOneEmployee.php request
		 */
		RequestSpecification getAllEmployeeRequest = given().header("Content-type", "application/json")
				.header("Authorization", token).log().all();
		
		 Response getAllEmployeeResponse=getAllEmployeeRequest.when().get("/getAllEmployees.php");
		 
		 /**
		  * Two ways response
		  * prettyPrint(0 method converts Json object into String and prints
		  * no need to syso
		  */
		 
		 getAllEmployeeResponse.prettyPrint();
		// String response=getOneEmployeeResponse.body().asString();
		 
		 getAllEmployeeResponse.then().assertThat().statusCode(201);
	}

	}



