package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage {
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement Empname;
	
	@FindBy(xpath="//input[@name='empsearch[id]']")
	public WebElement EmpidS;

}
