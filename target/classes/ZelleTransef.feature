Feature: Transfer money with Zelle

  Scenario: Transfer money from account A to account B positive
    Given Bank "Bank Of America" exists
    And User with account number 123456 and email "testAccount@gmail.com" and a balance of $1000 is registered in "Bank Of America"
    And User with account number 11111 and email "test2@gmail.com" and a balance of $2000 is registered in "Bank Of America"
    When User with account number 11111 transfers $100 to account with email "test2@gmail.com" in "Bank Of America"
    Then User with account number 11111 should have $1900 in balance
    And User with account number 12345 should have $1100 in balance

  Scenario: Transfer money from account A to account B with insufficient fund
    Given Bank "Bank Of America" exists
    And User with account number 123456 and email "testAccount@gmail.com" and a balance of $900 is registered in "Bank Of America"
    And User with account number 11111 and email "test2@gmail.com" and a balance of $500 is registered in "Bank Of America"
    When User with account number 123456 transfers $1200 to account with email "test2@gmail.com" in "Bank Of America"
    Then User with account number 123456 should have $900 in balance
    And User with account number 11111 should have $500 in balance


  Scenario: Transfer money to unregistered email
    Given Bank "Bank Of America" exists
    And User with account number 123456 and email "testAccount@gmail.com" and a balance of $1000 is registered in "Bank Of America"
    When User with account number 123456 transfers $500 to account with email "invalid@gmail.com" in "Bank Of America"
    And User with account number 12345 should have $1000 in balance








