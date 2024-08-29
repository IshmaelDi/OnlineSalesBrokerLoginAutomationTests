package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import PageObjects.KorridorLoginFunctionality.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class KorridorUserLogin extends PageObject {

    @Steps
    KorridorUserCredentialsTest korridorUserCredentialsTest;


    // User Steps Definitions

    @Given("User logs in with valid Credentials")
    public void ValidCredentials(){
        korridorUserCredentialsTest.OpenKorridorWebsite();
    }
    @When("User Captures {string} and {string}")
    public void User_Captures_UserName_Password_and_Click_Login_Button(String UserName, String Password){
        korridorUserCredentialsTest.EnterUserName(UserName);
        korridorUserCredentialsTest.EnterPassword(Password);
    }

    @And("User Click LogIn Button")
    public void ClickLogInButton(){
        korridorUserCredentialsTest.ClickLogInButton();
    }

    @And("There will be a pop window for company profile selction")
    public void there_will_be_a_pop_window_for_company_profile_selction() {
        korridorUserCredentialsTest.CompanyProfileNotice();
    }
    @When("Click to select {string} from drop down list")
    public void click_to_select_from_drop_down_list(String string) {
        korridorUserCredentialsTest.CompanyName();
    }
    @Then("Click Confirm Button")
    public void click_confirm_button() {
        korridorUserCredentialsTest.ConfirmButton();
    }

}
