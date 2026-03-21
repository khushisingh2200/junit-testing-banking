package com.banking.steps;

import com.banking.BankAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class BankingSteps {

    BankAccount account;
    boolean result;

    @Given("account balance is {int}")
    public void account_balance_is(int balance) {
        account = new BankAccount(balance);
    }

    @When("user withdraws {int}")
    public void user_withdraws(int amount) {
        result = account.withdraw(amount);
    }

    @Then("remaining balance should be {int}")
    public void remaining_balance_should_be(int expected) {
        assertEquals(expected, account.getBalance());
    }

    @Then("withdrawal should fail")
    public void withdrawal_should_fail() {
        assertFalse(result);
    }
}