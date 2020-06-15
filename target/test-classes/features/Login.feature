@Tag
Feature: Login

  #Background:
  #Given I succesfully login HRM
  
  @smoke
  Scenario: Valid login validation
    Given I enter valid username
    And I enter valid password
    When I click login button
    Then I succesfully login HRMS

  @regression
  Scenario Outline: Invalid login error message validation
  Given I enter username "<username>"
  Then i enter password "<password>"
  When I click login button
  Then I see  "<errorMsg>"
  
  
  Examples:
  | username | password  | errorMsg                  |
  | Admin    | Qwerty123 | Invalid credentials       |
  | Admin    |           | Password cannot be empty |
  | Admin123 | Qwer123   | Invalid credentials       |
  |          | admin123  | Username cannot be empty  |
  |          |           | Username cannot be empty  |
  #
   #parametreli yontem
  
  
  #| username | password  | errorMsg                  |
  #| Admin    | Qwerty123 | Invalid credentials       |
  
  #header ve bir satir yazi varsa
  #Map<String,String> map=dataTable.asMap();
  
  
  
  #Scenario: Negative Login Error Message Validation
  #When i enter username and password I see error message
  #
  #| username | password  | errorMsg                  |
  #| Admin    | Qwerty123 | Invalid credentials       |
  #| Admin    |           | Password cannot be empty |
  #| Admin123 | Qwer123   | Invalid credentials       |
  #|          | admin123  | Username cannot be empty  |
  #|          |           | Username cannot be empty  |
  
  #List<Map<String,String>> maps=dataTable.asMaps();
 
 
 #| Admin    | Qwerty123 | Invalid credentials       |
 
 #header yok sadece yazi varsa List<String>list=dataTable.asList();
 
  
  Scenario: Negative Login Error Message Validation without header
    When i enter username and password I see error message without header
      | Admin    | Qwerty123 | Invalid credentials      |
      | Admin    |           | Password cannot be empty |
      | Admin123 | Qwer123   | Invalid credentials      |
      |          | admin123  | Username cannot be empty |
      |          |           | Username cannot be empty |
      
      # headersiz 5 satir bilgi List<List<String>> lists = dataTable.asLists();
