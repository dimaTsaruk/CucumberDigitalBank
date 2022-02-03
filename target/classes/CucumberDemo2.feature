Feature: Demo Cucumber Scenarios

  Scenario: Money Transfer with enough balance
    Given User with account number 007 is registered
    And user with account number 007 deposited $500
    When User user with account number 007 transfers $300
    And User with account number 007 transfers $200
    Then User with account number 007 should have $0 in balance

  Scenario: Money Transfer with no enough balance
    Given User with account number 007 is registered
    And user with account number 007 deposited $1000.00
    When User user with account number 007 transfers $1100
    Then User with account number 007 should have $1000 in balance
    And User should see Insufficient Funds message

  Scenario: Money Transfer with daily limit exceeded
    Given User with account number 007 is registered
    And user with account number 007 deposited $2000
    When User user with account number 007 transfers $1003
    Then User with account number 007 should have $2000 in balance
    And User should see Daily Limit Exceeded


