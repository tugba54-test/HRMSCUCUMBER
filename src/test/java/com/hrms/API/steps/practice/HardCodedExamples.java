package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
/**
 * We may use below -please comment out for now
 */
//import org.apache.hc.core5.http.ContentType;

import com.hrms.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 *@FixMethodOrder(MethodSorters.NAME_ASCENDING) will execute @Test 
 *annotation in ascending alphabetical order 
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodedExamples {
	
	static String empId;

	/**
	 * Rest Assured 
	 * given -prepare your request
	 *  when -you are making the call to the endpoint  
	 * then-validating,verification, assertion
	 * 
	 * @param args
	 */
	
	static String baseURI=RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	
	//@Test
	public void sampleTestNotes() {
		RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTQ4OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTEzODA5MSwidXNlcklkIjoiNDkyIn0.E9yzfdZrrRSwsIbDH3gIdTEpjpr9w1-H13WqDb2BMqk";

		/**
		 * Preparing getOneEmployee.php request
		 */
		RequestSpecification getOneEmployeeRequest = given().header("Content-type", "application/json")
				.header("Authorization", Constants.token).queryParam("employee_id", "16490A").log().all();
		
		 Response getOneEmployeeResponse=getOneEmployeeRequest.when().get("/getOneEmployee.php");
		 
		 /**
		  * Two ways response
		  * prettyPrint(0 method converts Json object into String and prints
		  * no need to syso
		  */
		 
		 getOneEmployeeResponse.prettyPrint();
		// String response=getOneEmployeeResponse.body().asString();
		 
		 getOneEmployeeResponse.then().assertThat().statusCode(200);
	}

	//@Test
	public void POSTcreateEmployee() {
		
		RequestSpecification createEmployeeRequest=given().header("Content-type", "application/json")
		.header("Authorization", Constants.token).body("{\r\n" + 
				"  \"emp_firstname\": \"Prince\",\r\n" + 
				"  \"emp_lastname\": \"Abdul\",\r\n" + 
				"  \"emp_middle_name\": \"Tugba\",\r\n" + 
				"  \"emp_gender\": \"M\",\r\n" + 
				"  \"emp_birthday\": \"1985-03-11\",\r\n" + 
				"  \"emp_status\": \"Employee\",\r\n" + 
				"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
				"}");
		
		
		/**
		 * Storing response into createEmployeeResponse
		 */
		 Response createEmployeeResponse=createEmployeeRequest.when().post("/createEmployee.php");
		 createEmployeeResponse.prettyPrint();
		 
		 empId=createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		 System.out.println(empId);
		createEmployeeResponse.then().assertThat().statusCode(201);
		
		/**
		 * Verifying message using equalTo() method-manually import static package
		 * import static org.hamcrest.Matchers.*;
		 */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
		
		/**
		 * Verifiying created First name
		 */
		
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname",equalTo("Prince"));
		
		//createEmployeeResponse.then().assertThat().header("User-Agent","PostmanRuntime/7.26.1");
		
		RequestSpecification getCreatedEmployeeRqt=given().header("Content-Type", "application/json")
		.header("Authorization", Constants.token).queryParam("employee_id",empId);
		
		Response getCreatedEmployeeRespnse=getCreatedEmployeeRqt.when().get("/getOneEmployee.php");
		
		String response=getCreatedEmployeeRespnse.prettyPrint();
		getCreatedEmployeeRespnse.then().assertThat().statusCode(200);
		
		String EmpId2=getCreatedEmployeeRespnse.body().jsonPath().getString("employee[0].employee_id");
		System.out.println(empId+" "+EmpId2);
		Boolean verifyEmpId=empId.equalsIgnoreCase(EmpId2);
		Assert.assertTrue(verifyEmpId);
		
		JsonPath js=new JsonPath(response);
		String empId3=js.get("employee[0].employee_id");
		String empfirst=js.get("employee[0].emp_firstname");
		String empmiddle=js.get("employee[0].emp_middle_name");
		String empLast=js.get("employee[0].emp_lastname");
		String empbirth=js.get("employee[0].emp_birthday");
		String empG=js.get("employee[0].emp_gender");
		String empJobTitle=js.get("employee[0].emp_job_title");
		String empStatus=js.get("employee[0].emp_status");
		System.out.println(empId3+" "+empfirst+" "+empmiddle+" "+empLast+" "+empbirth+" "+empG+" "+empJobTitle+" "+empStatus);
		
		/** Verifying expected firstname matches actual first name*/
		Assert.assertTrue(empfirst.contentEquals("Prince"));
		Assert.assertTrue(empmiddle.contentEquals("Tugba"));
		Assert.assertTrue(empLast.contentEquals("Abdul"));
		Assert.assertTrue(empbirth.contentEquals("1985-03-11"));
		Assert.assertTrue(empG.contentEquals("Male"));
		Assert.assertTrue(empJobTitle.contentEquals("Cloud Architect"));
		Assert.assertTrue(empStatus.contentEquals("Employee"));
	}
	
	//@Test
	public void GetAllEmployees() {
		
		RequestSpecification getAllEmployeeRequest = given().header("Content-type", "application/json")
				.header("Authorization", Constants.token).log().all();
		
		 Response getAllEmployeeResponse=getAllEmployeeRequest.when().get("/getAllEmployees.php");
	
		 getAllEmployeeResponse.prettyPrint();
		 
		 getAllEmployeeResponse.then().assertThat().statusCode(200);
		 
		 String allEmployees=getAllEmployeeResponse.body().asString();
		 
		 JsonPath js=new JsonPath(allEmployees);
		 int sizeOfList=js.getInt("Employees.size()");
		 
		 System.out.println("Employee sayisi "+sizeOfList);
		 String allEmployeeId;
		 int counter = 0;
		 for(int i=0;i<sizeOfList;i++) {
			 allEmployeeId= js.getString("Employees["+ i +"].employee_id");
			 System.out.println(allEmployeeId);
			counter++;
			
			if(allEmployeeId.contentEquals(empId)) {
				System.out.println("Employee Id: "+empId+" is present in body");
				 String empFirstname= js.getString("Employees["+ i +"].emp_firstname");
				
			}
		 }
		 
		System.out.println("Counter number "+counter);
		
	}
	
	@Test
	public void UpdatedEmployee(){
		RequestSpecification UpdateEmpRequest=given().header("Content-type", "application/json")
				.header("Authorization", Constants.token).body("{\r\n" + 
						"  \"employee_id\": \"" + empId + "\",\r\n" + 
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