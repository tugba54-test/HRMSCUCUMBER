package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods{
	@FindBy(id="personal_cmbNation")
	public WebElement NationalityDropDown;
	
	@FindBy(name="personal[optGender]")
	public List<WebElement>genderRadioGroup;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement verifyEmp;

   
	@FindBy(xpath="//div[@class='head']/h1")
	public WebElement pdetailsPage;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement DLNumber;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement otherId;
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement DLEDate;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement SSN;
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement licExpDateSendKeys;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement SIN;
	
	@FindBy(xpath="//input[@id='personal_optGender_2']")
	public WebElement Female;
	
	@FindBy(id="personal_optGender_1")
	public WebElement Male;
	
	@FindBy(id="personal_cmbNation")
	public List<WebElement> Nationality;
	
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	public List<WebElement>   maritalStatus    ;
	
	
	
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']/following-sibling::img")// calendar
	public WebElement   licExpDate ;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")// calendar
	public WebElement   selctmonth    ;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")// calendar
	public WebElement   selctyear    ;
	
	@FindBy(xpath="//a[@title='Next']")// calendar
	public WebElement   nextBtn    ;
	
	@FindBy(xpath="//a[@title='Prev']")// calendar
	public WebElement   previousBtn    ;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/thead/tr/th")// calendar/ datys (Monday ,...)
	public WebElement   dayNames    ;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr")// date number rows
	public WebElement   dateRows   ;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")// date number colums
	public WebElement   datecolums;
	
	
	@FindBy(id="personal_DOB")
	public WebElement  dateofBirth;
	
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement   nickname    ;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement   SmokerCheckbox    ;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement   miltaryserv    ;
	
	
	
	
	@FindBy(xpath="//ul[@id='sidenav']/li")
	public WebElement     persDetailDD    ;
	
	@FindBy(id="btnAddAttachment")
	public WebElement addbtn;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	

}
