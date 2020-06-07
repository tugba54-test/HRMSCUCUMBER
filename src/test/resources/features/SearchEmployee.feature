@tag
Feature: Employee Search

  @tag1
  Scenario: Search employee by id
    And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee id
    Then user see employee information is displayed

  @tag2
  Scenario: Search employee by name
    And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee name and last name
    Then user see employee information is displayed
