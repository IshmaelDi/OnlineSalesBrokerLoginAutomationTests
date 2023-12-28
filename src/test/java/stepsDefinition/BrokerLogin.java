package stepsDefinition;

import PageObjects.BrokerLogin.Broker;
import PageObjects.BrokerLogin.BrokerCodeAccess;
import PageObjects.BrokerLogin.ProductSelection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class BrokerLogin extends PageObject {

    @Steps
    Broker broker;
    @Steps
    BrokerCodeAccess brokerCodeAccess;
    @Steps
    ProductSelection productSelection;


    @Given("Broker logs in with valid Credentials.")
    public void broker_logs_in_with_valid_credentials() {
        broker.OpenWebsite();
        broker.ClickBrokerLogin();
        broker.SelectBrokerOption();

    }
    @When("Broker captures {string}, {string} and click Login Button.")
    public void broker_captures_and_click_login_button(String BrokerCode, String Password) throws InterruptedException {
        brokerCodeAccess.switchToFrame();
        brokerCodeAccess.EnterBrokerCode(BrokerCode);
        brokerCodeAccess.EnterBrokerPassword(Password);
        brokerCodeAccess.ClickLoginButton();
    }

    @When("Switch to Product Selection {string} and enter {string} and click loginButton.'")
    public void switch_to_product_selection_and_enter_and_click_login_button(String Product, String LeadNumber) throws InterruptedException {

        productSelection.FrameToSwitch();
        productSelection.SelectProductFromList(Product);
        productSelection.EnterLeadNumber(LeadNumber);
        productSelection.ClickLoginButton();
    }

    @When("Navigate to Member details to complete required details {string}, {string}, {string}, {string}, {string}.")
    public void navigate_to_member_details_to_complete_required_details(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter {string}, {string}, {string},{string}, {string}.")
    public void enter(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User completes {string} and {string} and clicks the continue button.")
    public void user_completes_and_and_clicks_the_continue_button(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User adds additional Member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_additional_member(String string, String string2, String string3, String string4, String string5, String string6) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User adds beneficiary {string}, {string}, {string},{string}, {string}")
    public void user_adds_beneficiary(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters payer details {string},{string},{string},{string},{string}")
    public void user_enters_payer_details(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should get a generated policy number with correct cover {string}.")
    public void user_should_get_a_generated_policy_number_with_correct_cover(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
