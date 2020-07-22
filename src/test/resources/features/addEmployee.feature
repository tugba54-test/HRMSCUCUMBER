
Feature: Add Employee

  Background: 
    Given user logged in into HRMS
    And user is navigated to add employee page

  Scenario: Add new Employee
    When user enters employees name "Amanda" and "Sarikaya" lastname
    And user clicks save button
    Then employee is added successfully

  #Scenario: add employee
  #When i enter firstname and lastname and username and password saw fullname without header
  #| Elmas  | Demir | demirg478 | alhsHh123$%^    | Elmas Demir  |
  #| Hatice | Demir | dgn68ji   | gd78H6hfjik^&$@ | Hatice Demir |
  
  Scenario: Add Employee without employee id
    When user enters employees name and  lastname
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully
@ozel
  Scenario: AddEmployee and create Login Credentials
   When user enters employees name and  lastname
    And user clicks on create login checkbox
    And user enters  login credentials "Amnda56784","Amn^&*%$56784"
    And user clicks save button
    Then employee is added successfully

  @smoke
  Scenario Outline: Adding multiple employees
    When user enter employee "<FirstName>","<MiddleName>" and "<Lastname>"
    Then user clicks save button
    Then "<FirstName>","<MiddleName>" and "<Lastname>" is added succesfully

    Examples: 
      | Firstname | MiddleName | LastName |
      | Faisal    | L          | Saki     |
      | Ahmet     | E          | Haci    |

  #adding multiple employees using Cucumber Data table
  @addEmployee
  Scenario: add Emp
    When user enters employee details and click on save
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
      | Faisal    | L          | Saki     |
      | Yunus     | E          | Yakut    |
      Then employee added succesfully
      
      @Excel
      Scenario: Adding multiple employee from excel
      When user enters employee data from excel sheet then employee is added 
