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
    @Then("Driver should be redirected to dashboard")
    public void driver_click_log_in() {
       // TMSUserCredentialsTest.ClickLogInButton();
    }

    // Navigate to HomePage.

    @When("Click Orders Button on My Work")
    public void click_orders_button_on_my_work() {
        TMSUserCredentialsTest.ClickOrders();
    }
    @When("Click Create Order Button")
    public void click_create_order_button() {
        TMSUserCredentialsTest.ClickCreateOrderButton();
    }
    @When("Enter {string} and {string}")
    public void enter_and(String OrderId, String PONumber) {
        TMSUserCredentialsTest.EnterOrderId(OrderId);
        TMSUserCredentialsTest.EnterPONumber(PONumber);

    }
    @When("Select {string}, {string}, {string}, Capture {string}, select {string} and Capture {string}")
    public void select_capture_select_and_capture(String Customer, String Route, String Product, String ProductDesc, String DelType, String Quantity) {
        TMSUserCredentialsTest.SelectCustomer(Customer);
        TMSUserCredentialsTest.SelectRoute(Route);
        TMSUserCredentialsTest.SelectProduct(Product);
        TMSUserCredentialsTest.EnterProductDesc(ProductDesc);
        TMSUserCredentialsTest.SelectDeliveryType(DelType);
        TMSUserCredentialsTest.EnterQuantity(Quantity);
    }
    @When("Enter {string}, {string} and {string}")
    public void enter_and(String CollDate, String DelDate, String SlotTime) {
        TMSUserCredentialsTest.EnterCollDate(CollDate);
        TMSUserCredentialsTest.EnterDeliveryDate(DelDate);
        TMSUserCredentialsTest.EnterSlotTime(SlotTime);
    }
    @Then("Click SaveButton")
    public void click_save_button() {
        TMSUserCredentialsTest.ClickSaveButton();
    }






}
