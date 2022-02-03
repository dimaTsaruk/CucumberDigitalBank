package step_def;

import functionalities.Account;
import functionalities.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ZelleSteps {
    private Bank boa;
    private List<Account> accountList = new ArrayList<>();

    @Given("Bank {string} exists")
    public void bank_exists(String bankName) {
        System.out.println("Creating a " + bankName + " bank");
        boa = new Bank(bankName);

    }

    @Given("User with account number {int} and email {string} and a balance of ${int} is registered in {string}")
    public void user_with_account_number_and_email_and_a_balance_of_$_is_registered_in(Integer accountNumber, String email, Integer balance, String bankName) {
        System.out.println("Registering " + accountNumber + " email " + email + " to " + bankName);
        Account account1 = new Account(accountNumber, email, balance);
        boa.registerAccount(account1);
        accountList.add(account1);
    }

    @When("User with account number {int} transfers ${int} to account with email {string} in {string}")
    public void user_with_account_number_transfers_$_to_account_with_email_in(Integer accountNumber, Integer transferAmount, String email, String bankName) {
        System.out.println("Transfer to " + email + " " + transferAmount);
        for (Account account : accountList) {
            if (accountNumber == account.getAccountNum()) {
                account.transferZelle(email, transferAmount, boa);
            }
        }
    }

    @Then("User with account number {int} should have ${int} in balance")
    public void user_with_account_number_should_have_$_in_balance(Integer accountNumber, Integer expectedBalance) {
        System.out.println(accountNumber + " balance: $" + expectedBalance);
        for (Account account : accountList) {
            if (account.getBalance() == accountNumber) {
                Assert.assertEquals("Invalid Balance Amount", expectedBalance, account.getBalance(), 0);


            }
        }
    }
}















