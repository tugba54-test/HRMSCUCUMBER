package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class dashboardSteps extends CommonMethods{
	@Then ("user see dashboard menu is displayed")
	public void user_see_dashboard_menu_is_displayed(io.cucumber.datatable.DataTable dashboardMenu) {
		List<String>expectedmenu=dashboardMenu.asList();
		List<String>actualMenu=new ArrayList<>();
		for(WebElement el:dashboard.dashmenu) {
			actualMenu.add(el.getText());
			
		}
			
		System.out.println(expectedmenu);
			System.out.println(actualMenu);
			
			Assert.assertTrue(actualMenu.equals(expectedmenu));
		
		
	}
	

}
