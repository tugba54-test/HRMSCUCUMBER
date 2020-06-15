#Author: akcatugba
Feature: Adding Personal details

  Background: 
    Given user logged in into HRMS
    Then user navigate employee search page
    Given admin search employee id "10411"
    And admin selects employee from the list
    And navigate to Personal Details page and click to Edit

  @PDetails
  Scenario: Modify Employee Information
    
    When user  should be able to modify employee personal details
      | DLicenNumber | LicenseEDate | SSN Number | SIN Number | Gender | Marital Status | Nationality | Date of Birth | Nick Name | Smoker | Military Service |
      |    123456789 | 2021-Jun-25  | 9876543210 | 3456789021 | Female | Married        | Bulgarian   | 1980-Jun-19   | Jackie    | No     | No               |
