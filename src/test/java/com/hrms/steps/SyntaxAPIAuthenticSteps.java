package com.hrms.steps;

import javax.xml.ws.Response;

import org.junit.Test;

import io.cucumber.java.en.Given;

public class SyntaxAPIAuthenticSteps {
	/**Please import the following import static io.restassured.RestAsured.*
	 * you need to manually type it
	 */
			
	/**Declaring global and static variables*/
	
	private Response response;
	public static String Token;
	private static RequestSpecification request;
	
	@Given("user generates token")
	@Test
	public void user_generates_token() {
		request=given.header("Content-type","application/json").
				body(readJson(API_Constants.GENERATE_TOKEN_JSON_FILEPATH));
		
		
	response=request.when()post(API_Constants.GENERATE_TOKEN_URI);
	}

	
}
