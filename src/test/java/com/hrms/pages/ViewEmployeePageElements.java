package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ViewEmployeePageElements extends CommonMethods{
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy(id="empsearch_id")
	public WebElement EmpId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(id="empsearch_id")
	public WebElement RealId;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement id;
	
	@FindBy(xpath="//table[@id='resultTable']")
	public WebElement employeesTable;
	
	@FindBy(xpath="//table[@id='resultTable']//tbody/tr/td[3]")
	public List<WebElement> tableFirstName;
	
	
	
	public boolean isTableDispalyed() {
		return employeesTable.isDisplayed();
		
	}
	
	public List<Map<String,String>> getFirstnameFromTable(){
		
		List<Map<String,String>>uiName=new ArrayList<>();
		for(WebElement row:tableFirstName) {
		Map<String,String> storeUiNames=new LinkedHashMap<>();
		String tableName=row.getText();
		storeUiNames.put("emp_firstname",tableName);
			uiName.add(storeUiNames);
	}
		return uiName;
	}
	
public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
