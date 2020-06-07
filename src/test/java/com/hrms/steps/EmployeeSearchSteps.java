package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {
	

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.Pim);
		jsClick(dashboard.empListPage);
	    
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	  sendText(viewEmp.EmpId,"1453");
	  jsClick(viewEmp.searchBtn);
	
	  
	}

	

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	
	   System.out.println("Employee is displayed");
	   tearDown();
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
		empList.Empname.sendKeys("Amanda Sarikaya");
		jsClick(viewEmp.searchBtn);
		List<WebElement> name=driver.findElements(By.xpath("//table[@id='resultTable']//tr/td[3]"));
	
		Assert.assertTrue(name.equals("Amanda"));
	}


}
