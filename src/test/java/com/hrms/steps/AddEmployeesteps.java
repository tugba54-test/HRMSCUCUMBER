package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeesteps extends CommonMethods {
	
@When("i enter firstname and lastname and username and password saw fullname without header")
public void i_enter_firstname_and_lastname_and_username_and_password_saw_fullname_without_header(io.cucumber.datatable.DataTable dataTable) {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		jsClick(login.loginBtn);
		dashboard.navigateToAddEmployee();
		List<List<String>> lists = dataTable.asLists();
		for (List<String> list : lists) {
			sendText(addEmp.firstName, list.get(0));
			sendText(addEmp.lastName, list.get(1));
			jsClick(addEmp.chkLogin);
			sendText(addEmp.newEmpName, list.get(2));
			sendText(addEmp.newEmpPassword, list.get(3));
			sendText(addEmp.confirmPassword, list.get(3));
			Select select = new Select(addEmp.status);
			select.selectByVisibleText("Enabled");
			wait(3);
			jsClick(addEmp.saveBtn);
			Assert.assertEquals("Mismatch name", list.get(4), pdetails.verifyEmp.getText());
			jsClick(dashboard.addEmployee);
		}
}

@Given("user logged in into HRMS")
public void user_logged_in_into_HRMS() {
	sendText(login.username, ConfigsReader.getProperty("username"));
	sendText(login.password, ConfigsReader.getProperty("password"));
	jsClick(login.loginBtn);
	
    
}
@Given("user is navigated to add employee page")
public void user_is_navigated_to_add_employee_page() {
	dashboard.navigateToAddEmployee();
}

@When("user enters employees first name and last name")
public void user_enters_employees_first_name_and_last_name() {
	sendText(addEmp.firstName, "Amanda");
	sendText(addEmp.lastName, "Sarikaya");
	
	
}

@When("user deletes employee id")
public void user_deletes_employee_id() {
   addEmp.EmpId.clear();
}

@When("user clicks save button")
public void user_clicks_save_button() {
    jsClick(addEmp.saveBtn);
}

@Then("employee is added successfully")
public void employee_is_added_successfully() {
Assert.assertTrue( pdetails.pdetailsPage.isDisplayed());
}

@When("user clicks on create login checkbox")
public void user_clicks_on_create_login_checkbox() {
    jsClick(addEmp.chkLogin);
   
    
}

@When("user enters  login credentials")
public void user_enters_login_credentials() {
	 sendText(addEmp.newEmpName,"Amnda56784");
	    sendText(addEmp.newEmpPassword,"Amn^&*%$56784");
	    sendText(addEmp.confirmPassword,"Amn^&*%$56784");
	    
   
}




}
