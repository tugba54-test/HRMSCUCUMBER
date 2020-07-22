
@testApiJune
Feature: Retrieve All Employees From Syntax Api

 Background:
 Given user generates token
 
 Scenario: Retrieve AllEmployees fro Syntax Api by GettAllEmployees
 Given User creates request for SyntaxApi
 When  getAllEmployees retrieves response
 Then Status Code is 200 for getAllEmployees
 
 Scenario: Retrieve One Employee from Syntax Api
 Given User creates request for retrieving one employee
 When getOneEmployee retrieves response
 Then Status code is 200 for getOneEmployee
 And User  asserts given employee is retrieved
 