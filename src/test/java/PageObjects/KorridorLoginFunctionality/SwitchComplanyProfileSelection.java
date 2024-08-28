package PageObjects.KorridorLoginFunctionality;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

import javax.swing.text.Element;

public class SwitchComplanyProfileSelection extends PageObject {

    // Switch to Company Profile Window and select Company from Drop Down.

    // Switch Elements

    String CompanyProfile = "//div[@class='bootbox modal fade bootbox-prompt in']//div[@class='modal-content']";
    String SelectCompany = "//div[@class='bootbox modal fade bootbox-prompt in']//div[@class='modal-content']";
    String ConfirmButton = "//button[normalize-space()='Confirm']";


    // Switch methods

    @Step("Click to select company on drop down")
    public void Click_to_select_company_on_drop_down(String Drop){
//        Element elementd = new Element() {
//        }
    }


}
