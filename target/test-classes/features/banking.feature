Feature: Banking operations

  Scenario: Successful withdrawal
    Given account balance is 1000
    When user withdraws 200
    Then remaining balance should be 800

  Scenario: Withdrawal fails due to insufficient balance
    Given account balance is 100
    When user withdraws 200
    Then withdrawal should fail