package com.hrms.utils;

import io.restassured.RestAssured;

public class Constants{
	
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/configuration.properties";

	public static final long IMPLICIT_WAIT_TIME= 10;
	
	public static final int EXPLICIT_WAIT_TIME=30;//pageLoadtime
	
	public static final String EXCEL_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/TestData/AddInfo.xlsx";
	
	public static final String HRM_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/html-report/HRMS.html";

	public static final String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU2NTQ5NzQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTY5ODE3NCwidXNlcklkIjoiNDkyIn0.rbX8MwewSoKZ4QPSCBwAhbGSFt5tKB2VkWfYt6V9D-Q";

	
	public static final String baseURI=RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

	public static final String  SCREENSHOTS_FILEPATH = System.getProperty("user.dir")+"/screenshots/";
	

}

class Main{
	public static void main(String[] args) {
		
		
		System.out.println(Constants.EXCEL_FILEPATH);
	}
}