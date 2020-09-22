@workflow
Feature: Syntax HRMS End to end Workflow
  I want to use this template for my feature file

  Background: 
    Given a JWT is generated

  Scenario: Creating an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And the employee is  created and response contains key "Message" and value "Entry Created"
    And the employee ID "Employee[0].employee_id" is stored as a global variable to be used for other calls

  Scenario: Retrieving created employee
    Given a request is prepared to retrieve the created employee
    When a GET call is made to retrieve the created employee
    Then the status code for retrieving the created employee is 200
    And the retrieved employee IDat "employee[0].employee_id" matches the globaly stored employee ID
    And the retrieved data at "employee" matches the data used to create an employee with employee ID "employee[0].employee_id"
      | emp_firstname | emp_middle_name | emp_lastname | emp_birthday | emp_gender | emp_job_title         | emp_status       |
      | Feride        | Guzel           | Canli        | 2001-06-28   | Female     | Jr Production Manager | Super Contractor |
