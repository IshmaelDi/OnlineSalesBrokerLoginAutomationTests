package stepsDefinition;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class KorridorUserLogin extends PageObject {



    @Steps
    KorridorUserCredentials

    @Given("KorridorUser captures {string}, {string} and click Login Button.")
    public void broker_captures_and_click_login_button(String BrokerCode, String Password) throws InterruptedException {
        korridorUserCredentials.EnterBrokerCode(BrokerCode);
        korridorUserCredentials.EnterBrokerPassword(Password);
        korridorUserCredentials.ClickLoginButton();
    }



}
