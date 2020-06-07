package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {
	@FindBy(id="personal_cmbNation")
	public WebElement NationalityDropDown;
	
	@FindBy(name="personal[optGender]")
	public List<WebElement>genderRadioGroup;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement verifyEmp;

   
	@FindBy(xpath="//div[@class='head']/h1")
	public WebElement pdetailsPage;
			
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	

}
