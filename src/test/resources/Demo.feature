Feature: Payment gate-way functional test

  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to buy a elephant toy
    Then The user wants to enter payments information
    |Cnumber|4444333355558888|
    |Emonth | 12             |
    |Eyear  |2026            |
    |CVV    |777             |
    Then The user wants to pay now
    And The user wants to verify message as "Payment Successfull!"

    #anything in double quotacion means paramater. so in this case
    #"Payment Successful!" is a parameter