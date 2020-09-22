package com.hrms.steps;

import java.util.*;


import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import com.hrms.utils.DBUtils;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NationSteps extends CommonMethods{
	
	public static List<Map<String, String >> dbDataNation;


		@Then("user navigate to nationalities page")
		public void user_navigate_to_nationalities_page() {
			dashboard.navigateToNationalities();
		}

		@Then("verify nationalities table is displayed")
		public void verify_nationalities_table_is_displayed() {
			Assert.assertEquals(true,dashboard.isTableDispalyed());
		}

		@Then("get all nation from table")
		public void get_all_nation_from_table() {
		    System.out.println(dashboard.getNationFromTable());
		}

		@When("get all nation data from db")
		public void get_all_nation_data_from_db() {
			String Query="select name from ohrm_nationality";
			dbDataNation=DBUtils.storedataFromDB(Query);
		}

		@Then("validate all nation from ui against db")
		public void validate_all_nation_from_ui_against_db() {
			System.out.println(dbDataNation.size());
			System.out.println("dashboard.getNationFromTable() " +dashboard.getNationFromTable().size());
			
			   Assert.assertEquals(dbDataNation.size(), dashboard.getNationFromTable().size());
			   for(Map<String,String> nation:dbDataNation) {
					String dbNation=nation.get("name");
					for(Map<String,String> ui_nations:dashboard.getNationFromTable()) {
						String ui_nation= ui_nations.get("name");
						if(ui_nation.equals(dbNation)) {
						Assert.assertEquals("Nationalities do not Match",ui_nation, dbNation);
						}
					}
			   }

		}
//		@Given("user navigate to employee list page")
//		public void user_navigate_to_employee_list_page() {
//			dashboard.navigateToEmployeeList();
//		    
//		}
//
//		@When("user enters valid employee id {string}")
//		public void user_enters_valid_employee_id(String empID) {
//		  sendText(viewEmp.EmpId,empID);
//		  GlobalVariables.empId=empID;
//		  jsClick(viewEmp.searchBtn);
//		
//		  
//		}
		
		@Then("user navigate to personal Details page")
		public void user_navigate_to_personal_Details_page() {
			jsClick(viewEmp.id);//just works this id 
		
			jsClick(pdetails.Edit);
			
		}

		@Then("user click nationality see details")
		public void user_click_nationality_see_details() {
		    jsClick(pdetails.nation);
		    System.out.println(pdetails.NationFromTable());
		}

		@Then("validate first nation from ui against database")
		public void validate_first_nation_from_ui_against_database() {
			
			System.out.println(dbDataNation);
			int index=0;
			   
					for(Map<String,String> ui_nations:pdetails.NationFromTable()) {
						Set<String>keys=ui_nations.keySet();
						for(String key:keys) {
						String actual=ui_nations.get(key);
						String expected=dbDataNation.get(index).get(key);
						if(expected.equals(actual)) {
							System.out.println("expected= "+expected+"  actual = "+actual);
						Assert.assertEquals("nation is not matching",expected, actual);
						}
						
						index++;
	
	}
						}




		}
		@Then("close connection from databese")
		public void close_connection_from_databese() {
		    DBUtils.closeConnection();
		}
}



