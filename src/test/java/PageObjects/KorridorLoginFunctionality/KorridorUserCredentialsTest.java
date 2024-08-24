package PageObjects.KorridorLoginFunctionality;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KorridorUserCredentialsTest extends PageObject {

    // Korridor Front End Url

    String Url = "https://apptest.korridor.com/login";
    public void OpenKorridorWebsite(){
        getDriver().get(Url);
        getDriver().getWindowHandle();
    }

    // Korridor Login Page Elements

    String UserNameXpath = "//input[@id='username']";
    String PasswordXpath = "//input[@id='password']";
    String SignInButton = "//button[@id='login-btn']";


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



}