package PlatformChangeRequestTests.TMSorderCreate;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


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
    String RememberMe = "//input[@id='Input_RememberMe']";
    String LoginXpath = "//button[normalize-space()=\"Log In\"]";

        // /html/body/div[2]/aside/section/ul/li[3]/a/span

    String Dashboard = "//h1[normalize-space()=\"Dashboard\"]";

    String ForgotPasswordXpath = "//*[@id=\"forgot-password\"]";
    String Orders = "TMSorderCreate";
    String OrdersXpath = "//body/div[@class='wrapper']/aside[@class='main-sidebar']/section[@class='sidebar']/ul[@class='sidebar-menu tree']/li[1]/a[1]";
    String CreateOrderXpath = "//a[normalize-space()=\"Create Order\"]";
    String ClickCreateOrder = "//a[normalize-space()='Create Order']";
    String OrderIdXpath = "//input[@placeholder=\"Order Id...\"]";
    String PONumberXpath = "//input[@placeholder=\"PO Number...\"]";

    ///html[1]/body[1]/div[2]/div[1]/form[1]/section[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]

    String CustomerXpath = "//select[@name=\"Customer\"]";
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
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(string1);
    }

    @Step("Enter Password")
    public void EnterPassword(String string2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(string2);

    }
    @Step("Click Login")
    public void Login(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath))).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginXpath)));

        element.click();

    }

//    @Step("Redirected to dashboard")
//    public void RedirectedToDashboard() {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
//        String expectedUrl = "//h1[normalize-space()=\"Dashboard\"]";
//        assertEquals(expectedUrl, driver.getCurrentUrl());
//       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath))).click();
//
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard)));
//
//        element.click();
//    }


    @Step("Click TMSorderCreate")
    public void ClickOrders(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Order']")));

        element.click();

    }
    @Step("ClickCreateOrderButton")
    public void ClickCreateOrderButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15) );
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='btn btn-primary']"))).click();

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CreateOrderXpath)));

        element.click();




        //$(By.tagName("a")).click();
    }

    public void EnterOrderId(String OrderId){
        $(By.xpath(OrderIdXpath)).sendKeys("TMS001");
    }

    public void EnterPONumber(String PONumber){
        $(By.xpath(PONumberXpath)).sendKeys("TMS002");

    }

    public void SelectCustomer(String Customer){

        WebElement dropdown = $(By.xpath("(//div[@role='combobox'][normalize-space()='SIM001 - Simone Sims'])[1]"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Customer);
        //$(By.xpath(CustomerXpath)).getSelectedVisibleTexts();
        // /html/body/div[2]/div/form/section[2]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[1]
    }
    public void SelectRoute(String Route){

        WebElement dropdown = $(By.xpath(RouteXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Route);



       // $(By.xpath(RouteXpath)).getSelectedVisibleTexts();
    }

    public void SelectProduct(String Product){

        WebElement dropdown = $(By.xpath(ProductXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(Product);




        //$(By.xpath(ProductXpath)).getSelectedVisibleTexts();
    }

    public void EnterProductDesc(String ProductDesc){
        $(By.xpath(ProductDescXpath)).sendKeys("ProductDesc");
    }

    public void SelectDeliveryType(String DelType){

        WebElement dropdown = $(By.xpath(DeliveryTypeXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(DelType);


       // $(By.xpath(DeliveryTypeXpath)).getSelectedVisibleTexts();
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









