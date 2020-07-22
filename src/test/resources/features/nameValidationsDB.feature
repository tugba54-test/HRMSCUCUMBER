
Feature: Name validations against DB

  @tag1
  Scenario: First Name validation
   And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee id "10518"
    Then user see employee information is displayed
    And get first name from table
    When get first name data from db
    Then validate first name from ui against db

 