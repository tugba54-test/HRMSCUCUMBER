package com.hrms.pages;

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

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToAddEmployee() {
		jsClick(Pim);
		jsClick(addEmployee);
	}

	public void navigateToReports() {
		jsClick(Pim);
		jsClick(reports);

	}

}
