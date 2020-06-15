package com.hrms.runners;

public class ExplanationCucmber {
//	Cucumber Options tag is used to provide a link between the feature files and step definition files. step defination file for corresponding method
//	
//	 dryRun = enable us to quick scan our features without running them.
//	 
//	 In order to use @RunWith annotation we need to pass a class that is extended from Runner. @RunWith(classNameRunner.class). 
//	 
//	 cunku runner class extend ve bunun icin RunWith kullaniyoruz. we invoke specific class as a test runner and responsible for junit test
//	 
//	DATA DRIVEN TABLE (DDT) =  Data Driven Testing, which allows to automatically run a test case multiple times with different input and validation values.
//	
//	Scenario Outline – This is used to run the same scenario for 2 or more different sets of test data. E.g. In our scenario,
//	
//	if you want to register another user you can data drive the same scenario twice.
//	
//	Examples – All scenario outlines have to be followed with the Examples section.
//	
//	This contains the data that has to be passed on to the scenario.
//	
//	DATA DRIVEN REPORT (CUCUMBER REPORT ) =  Contain information about what scenarios have passed or failed. ...
//	
//	This page documents built-in formatter plugins, custom formatters and some common third-party plugins.
//	
//	 @CucumberOptions = @CucumberOptions annotation provides the same options as the cucumber jvm command line
//	 
//	 HOW TO RUN CUCEMBER WITH JUNIT? = The first thing I would say about this question is Runner class needs to be set. 
//	 
//	 Cucumber uses Junit we need to have a Test Runner class. This class will use the Junit annotation @RunWith(),
//	 
//	 which tells JUnit what is the test runner class. It more like a starting point for Junit to start executing your tests.
//	 
//	 In the src folder create a class called TestRunner
//	 
//	 SCENARIO OUTLINE? VS SCENARIO? = scenario will be executed once while scenario outline is executed for each example from the table. 
//	 Scenaio include step will only executed one time, whereas multiple steps executed // In scenario data table works for specific step wheras SCENARIO works for SPECIFICS. 
//	 HOW TO USE MAPS IN CUCUMBER? = In the previous chapter of Data Tables in Cucumber,
//	 we consider a very simple example of passing UserName and Passwordin the step. 
//	 Let's take a little complex scenario where  a good amount of data is required to pass in the step. Or what is there are multiple columns of test data is present.
//	 How would you handle it? The answer is to make a Use of Maps in Data Tables. 
//	 WE USE MAP TO IMPLEMENT THE SPECIFICS TO STORE THOSE DATA. we took data from excel and store to MAP/LIST List<Map<String,String>> addEmployeeList  = dataTable.asMapList();

}
