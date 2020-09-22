package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement Pim;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmployee;

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reports;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empListPage;

	@FindBy(xpath = "div[@class='menu']/ul/li")
	public List<WebElement> dashmenu;
	
	@FindBy(xpath="//a[@id='menu_admin_nationality']")
	public WebElement Nation;
	
	@FindBy(xpath="//table[@id='resultTable']")
	public WebElement Nationtable;
	
	@FindBy(xpath="//table[@id='resultTable']//tbody/tr")
	public List<WebElement> tableAllNation;
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
	public WebElement Admin;
   
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(linkText="Job")
	public WebElement job;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public boolean isTableDispalyed() {
		return Nationtable.isDisplayed();
		
	}
	
	
	

	
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
	
	public void navigateToEmployeeList() {
		jsClick(PIM);
		jsClick(empListPage);
	}
	
	
	
public List<Map<String,String>> getNationFromTable(){
		
		List<Map<String,String>>uiNation=new ArrayList<>();
		for(WebElement row:tableAllNation) {
		Map<String,String> storeUiNames=new LinkedHashMap<>();
		String tableName=row.getText();
		storeUiNames.put("name",tableName);
			uiNation.add(storeUiNames);
	}
		return uiNation;
	}
	
	
		
	

	public void navigateToReports() {
		jsClick(Pim);
		jsClick(reports);

	}

	public void navigateToNationalities() {
		jsClick(Admin);
		jsClick(Nation);
		
	}

}
