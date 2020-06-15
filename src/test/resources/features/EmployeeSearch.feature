@tag
Feature: Employee Search

  @error1
  Scenario: Search employee by id
    And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee id "10518"
    Then user see employee information is displayed

  @deneme
  Scenario: Search employee by name
    And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee name "Amanda Sarikaya" 
    Then user see employee information is displayed

#enhancing test with Scenario outline with examples
@regression
  Scenario Outline: 
    When user enter valid  "<Username>" and "<password>"
    And user click on login button
    Then "<FirstName>"  is successfully logged in

    Examples: 
      | Username | password    | FirstName |
      | Admin   | Hum@nhrm123 | Admin     |
      | abd77   | Syntax123!  | Abdullah  |
