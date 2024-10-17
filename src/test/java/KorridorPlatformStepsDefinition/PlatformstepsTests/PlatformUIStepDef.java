package KorridorPlatformStepsDefinition.PlatformstepsTests;





import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import KorridorPlatformObjects.PlatformPage.LandingPage;

public class PlatformUIStepDef extends PageObject {

    @Steps
    PlatformUIStepDef platformUIStepDef;
    LandingPage landingPage;


    @Given("Open LandingPage Url")
    public void openLandingPageUrl() throws InterruptedException {
        landingPage.OpenWebsite();
    }

    @When("Login using valid Credentials")
    public void login_using_valid_credentials() {
        landingPage.loginIn("ishmael.direro@korridor.com", "Ish@cyest#982");





    }
    @When("Clicks on PlatformChangeRequestTests Logo")
    public void clicks_on_tms_logo() throws InterruptedException {
        landingPage.TMSLogo();
    }
    @When("Click on Toggle")
    public void click_on_toggle() throws InterruptedException {
        landingPage.Toggle();
    }
    @When("Click on Tenant and select {string} on dropdown")
    public void click_on_tenant_and_select_on_dropdown(String Demo) throws InterruptedException {
        landingPage.ClicksOnTenantAndSelectDemoFromDropList("Demo");
    }
    @When("Click on Principal and select {string} on dropdown")
    public void click_on_principal_and_select_on_dropdown(String AutoDemoTest) throws InterruptedException {
        landingPage.ClickonPrincipalAndSelectAutoDemoFromDropList("AutoDemoTest");
    }
    @Then("Click on User Email and Click {string} Button")
    public void click_on_user_email_and_click_button(String string) throws InterruptedException {
        landingPage.ClickOnUserEmailAndClickLogOutButton();
    }


}
