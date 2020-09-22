package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {
	@FindBy(id = "personal_cmbNation")
	public WebElement NationalityDropDown;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement verifyEmp;

	@FindBy(xpath = "//div[@class='head']/h1")
	public WebElement pdetailsPage;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement DLNumber;

	@FindBy(id = "personal_txtOtherID")
	public WebElement otherId;

	@FindBy(id = "personal_txtLicExpDate")
	public WebElement DLEDate;

	@FindBy(id = "personal_txtNICNo")
	public WebElement SSN;

	@FindBy(id = "personal_txtLicExpDate")
	public WebElement licExpDateSendKeys;

	@FindBy(id = "personal_txtSINNo")
	public WebElement SIN;

	@FindBy(xpath = "//input[@id='personal_optGender_2']")
	public WebElement Female;

	@FindBy(id = "personal_optGender_1")
	public WebElement Male;

	@FindBy(id = "personal_cmbNation")
	public List<WebElement> Nationality;

	@FindBy(xpath = "//select[@id='personal_cmbMarital']")
	public List<WebElement> maritalStatus;

	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']/following-sibling::img") // calendar
	public WebElement licExpDate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']") // calendar
	public WebElement selctmonth;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']") // calendar
	public WebElement selctyear;

	@FindBy(xpath = "//a[@title='Next']") // calendar
	public WebElement nextBtn;

	@FindBy(xpath = "//a[@title='Prev']") // calendar
	public WebElement previousBtn;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/thead/tr/th") // calendar/ datys (Monday ,...)
	public WebElement dayNames;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr") // date number rows
	public WebElement dateRows;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td") // date number colums
	public WebElement datecolums;

	@FindBy(id = "personal_DOB")
	public WebElement dateofBirth;

	@FindBy(id = "personal_txtEmpNickName")
	public WebElement nickname;

	@FindBy(id = "personal_chkSmokeFlag")
	public WebElement SmokerCheckbox;

	@FindBy(id = "personal_txtMilitarySer")
	public WebElement miltaryserv;

	@FindBy(xpath = "//ul[@id='sidenav']/li")
	public WebElement persDetailDD;

	@FindBy(id = "btnAddAttachment")
	public WebElement addbtn;

	@FindBy(xpath = "//table[@id='resultTable']//tbody/tr/td[3]")
	public WebElement Name;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement Edit;

	@FindBy(xpath = "//select[@id='personal_cmbNation']")
	public WebElement nation;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigatePDetails() {
		jsClick(Name);
		jsClick(Edit);
	}
	
	public List<Map<String,String>> NationFromTable(){
		
		/**
		 * This method will get the JOb Titles from employeeListPage and store them in
		 * List and return as a list of JobTitles
		 * 
		 * @return List<Map<String, String>> List of job titles as a list of maps
		 */
		// pass list of DDs
			List<Map<String, String>> UiNation = new ArrayList<>();
			try {
				Select select = new Select(nation);
				List<WebElement> Nations = select.getOptions();
				int index=	Nations.size()-1;
				for ( index = 1; index < Nations.size(); index++) {
					Map<String, String> storeUiJobs = new LinkedHashMap<>();
					String UI_JOBT = Nations.get(index).getText();
					storeUiJobs.put("name", UI_JOBT);
					UiNation.add(storeUiJobs);
				}
			} catch (UnexpectedTagNameException e) {
				e.printStackTrace();
			}
			return UiNation;
		}

//		List<Map<String,String>>uiNation=new ArrayList<>();
//		Select select = new Select(opnation);
//		int size = select.getOptions().size();
//		List<WebElement>optionList=select.getOptions();
	//	
//		for(int index=1;index<size;index++) {
//			
//				select.selectByIndex(index);
//				
	//	
//		}	
	//	
//		return uiNation;
	//	
	//}
	}	
		
		


