package stepsDefinition.Orders;

import PageObjects.TMSLoginFunctionality.Orders.TMSOrders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class OrdersStep extends PageObject{

    @Steps
    TMSOrders tmsOrders;


}
