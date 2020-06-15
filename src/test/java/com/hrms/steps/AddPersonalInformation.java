package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPersonalInformation extends CommonMethods {
	@When("user  should be able to modify employee personal details")
	public void user_should_be_able_to_modify_employee_personal_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps();
		for(Map<String,String>maps:map) {
		sendText(pdetails.DLNumber, maps.get("DLicenNumber"));
		
		sendText(pdetails.DLEDate, maps.get("LicenseEDate"));
		sendText(pdetails.SSN, maps.get("SSN Number"));
		sendText(pdetails.SIN, maps.get("SIN Number"));
		wait(2);
		jsClick(pdetails.Female);

		jsClick(pdetails.addbtn);
		
		}

	}

	@Then("user navigate employee search page")
	public void user_navigate_employee_search_page() {
		jsClick(dashboard.empListPage);
	}

	@Given("admin search employee id {string}")
	public void admin_search_employee_id(String string) {
		viewEmp.EmpId.sendKeys(string,Keys.ENTER);
		jsClick(viewEmp.searchBtn);
		wait(2);
	}

	@Given("admin selects employee from the list")
	public void admin_selects_employee_from_the_list() {
		jsClick(viewEmp.id);
wait(2);
	}

	@Given("navigate to Personal Details page and click to Edit")
	public void navigate_to_Personal_Details_page_and_click_to_Edit() {

		jsClick(addEmp.saveBtn);
	}
}
