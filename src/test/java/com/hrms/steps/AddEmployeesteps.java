package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeesteps extends CommonMethods {

	@When("i enter firstname and lastname and username and password saw fullname without header")
	public void i_enter_firstname_and_lastname_and_username_and_password_saw_fullname_without_header(
			io.cucumber.datatable.DataTable dataTable) {
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
	@When("user enters employees name {string} and {string} lastname")
	public void user_enters_employees_name_and_name(String string, String string2) {
	   sendText(addEmp.firstName,string);
	   sendText(addEmp.lastName,string2);
	   
	}

	@When("user enters employees name and  lastname")
	public void user_enters_employees_name_and_lastname() {
		sendText(addEmp.firstName,"Cerem");
		   sendText(addEmp.lastName,"Ak");
	    
	}




	@When("user enter employee {string},{string} and {string}")
	public void user_enter_employee_and(String string, String string2, String string3) {
		sendText(addEmp.firstName, string);
		sendText(addEmp.middleName, string2);
		sendText(addEmp.lastName, string3);
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
		Assert.assertTrue(pdetails.pdetailsPage.isDisplayed());
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		jsClick(addEmp.chkLogin);

	}

	@When("user enters  login credentials {string},{string}")
	public void user_enters_login_credentials(String string, String string2) {
		sendText(addEmp.newEmpName, string);
		sendText(addEmp.newEmpPassword, string2);
		sendText(addEmp.confirmPassword, string2);

	}

	

	@Then("{string},{string} and {string} is added succesfully")
	public void and_is_added_succesfully(String string, String string2, String string3) {
		Assert.assertEquals("mismatch Employee Name", string + " " + string2 + " " + string3,
				pdetails.verifyEmp.getText());
		System.out.println("i added  succesfully");
	}

	@When("user enters employee details and click on save")
	public void user_enters_employee_details_and_click_on_save(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> addemployeeList = dataTable.asMaps();
		for (Map<String, String> map : addemployeeList) {
			System.out.println(map.get("Firstname"));
			String fname = map.get("Firstname");
			String mName = map.get("MiddleName");
			String lName = map.get("LastName");

			sendText(addEmp.firstName, fname);
			sendText(addEmp.middleName, mName);
			sendText(addEmp.lastName, lName);
			jsClick(addEmp.saveBtn);
			Assert.assertEquals(" Employee is not added", fname + " " + mName + " " + lName,
					pdetails.verifyEmp.getText());
			jsClick(dashboard.addEmployee);
		}
	}

	@Then("employee added succesfully")
	public void employee_added_succesfully() {

		System.out.println("i added  succesfully");
	}

	@When("user enters employee data from excel sheet then employee is added")
	public void user_enters_employee_data_from_excel_sheet_then_employee_is_added() {
		List<Map<String, String>> excellist = ExcelUtility.excelIntoListOfMaps(Constants.EXCEL_FILEPATH, "cucumber");
		for (Map<String, String> maps : excellist) {//excel sheet eklemm gerkiyr
			
			System.out.println(maps.get("Firstname"));
			String fname = maps.get("Firstname");
			String mName = maps.get("MiddleName");
			String lName = maps.get("LastName");

			sendText(addEmp.firstName, fname);
			sendText(addEmp.middleName, mName);
			sendText(addEmp.lastName, lName);
			jsClick(addEmp.saveBtn);
			Assert.assertEquals(" Employee is not added", fname + " " + mName + " " + lName,
					pdetails.verifyEmp.getText());
			jsClick(dashboard.addEmployee);
		}
	}

}
