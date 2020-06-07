package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements {
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy(id="empsearch_id")
	public WebElement EmpId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(id="empsearch_id")
	public WebElement RealId;
public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
