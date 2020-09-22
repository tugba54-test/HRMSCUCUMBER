
@testApiJune
Feature: Retrieve All Employees From Syntax Api

 Background:
 Given a JWT is generated
 
 #Scenario: Retrieve AllEmployees fro Syntax Api by GettAllEmployees
 #Given User creates request for SyntaxApi
 #When  getAllEmployees retrieves response
 #Then Status Code is 200 for getAllEmployees
 #
 #Scenario: Retrieve One Employee from Syntax Api
 #Given User creates request for retrieving one employee
 #When getOneEmployee retrieves response
 #Then Status code is 200 for getOneEmployee
 #And User  asserts given employee is retrieved
 
 @tagApi
 Scenario: Retrieving created job titles
Given PO prepares request to retrieve all job titles
When PO Get call to retrieve the job titles
Then the status code for retrieving job titles is 200
And the retrieved job titles "Job Title List" is matches the data
        | Job Title List |
        | Cloud Architect |
        | Cloud Consultant |
        | Cloud Product and Project Manager |
        | IT Analyst |
        | Network Administrator |
        | IT Support Manager |
        | Data Quality Manager |
        | Database Administrator |
        | Application Developer |
        | Developer |
        | Accountant |
        | Chief Financial Officer |
        | Controller |
        | Production Manager |
        | Jr Production Manager |
        | Sales&Marketing Manager |
        | Jr Sales Manager |
        | Graphic Designer |
        | CEO |
        | Automation Engineer |
        | API Tester |
        | Instructor |
        | CTO |
        | QA Tester |
        | Sr Production Manager |
        | Sales&Marketing Manager |