package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class TokenGenerationSteps {

	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	public static String token;

	@Given("a JWT is generated")
	public void a_JWT_is_generated() {

		RequestSpecification generateTokenRequest = given().header("Content-type", "application/json")
				.body("{\r\n" + "\"email\":\"akcatugba@yahoo.com\",\r\n" + "\"password\": \"123Kub\"\r\n" + "}");

		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php\r\n" + "");

		// generateTokenResponse.prettyPrint();
		token = "Bearer " + generateTokenResponse.body().jsonPath().getString("token");

		System.out.println(token);

	}

}
