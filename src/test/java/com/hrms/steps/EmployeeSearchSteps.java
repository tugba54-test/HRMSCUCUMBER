package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String string) {
	  sendText(viewEmp.EmpId,string);
	  jsClick(viewEmp.searchBtn);
	
	  
	}

	

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	
	   System.out.println("Employee is displayed");
	   
	}

	@When("user enters valid employee name {string}")
	public void user_enters_valid_employee_name(String string) {
		waitForClickability(empList.Empname);
		//empList.Empname.sendKeys(string,Keys.ENTER);
		sendText(empList.Empname, string);
		wait(4);
		jsClick(viewEmp.searchBtn);
		WebElement name=driver.findElement(By.xpath("//table[@id='resultTable']//tr/td[3]"));
	wait(3);
		Assert.assertTrue(name.equals("Amanda"));
	}
	
	@When("user enter valid  {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
		sendText(login.username,string);
		sendText(login.password,string2);
		
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		click(login.loginBtn);
	}



	@Then("{string}  is successfully logged in")
	public void is_successfully_logged_in(String string) {
	   Assert.assertEquals("Mismatch admin", "Welcome "+string , dashboard.welcome.getText());
	}





}
