package PageObjects.KorridorLoginFunctionality;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KorridorUserCredentialsTest extends PageObject {

    // Korridor Front End Url

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

    //Switch Company Profile Po up

    String SwitchCompanyProfileXpath = "(//div[@class='modal-content'])[2]";
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

        if (isNoticeInfoDisplayed){

            System.out.println(("Notice information is displayed : " + $(By.xpath(SwitchCompanyProfileXpath)).getText()));
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