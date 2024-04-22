package PageObjects.BrokerLogin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;


public class BrokerCodeAccess extends PageObject {

    // Credentials for Broker Login In.

    // Enter BrokerCode = i2124
    // Enter Password = Password2023
    // Click Login Button

    String BrokerCodeXpath = "(//input[@id='AdministratorBrokerCode'])[1]";
    String BrokerInputUserNameXpath = "//form[@id='brokerloginmain']//input[@id='AdministratorBrokerCode']";

    String BrokerPasswordXpath = "(//input[@id='AdministratorBrokerPassword'])[1]";
    String BrokerInputPasswordXpath = "(//input[@id='AdministratorBrokerPassword'])[1]";


    String LoginXpath = "//form[@id='brokerloginmain']//input[@value='login']";
    String LoginButtonXpath = "(//input[@value='login'])[1]";



    String URL ="https://portals.freshive.co.za/clienteleonlinesales/";


//  @Step("Enter email ")
//  public void EnterEmail(String email) {
//
//    $(By.xpath(EmailXpath)).sendKeys(email);


    // Switch to iframe using tagName

    public void switchToFrame (){
        WebElement frame = $(By.tagName("iframe"));
        getDriver().switchTo().frame(frame);
    }
    @Step("EnterBrokerCode")

    public void EnterBrokerCode(String BrokerCode) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerInputUserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerInputUserNameXpath))).sendKeys(BrokerCode);
    }
    @Step("EnterBrokerPassword")
    public void EnterBrokerPassword(String Password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerInputPasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerInputPasswordXpath))).sendKeys(Password);
    }
    @Step("ClickLoginButton")
    public void ClickLoginButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginButtonXpath))).click();

        getDriver().switchTo().defaultContent();

    }








}




