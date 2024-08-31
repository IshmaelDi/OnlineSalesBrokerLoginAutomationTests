package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import PageObjects.KorridorLoginFunctionality.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class KorridorUIStepDef extends PageObject {

    @Steps
    KorridorUserCredentialsTest korridorUserCredentialsTest;


    // Driver Steps Definitions

    @Given("Driver has launched Korridor Platform")
    public void driver_has_launched_korridor_platform() {
       korridorUserCredentialsTest.OpenKorridorWebsite();
    }
    @When("Driver Captures {string} and {string}")
    public void driver_captures_and(String string, String string2) {
        korridorUserCredentialsTest.EnterUserName(string);
        korridorUserCredentialsTest.EnterPassword(string);
    }
    @Then("Driver click LogIn")
    public void driver_click_log_in() {
        korridorUserCredentialsTest.ClickLogInButton();
    }

    // Switch to Alert or Pop Up Window

    @When("Driver switch to select company profile {string}")
    public void driver_switch_to_select_company_profile(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Driver click confirm button")
    public void driver_click_confirm_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Driver Read IMPORTANT NOTICE")
    public void driver_read_important_notice() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Driver click Ok button")
    public void driver_click_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}
