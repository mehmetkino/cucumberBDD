Feature: Functional testing on Orange HRM

  Scenario: log-in OrangeHrm with correct credentials
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on Dashboard

    #@dryRunTest - i wanted to run it from runner class thats why i created a tag
    #i wanted to create by paramatizing
  @dryRunTest
  Scenario: log-in OrangeHrm with correct credentials
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"



  Scenario: Adding a new employee
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"
    Then The user wants to click on PIM module
    Then The user wants to go to add employee page
    Then The user wants to add first name as "Libby"
    Then The user wants to add last name as  "Renastech"
    And The user wants to save the personeal information
    Then  The user wants to see "Personal Details"

  Scenario: Add a new Employee - second way
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"
    Then The user wants to click on PIM module
    Then The user wants to go to add employee page
    Then The user wants to add employye's first and last name as fallowing
      |FirstName| Gulsene    |
      |LastName | Renastecha |
    Then The user wants to add login details as fallowing
      |UserName| Memocan147s |
      |PassWord| 123@Gulsen|
      | Status | Disabled |
    Then The user wants to save the information
    Then The user should be able to see "Personel Details"


    @testcase1
  Scenario: Adding a new employee --third way
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"
    Then The user wants to click on PIM module
    Then The user wants to add employye's first and last name as fallowing List
    |Omer1234 |      123BRk  |
    Then The user wants to add login details as a list
    |renastech123 |Renastech2022| Disabled | #index number 0 for row
    |ridvan123    |Ridvan!@2022  | Disabled | #index number 1 for row
    |Gulistan943  |Glstn!@#4345      |Disabled  |#index number 2 for row
    | Sezar025    |Szr123@!*321     | Disabled | #index number 3 for row
    And The user wants to save the information
    Then The user should be able to see "Personal Details"









