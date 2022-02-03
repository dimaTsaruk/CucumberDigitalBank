package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemo2Steps {

    @Given("User with account number {int} is registered")
    public void user_with_account_number_is_registered(Integer accountNumber) {
        System.out.println("User account number is registered: " + accountNumber);

    }

    @Given("user with account number {int} deposited ${double}")
    public void user_with_account_number_deposited_$(Integer accountNumber, Double amount) {
        System.out.println("User with " + accountNumber + " deposited " + amount);

    }

    @When("User user with account number {int} transfers ${int}")
    public void user_user_with_account_number_transfers_$(Integer accountNumber, Integer amount) {
        System.out.println("User with " + accountNumber + " transfered " + amount);
    }

//    @Then("User with account number {int} should have ${int} in balance")
//    public void user_with_account_number_should_have_$_in_balance(Integer accountNumber, Integer balance) {
//        System.out.println("User with account number " + accountNumber + " has balance " + balance);
//
//    }

    @And("User with account number {int} transfers ${int}")
    public void userWithAccountNumberTransfers$(int accountNumber, int amount) {
        System.out.println("User with account number " + accountNumber + " transfered " + amount);
    }

    @And("User should see Insufficient Funds message")
    public void userShouldSeeInsufficientFundsMessage() {
        System.out.println("Insufficient Funds message");
    }

    @And("User should see Daily Limit Exceeded")
    public void userShouldSeeDailyLimitExceeded() {
        System.out.println("Daily Limit Exceeded");
    }

}
