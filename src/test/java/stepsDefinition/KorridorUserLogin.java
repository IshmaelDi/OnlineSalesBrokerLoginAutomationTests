package stepsDefinition;

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

    @Then("User Click LogIn Button")
    public void ClickLogInButton(){
        korridorUserCredentialsTest.ClickLogInButton();
    }

}
