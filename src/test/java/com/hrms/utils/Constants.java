package com.hrms.utils;

public class Constants{
	
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/configuration.properties";

	public static final long IMPLICIT_WAIT_TIME= 10;
	
	public static final int EXPLICIT_WAIT_TIME=30;//pageLoadtime
	
	public static final String EXCEL_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Book1.xlsx";
	
	public static final String HRM_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/html-report/HRMS.html";

	
	
	

	public static final String  SCREENSHOTS_FILEPATH = System.getProperty("user.dir")+"/target/screenshots/";
	

}

class Main{
	public static void main(String[] args) {
		
		
		System.out.println(Constants.EXCEL_FILEPATH);
	}
}