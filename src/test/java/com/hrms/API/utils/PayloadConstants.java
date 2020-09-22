package com.hrms.API.utils;

import org.json.JSONObject;

import com.hrms.API.steps.practice.HardcodedExamples;

public class PayloadConstants {
	
	public static String createEmployeeBody() {
		String createEmployeeBody="{\r\n" + 
				"    \"emp_firstname\": \"Feride\",\r\n" + 
				"  \"emp_lastname\": \"Canli\",\r\n" + 
				"  \"emp_middle_name\": \"Guzel\",\r\n" + 
				"  \"emp_gender\": \"F\",\r\n" + 
				"  \"emp_birthday\": \"2001-06-28\",\r\n" + 
				"  \"emp_status\": \"Super Contractor\",\r\n" + 
				"  \"emp_job_title\": \"Jr Production Manager\"}";
		
		
		return createEmployeeBody;
		
	}
	
	//we add dependency at this point
//	<!-- https://mvnrepository.com/artifact/org.json/json -->
//		<dependency>
//			<groupId>org.json</groupId>
//			<artifactId>json</artifactId>
//			<version>20160810</version>
//		</dependency>
	
	/**
	 * Creating payload using JSONObject and returning it as a String
	 * @return
	 */
	public static String createEmployeePayload() {
		JSONObject obj=new JSONObject();
		obj.put("emp_firstname","Feride");
		obj.put("emp_lastname","Canli");
		obj.put("emp_middle_name","Guzel");
		obj.put("emp_gender","F");
		obj.put("emp_birthday","2001-06-28");
		obj.put("emp_status","Super Contractor");
		obj.put("emp_job_title","Jr Production Manager");
		return obj.toString();
		
	}
	/**
	 * we create method 
	 * to reduce messy code
	 * @return
	 */
	public static String updateCreateBody() {
		
		
		
		String updateBody="{\n" +
				"  \"employee_id\": \""+HardcodedExamples.empId+"\",\n" +
				"  \"emp_firstname\": \"Jennet\",\n" +
				"  \"emp_lastname\": \"Jenny\",\n" +
				"  \"emp_middle_name\": \"Atayeva\",\n" +
				"  \"emp_gender\": \"F\",\n" +
				"  \"emp_birthday\": \"2001-02-11\",\n" +
				"  \"emp_status\": \"Freelance\",\n" +
				"  \"emp_job_title\": \"Application Developer\"\n" +
				"}";
		return updateBody;
	}
		
		
	}
	