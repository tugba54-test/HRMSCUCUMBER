package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.DBUtils;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBSteps {
	
	
public static List<Map<String, String >> dbData;
	
	
	@When("get first name data from db")
	public void get_first_name_data_from_db() {
	    
		
		String Query="select emp_firstname from hs_hr_employees where employee_id="+GlobalVariables.empId;
				
		dbData=DBUtils.storedataFromDB(Query);
				
	}
	}


