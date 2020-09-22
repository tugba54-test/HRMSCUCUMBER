Feature: Nation validation
#@tag8A
  #Scenario: As an admin user I should be able to view all nationalities
    #in employees personal details
#
    #And user is logged with valid admin credentials
    #Then user navigate to nationalities page
    #And verify nationalities table is displayed
    #And get all nation from table
    #When get all nation data from db
    #Then validate all nation from ui against db
   
    @tag8B
  Scenario: As an admin user should be able to view all nationalities
    in employees personal details
    
    And user is logged with valid admin credentials
    And user navigate to employee list page
    When user enters valid employee id "10518"
    Then user navigate to personal Details page
    And user click nationality see details
    When get all nation data from db
    Then validate first nation from ui against database
    And close connection from databese
 