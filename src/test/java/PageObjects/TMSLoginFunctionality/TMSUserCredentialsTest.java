package PageObjects.TMSLoginFunctionality;

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

import static org.junit.Assert.*;


public class TMSUserCredentialsTest extends PageObject {
    WebDriver driver;


    String Url = "https://korridor.crownsoftware.co.za/";

    public void OpenKorridorWebsite() {

        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();


    }



    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";
    String LoginXpath = "//button[normalize-space()=\"Log In\"]";

        // /html/body/div[2]/aside/section/ul/li[3]/a/span

    String ForgotPasswordXpath = "//*[@id=\"forgot-password\"]";
    String Orders = "Orders";
    String OrdersXpath = "//body/div[@class='wrapper']/aside[@class='main-sidebar']/section[@class='sidebar']/ul[@class='sidebar-menu tree']/li[1]/a[1]";
    String CreateOrderXpath = "//a[normalize-space()=\"Create Order\"]";
    String ClickCreateOrder = "//*[@id=\"uberApp\"]/section[1]/div/a";
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


    // /html/body/div[2]/aside/section/ul/li[3]/a




    @Step("Enter UserName")
    public void EnterUserName(String string1) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(string1);
    }

    @Step("Enter Password")
    public void EnterPassword(String string2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(string2);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginXpath))).click();
    }

    @Step("Redirected to dashboard")
    public void RedirectedToDashboard() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        String expectedUrl = "//h1[normalize-space()=\"Dashboard\"]";
        assertEquals(expectedUrl, driver.getCurrentUrl());
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath))).click();

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ForgotPasswordXpath)));

        element.click();
    }


    @Step("Click Orders")
    public void ClickOrders(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));

        element.click();

    }

    public void ClickCreateOrderButton(){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()=\"Create Order\"]")));

        element.click();


        //$(By.tagName("a")).click();
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









