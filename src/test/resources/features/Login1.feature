@tag
Feature: Negative login Test

  @tag1
  Scenario: Validate error message
    And i enter  invalid username and password
    Then i see error message

  Scenario: Login with valid username and without password
    When user enters valid username and empty password
    Then i see “Password cannot be empty” error message

  Scenario: Login without username and valid password
    When user enters valid username and empty password
    Then i see  “Username cannot be empty” error message
