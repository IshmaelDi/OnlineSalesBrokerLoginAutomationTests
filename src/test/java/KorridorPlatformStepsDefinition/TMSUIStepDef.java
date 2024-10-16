package KorridorPlatformStepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class TMSUIStepDef extends PageObject {

    @Steps
    PlatformChangeRequestTests.TMSorderCreate.TMSUserCredentialsTest TMSUserCredentialsTest;




    // Driver Steps Definitions

    @Given("Driver has launched PlatformChangeRequestTests Platform")
    public void driver_has_launched_korridor_platform() {
       TMSUserCredentialsTest.OpenKorridorWebsite();
    }
    @When("Driver Captures UserName and Password")
    public void driver_captures_user_name_and_password() {
       TMSUserCredentialsTest.EnterUserName("ishmael.direro@korridor.com ");
       TMSUserCredentialsTest.EnterPassword("Ish@cyest#982");

    }

    @And("Driver click Login")
    public void Login(){
        TMSUserCredentialsTest.Login();
    }
//    @Then("Driver should be redirected to dashboard")
//    public void Dashboard() {
//        TMSUserCredentialsTest.RedirectedToDashboard();
//    }

    // Navigate to HomePage.

    @When("Click TMSorderCreate Button on My Work")
    public void click_orders_button_on_my_work() {
        TMSUserCredentialsTest.ClickOrders();
    }
    @When("Click Create Order Button")
    public void click_create_order_button() {
        TMSUserCredentialsTest.ClickCreateOrderButton();
    }
    @When("Enter {string} and {string}")
    public void enter_and(String string, String string2) {
        TMSUserCredentialsTest.EnterOrderId(string);
        TMSUserCredentialsTest.EnterPONumber(string2);

    }
    @When("Select {string}, {string}, {string}, Capture {string}, select {string} and Capture {string}")
    public void select_capture_select_and_capture(String string3, String string4, String string5, String string6, String string7, String string8) {
        TMSUserCredentialsTest.SelectCustomer(string3);
        TMSUserCredentialsTest.SelectRoute(string4);
        TMSUserCredentialsTest.SelectProduct(string5);
        TMSUserCredentialsTest.EnterProductDesc(string6);
        TMSUserCredentialsTest.SelectDeliveryType(string7);
        TMSUserCredentialsTest.EnterQuantity(string8);
    }
    @When("Enter {string}, {string} and {string}")
    public void enter_and(String string9, String string10, String string11) {
        TMSUserCredentialsTest.EnterCollDate(string9);
        TMSUserCredentialsTest.EnterDeliveryDate(string10);
        TMSUserCredentialsTest.EnterSlotTime(string11);
    }
    @Then("Click SaveButton")
    public void click_save_button() {
        TMSUserCredentialsTest.ClickSaveButton();
    }






}
