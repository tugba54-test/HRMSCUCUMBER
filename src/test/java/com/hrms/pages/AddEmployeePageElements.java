package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeePageElements extends CommonMethods{

	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='employeeId']")
	public WebElement EmpId;

	@FindBy(id = "photofile")
	public WebElement uploadPhoto;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	@FindBy(className = "hasTopFieldHelp")
	public WebElement fullName;

	@FindBy(id = "empPic")
	public WebElement photo;

	

	@FindBy(id = "user_name")
	public WebElement newEmpName;

	@FindBy(id = "user_password")
	public WebElement newEmpPassword;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;

	@FindBy(id = "status")
	public WebElement status;

	@FindBy(xpath = "//span[@for='firstName']")
	public WebElement requiredfirstName;

	@FindBy(xpath = "//span[@for='lastName']")
	public WebElement requiredLastName;
	
	@FindBy(id="chkLogin")
	public WebElement chkLogin;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void addNewEmp() {
		sendText(firstName,ConfigsReader.getProperty("firstName"));
		sendText(lastName,ConfigsReader.getProperty("lastName"));
		 sendText(uploadPhoto, ConfigsReader.getProperty("pictureFilePath"));
    	
     }
	
	public void CreateLogin(String username,String password) {
		
		click(chkLogin);
		sendText(addEmp.newEmpName,username);
		sendText(addEmp.newEmpPassword,password);
		sendText(addEmp.confirmPassword,password);
		 Select select= new Select (status);
			select.selectByVisibleText("Enabled");
			wait(3);
			saveBtn.click();
		}
	
	
	
	

}
