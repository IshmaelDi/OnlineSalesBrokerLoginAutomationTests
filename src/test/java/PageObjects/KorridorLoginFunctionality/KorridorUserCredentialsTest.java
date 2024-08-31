package PageObjects.KorridorLoginFunctionality;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KorridorUserCredentialsTest extends PageObject {



    // Korridor Front End Url

    // https://apptest.korridor.com/

    String Url = "https://apptest.korridor.com/login";
    public void OpenKorridorWebsite(){

        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();
        //getDriver().manage().window().maximize();

    }

    // Korridor Login Page Elements

    String UserNameXpath = "//input[@id='username']";
    String PasswordXpath = "//input[@id='password']";
    String SignInButton = "//button[@id='login-btn']";

    // Switch Company Profile Pop Up.

    // Handle this as Alert
    // Add Dependency : Import org.openqa.selenium.Alert



    String SwitchCompanyProfileXpath = "(//div[@class='modal-content'])[2]";
    String SwitchXpath = "/html/body/div[9]/div";
    String CompanySelectionXpath = "(//select[@class='bootbox-input bootbox-input-select form-control'])[1]";
    String ConfirmButtonXpath = "//button[normalize-space()='Confirm']";
    String NoticeXpath = "//div[@class='modal-body']";
    String OkButtonXpath = "//button[normalize-space()='OK']";



    // Korridor Login Page Methods

    @Step("Enter UserName")
    public void EnterUserName(String UserName){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(UserName);
    }

    @Step("Enter Password")
    public void EnterPassword(String Password){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(Password);
    }

    @Step("Click LogIn Button")
    public void ClickLogInButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInButton))).click();

    }

    // Switch Company Profile Pop Up.

    @Step("There will be a pop window for company profile selection")
    public void CompanyProfileNotice(){
        boolean isNoticeInfoDisplayed = $(By.xpath(SwitchCompanyProfileXpath)).isDisplayed();

        //Implement Alert



        if (isNoticeInfoDisplayed){

            System.out.println(("Notice information is displayed : IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates, 24 June 2019 to 28 June 2019 and between 6 July 2019 to 9 July 2019 for fuel collections, due to a road upgrade." + $(By.xpath(SwitchCompanyProfileXpath)).getText()));
        }else
        {

            Assert.fail("Notice Information not Displayed");
        }
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SwitchCompanyProfileXpath)));
    }

    @Step("Click on Select Company Text and select Company Name")
    public void CompanyName(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SwitchCompanyProfileXpath))).click();
        WebElement dropdown = $(By.xpath(CompanySelectionXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("TEST COMPANY (PTY) LTD");

    }

    @Step("Click on Confirm Button")
    public void ConfirmButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement ConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmButtonXpath)));
        ConfirmButton.click();
    }









}