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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using id\u003dtxtUsername\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.clear(Unknown Source)\r\n\tat com.hrms.utils.CommonMethods.sendText(CommonMethods.java:33)\r\n\tat com.hrms.steps.LoginSteps.i_enter_valid_username(LoginSteps.java:20)\r\n\tat ✽.I enter valid username(file:///C:/Users/16824/eclipse-workspace2/HRMSCUCUMBER/src/test/resources/features/Login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_valid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I succesfully login HRMS",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_succesfully_login_HRMS()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\16824\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64218}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 38d7ade86bc36f7ea4bddc929bb02b7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.hrms.utils.CommonMethods.takesScreenshot(CommonMethods.java:211)\r\n\tat com.hrms.steps.Hooks.end(Hooks.java:23)\r\n",
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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\16824\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64239}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0b1fd1a76f6655f1fea45ef815930357\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.hrms.testbase.BaseClass.setUp(BaseClass.java:48)\r\n\tat com.hrms.steps.Hooks.start(Hooks.java:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to add employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_is_navigated_to_add_employee_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\",\"L\" and \"\u003cLastname\u003e\" is added succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.and_is_added_succesfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\16824\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64239}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0b1fd1a76f6655f1fea45ef815930357\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.hrms.utils.CommonMethods.takesScreenshot(CommonMethods.java:211)\r\n\tat com.hrms.steps.Hooks.end(Hooks.java:23)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom chrome not reachable\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x010987E3+2852835]\n\tOrdinal0 [0x00F85BB1+1727409]\n\tOrdinal0 [0x00E5E362+516962]\n\tOrdinal0 [0x00E57D82+490882]\n\tOrdinal0 [0x00E5846B+492651]\n\tOrdinal0 [0x00E593C5+496581]\n\tOrdinal0 [0x00E54D64+478564]\n\tOrdinal0 [0x00E5F300+520960]\n\tOrdinal0 [0x00E0E489+189577]\n\tOrdinal0 [0x00E0D7FD+186365]\n\tOrdinal0 [0x00E0B70B+177931]\n\tOrdinal0 [0x00DF2584+75140]\n\tOrdinal0 [0x00DF3650+79440]\n\tOrdinal0 [0x00DF35E9+79337]\n\tOrdinal0 [0x00F9AD5C+1813852]\n\tGetHandleVerifier [0x011BC616+1075574]\n\tGetHandleVerifier [0x011BC367+1074887]\n\tGetHandleVerifier [0x011C7497+1120247]\n\tGetHandleVerifier [0x011BCC16+1077110]\n\tOrdinal0 [0x00F93206+1782278]\n\tOrdinal0 [0x00F9C3BB+1819579]\n\tOrdinal0 [0x00F9C523+1819939]\n\tOrdinal0 [0x00FB2B45+1911621]\n\tBaseThreadInitThunk [0x76E66359+25]\n\tRtlGetAppContainerNamedObjectPath [0x778A7C24+228]\n\tRtlGetAppContainerNamedObjectPath [0x778A7BF4+180]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\r\n\tat com.hrms.testbase.BaseClass.setUp(BaseClass.java:37)\r\n\tat com.hrms.steps.Hooks.start(Hooks.java:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to add employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_is_navigated_to_add_employee_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\",\"E\" and \"\u003cLastname\u003e\" is added succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeesteps.and_is_added_succesfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PTINUE1\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\16824\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64239}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0b1fd1a76f6655f1fea45ef815930357\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.hrms.utils.CommonMethods.takesScreenshot(CommonMethods.java:211)\r\n\tat com.hrms.steps.Hooks.end(Hooks.java:23)\r\n",
  "status": "failed"
});
});