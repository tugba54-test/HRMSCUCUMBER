@tag
Feature: Negative login Test

  @tag1
  Scenario: Validate error message
    And i enter  invalid username and password
    Then i see error message

  @tag2
  Scenario: Login with valid username and without password
    When user enters valid username and empty password
    Then user see “Password cannot be empty” error message

  @tag2
  Scenario: Login without username and valid password
    When user enters valid username and empty password
    Then user see  “Username cannot be empty” error message

  @hmwork
  Scenario: Login with invalid credentials
    When I enter invalid username and password and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |

       @tag3
  Scenario Outline: 
     When user enter valid "<Username>" and "<Password>"
     And user click on login button
    Then " <FirstName>" is succsesfully logged in 

    Examples: 
      | Username  | Password| FirstName  |
      | Mahady |   Mahady123!!   | Jhon |
      | abd77 |     Syntax123! | Abdullah    |
      