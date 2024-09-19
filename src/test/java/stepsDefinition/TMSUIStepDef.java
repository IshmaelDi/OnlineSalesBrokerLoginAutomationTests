package stepsDefinition;

import PageObjects.TMSLoginFunctionality.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class TMSUIStepDef extends PageObject {

    @Steps
    TMSUserCredentialsTest TMSUserCredentialsTest;



    // Driver Steps Definitions

    @Given("Driver has launched TMS Platform")
    public void driver_has_launched_korridor_platform() {
       TMSUserCredentialsTest.OpenKorridorWebsite();
    }
    @When("Driver Captures UserName and Password")
    public void driver_captures_user_name_and_password() {
       TMSUserCredentialsTest.EnterUserName("ishmael.direro@korridor.com ");
       TMSUserCredentialsTest.EnterPassword("Ish@cyest#98");
    }
    @Then("Driver click LogIn")
    public void driver_click_log_in() {
        TMSUserCredentialsTest.ClickLogInButton();
    }






}
