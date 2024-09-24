package PageObjects.TMSLoginFunctionality.Orders;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class TMSOrders extends PageObject{

    // Add Orders Elements

    String OrdersXpath = "/html/body/div[2]/aside/section/ul/li[3]/a/span";
    String CreateOrderXpath = "//a[normalize-space()=\"Create Order\"]";
    String OrderIdXpath = "//input[@placeholder=\"Order Id...\"]";
    String PONumberXpath = "//input[@placeholder=\"PO Number...\"]";
    String CustomerXpath = "//div[@id=\"devextreme0\"]//div[@role=\"combobox\"][normalize-space()=\"Select...\"]";
    String RouteXpath = "//div[@id=\"routesLookup\"]//div[@role=\"combobox\"][normalize-space()=\"Select...\"]";
    String ProductXpath = "//select[@name=\"Product\"]";
    String ProductDescXpath = "//input[@placeholder=\"Product Desc...\"]";
    String DeliveryTypeXpath = "//select[@name=\"DeliveryType\"]";
    String QuantityXpath = "//input[@placeholder=\"Quantity...\"]";
    String CollectionDateXpath = "//input[@id=\"ExpectedOn\"]";
    String DeliveryDateXpath = "//input[@id=\"PlannedOn\"]";
    String SlotTimeXpath = "//input[@id=\"SlotTime\"]";
    String SaveButtonXpath = "//input[@value=\"Save\"]";


    // Add Methods

    @Step("Click Orders")
    public void ClickOrders(){
        $(By.xpath(OrdersXpath)).click();
    }

    public void ClickCreateOrderButton(){
        $(By.xpath(CreateOrderXpath)).click();
    }

    public void EnterOrderId(String OrderId){
        $(By.xpath(OrderIdXpath)).sendKeys("OrderId");
    }

    public void EnterPONumber(String PONumber){
        $(By.xpath(PONumberXpath)).sendKeys("PONumber");

    }

    public void SelectCustomer(String Customer){
        $(By.xpath(CustomerXpath)).getSelectedVisibleTexts();
    }
    public void SelectRoute(String Route){
        $(By.xpath(RouteXpath)).getSelectedVisibleTexts();
    }

    public void SelectProduct(String Product){
        $(By.xpath(ProductXpath)).getSelectedVisibleTexts();
    }

    public void EnterProductDesc(String ProductDesc){
        $(By.xpath(ProductDescXpath)).sendKeys("ProductDesc");
    }

    public void SelectDeliveryType(String DelType){
        $(By.xpath(DeliveryTypeXpath)).getSelectedVisibleTexts();
    }

    public void EnterQuantity(String Quantity){
        $(By.xpath(QuantityXpath)).sendKeys("Quantity");
    }

    public void EnterCollDate(String CollDate){
        $(By.xpath(CollectionDateXpath)).sendKeys("CollDate");
    }

    public void EnterDeliveryDate(String DelDate){
        $(By.xpath(DeliveryDateXpath)).sendKeys();
    }

    public void EnterSlotTime(String SlotTime){
        $(By.xpath(SlotTimeXpath)).sendKeys();
    }

    public void ClickSaveButton(){
        $(By.xpath(SaveButtonXpath)).click();
    }







}
