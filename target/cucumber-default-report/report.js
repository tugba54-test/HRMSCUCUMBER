$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Tag"
    }
  ]
});
formatter.scenario({
  "name": "Valid login validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I succesfully login HRMS",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_succesfully_login_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.hrms.utils.CommonMethods.takesScreenshot(CommonMethods.java:211)\r\n\tat com.hrms.steps.Hooks.end(Hooks.java:25)\r\n",
  "status": "failed"
});
formatter.uri("file:src/test/resources/features/addEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employee \"\u003cFirstName\u003e\",\"\u003cMiddleName\u003e\" and \"\u003cLastname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\",\"\u003cMiddleName\u003e\" and \"\u003cLastname\u003e\" is added succesfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "Faisal",
        "L",
        "Saki"
      ]
    },
    {
      "cells": [
        "Ahmet",
        "E",
        "Haci"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to add employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_is_navigated_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employee \"\u003cFirstName\u003e\",\"L\" and \"\u003cLastname\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\",\"L\" and \"\u003cLastname\u003e\" is added succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.and_is_added_succesfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to add employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_is_navigated_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employee \"\u003cFirstName\u003e\",\"E\" and \"\u003cLastname\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\",\"E\" and \"\u003cLastname\u003e\" is added succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.and_is_added_succesfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
});