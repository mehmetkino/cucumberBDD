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


     @TC100
    Scenario: Add a new Employee
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


  @Testcase1
  Scenario: Adding a new employee -different format
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"


    Scenario: 
    Then The user wants to add employye's first and last name as fallowing
    |FirstName| Gulsen |
    |LastName | Renastech |
    Then The user wants to add login details as fallowing
    |Username| Gulsen147 |
    |Password| 123@Gulsen|
    | Status  | Disabled |
    Then The user wants to save the information
    Then The user should be able to see "Personel Details"





