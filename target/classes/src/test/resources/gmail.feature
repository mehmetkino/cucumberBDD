Feature: Login to Gmail, Google Search

  Scenario: Verify that login to ggmail with positive credentials is successful
    Given The user wants to go to Google
    When en The user wants to click on gmail feature
    And The user wants to enter correct e-mail address
    And The user wants to enter correct password
    And The user wants to click on login button
    Then User wants to verify that login was successful


  Scenario: Verify that user is able to search in emails
    Given The user wants to go to Google
    When en The user wants to click on gmail feature
    And The user wants to enter correct e-mail address
    And The user wants to enter correct password
    And The user wants to click on login button
    Then User wants to verify that login was successful
    Then  The user wants to verify that signing was successful
    And The user wants to search for Renastech in e-mails
    Then The user wants verify that search was successful

 Scenario: Search Renastech on Google
   Given The user wants to go to the Google
   When The user wants to enter Renastech in search box
   And  The user wants to click on Google Search
   And The user wants to click on Renastech in result
   Then The user wants to verify that Renastech page is opened

 #if you want to reause a step it must be exactly same sentence , it is sentence sensitive

 Scenario:
