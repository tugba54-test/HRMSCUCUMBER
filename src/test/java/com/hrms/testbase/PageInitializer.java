package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.DefinedPredefinedReportsPageElements;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass {
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static LoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static DefinedPredefinedReportsPageElements reports;
	public static ViewEmployeePageElements viewEmp;
	public static EmployeeListPage empList;
	

	public static void initialize() {
		addEmp = new AddEmployeePageElements();
		dashboard = new DashBoardPageElements();
		login = new LoginPageElements();
		pdetails = new PersonalDetailsPageElements();
		reports = new DefinedPredefinedReportsPageElements();
		viewEmp=new ViewEmployeePageElements();
		empList=new EmployeeListPage();
	}

}
