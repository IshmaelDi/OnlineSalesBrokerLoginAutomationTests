package stepsDefinition;

import PageObjects.KorridorLoginFunctionality.KorridorUserCredentialsTest;
import io.cucumber.java.en.Given;
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
    @When("Driver Captures UserName and Password")
    public void driver_captures_user_name_and_password() {
       korridorUserCredentialsTest.EnterUserName("Ncane ");
       korridorUserCredentialsTest.EnterPassword("qpPcAK7x");
    }
    @Then("Driver click LogIn")
    public void driver_click_log_in() {
        korridorUserCredentialsTest.ClickLogInButton();
    }

    // Switch to Alert or Pop Up Window

    @When("Driver switch to select company profile {string}")
    public void driver_switch_to_select_company_profile(String string)  {
        korridorUserCredentialsTest.CompanyName("TEST COMPANY (PTY) LTD");

    }





    @When("Driver click confirm button")
    public void driver_click_confirm_button() {
        korridorUserCredentialsTest.ConfirmButton();
    }
    @When("Driver Read IMPORTANT NOTICE")
    public void driver_read_important_notice() {
        korridorUserCredentialsTest.getDriver();
    }
    @Then("Driver click Ok button")
    public void driver_click_ok_button() {
        korridorUserCredentialsTest.OKButoon();
    }






}
