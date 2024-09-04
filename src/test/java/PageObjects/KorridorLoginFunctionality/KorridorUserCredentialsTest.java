package PageObjects.KorridorLoginFunctionality;

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



public class KorridorUserCredentialsTest extends PageObject {

    WebDriver driver;
    WebDriverWait webDriverWait;
    org.htmlunit.javascript.host.html.HTMLElement htmlElement;



    // Korridor Front End Url

    // https://apptest.korridor.com/

    String Url = "https://apptest.korridor.com/login";
    private Label alert;

    public void OpenKorridorWebsite(){

        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();
        //getDriver().manage().window().maximize();

    }

    // Korridor Login Page Elements

    String UserNameXpath = "//input[@id='username']";
    String PasswordXpath = "//input[@id='password']";
    String SignInXpath = "login-btn";
    String SignInButton = "/html/body/flt-glass-pane//form/input[2]";

    // Switch Company Profile Pop Up.

    // Handle this as Alert
    // Add Dependency : Import org.openqa.selenium.Alert



    String SwitchCompanyProfileXpath = "(//div[@class='modal-content'])[2]";
    String SwitchXpath = "/html/body/div[9]/div/div/div[2]/div/form/select";
    String CompanySelectionXpath = "/html/body/div[9]/div/div/div[2]/div/form/select";
    String ConfirmButtonXpath = "//button[normalize-space()='Confirm']";
    String NoticeXpath = "//div[@class='modal-body']";
    String OkButtonXpath = "//button[normalize-space()='OK']";



    // Korridor Login Page Methods

    @Step("Enter UserName")
    public void EnterUserName(String string){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(string);
    }

    @Step("Enter Password")
    public void EnterPassword(String string){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(string);
    }

    @Step("Click LogIn Button")
    public void ClickLogInButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(SignInXpath))).click();
    }

    // Switch to Company Profile Pop Up Window.
    // Implement handling an alert pop-up: Which it is a Modal BootBox

    @Step("There will be a pop window for company profile selection")
    public void CompanyProfileNotice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalButton = $(By.xpath("//*[@id=\"login-btn\"]"));
        modalButton.click();

//        Alert sAlert = driver.switchTo().alert();
//        sAlert.wait();
//        wait.until(ExpectedConditions.elementToBeClickable(By.className("modal-content"))).click();
//


        WebElement modalContainer = $(By.id("modal-dialog"));
        modalContainer.click();
        WebElement modalContentBody = modalContainer.findElement(By.className("bootbox-input bootbox-input-select form-control"));
        modalContentBody.click();

        WebElement dropdown = $(By.xpath("b/html/body/div[9]/div/div/div[2]/div/form/select"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("1");
        WebElement modalConfirmButton = $(By.xpath(".//button[normalize-space()='Confirm']"));
        modalConfirmButton.click();




////        // Trigger the Alert
////
////        driver.findElement(By.id(SignInXpath)).click();
////
////        // Switch to the Alert
////
////        Alert alert = driver.switchTo().alert();
////
////        // Print or Display the alert txt
////
////        System.out.println(alert.getText());
////
////        // Accept the alert
//
//        alert.accept();


//        boolean isNoticeInfoDisplayed = $(By.xpath(SwitchCompanyProfileXpath)).isDisplayed();
//
//
//        if (isNoticeInfoDisplayed){
//
//            System.out.println(("Notice information is displayed : IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates, 24 June 2019 to 28 June 2019 and between 6 July 2019 to 9 July 2019 for fuel collections, due to a road upgrade." + $(By.xpath(SwitchCompanyProfileXpath)).getText()));
//        }else
//        {
//
//            Assert.fail("Notice Information not Displayed");
//        }
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SwitchCompanyProfileXpath)));
    }

    @Step("Click on Select Company Text and select Company Name")
    public void CompanyName(String string){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SwitchCompanyProfileXpath))).click();
        WebElement dropdown = $(By.xpath(CompanySelectionXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("1");

    }

    @Step("Click on Confirm Button")
    public void ConfirmButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement ConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmButtonXpath)));
        ConfirmButton.click();
    }
    @Step("Driver Read IMPORTANT NOTICE")
    public void IMPORTANTNOTICE(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement IMPORTANTNOTICE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NoticeXpath)));
        System.out.println(alert.getText());
        alert.getText();
        boolean isNoticeInfoDisplayed = $(By.xpath(SwitchCompanyProfileXpath)).isDisplayed();


        if (isNoticeInfoDisplayed){

            System.out.println(("Notice information is displayed : IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates, 24 June 2019 to 28 June 2019 and between 6 July 2019 to 9 July 2019 for fuel collections, due to a road upgrade." + $(By.xpath(SwitchCompanyProfileXpath)).getText()));
        }else
        {

            Assert.fail("Notice Information not Displayed");
        }


    }
    @Step("Driver Click Ok Button")
    public void OKButoon(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement OKButoon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OkButtonXpath)));
        OKButoon.click();


    }









}