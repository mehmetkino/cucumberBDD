Feature: This feature is about login functionality of Amazon
  #FEATURE : means explanation of what we are going to do in feature file.
  #Gherking language has some most used keywords
  #Given,When,Then,And But

  #This is a positive scenario
  Scenario: Login to amazon with correct username and correct password
    Given The user wants to go to Amazon Website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login Button
  #This is a negative scenario
  Scenario:Login to Amazon with correct username and Incorrect password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify that login was unsuccessful

    #This is a negative scenario
  Scenario: Login to Amazon with Incorrect username and Incorrect password
    Given The user wats to go to Amazon website
    When The user wants to enter Incorrect username
    Then Yhe user wants to enter Incorrect password
    And The user wants to click on login button
    Then The user wants to verify that login was unsuccessful