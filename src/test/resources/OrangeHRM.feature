Feature: Functional testing on Orange HRM

  Scenario: log-in OrangeHrm with correct credentials
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on Dashboard

    #@dryRunTest - i wanted to run it from runner class thats why i created a tag
    #i wanted to create by paramatizing
  Scenario: log-in OrangeHrm with correct credentials
    Given The user wants to go to Orange HRM website
    When The user wants to enter correct username
    And The user wants to enter correct password
    Then The user wants to click on login button
    And The user wants to verify that the browser launched on "Dashboard"