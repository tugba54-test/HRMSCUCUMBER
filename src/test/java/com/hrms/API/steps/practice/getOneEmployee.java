package com.hrms.API.steps.practice;

import org.junit.Test;

import com.hrms.utils.Constants;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getOneEmployee {
	
	static String baseURI=RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	
	@Test
	public void GetUpdatedEmployee() {
		
		RequestSpecification getOneEmRequest=given().header("Content-type","application/json").header("Authorization",Constants.token)
				.queryParam("employee_id","16447A");
		
		Response getOneResponse=getOneEmRequest.when().get("/getOneEmployee.php");
		
		getOneResponse.prettyPrint();
		getOneResponse.then().assertThat().statusCode(200);
		
		
	}

}
