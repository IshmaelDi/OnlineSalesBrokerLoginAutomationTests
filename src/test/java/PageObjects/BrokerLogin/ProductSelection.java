package PageObjects.BrokerLogin;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class ProductSelection extends PageObject{

    String ProductSelectionXpath = "//select[@id='ProductCode']";
    String EnterApplicationLeadNumber = "//input[@id='ApplicationNumber']";
    String LoginXpath = "//form[@id='brokerlogin']//input[@value='login']";
    String iframeXpath = "//iframe[@name='1703714075017']";

    // Switch to iFrame Product Page Pop Up.

    public void FrameToSwitch () throws InterruptedException {

        Thread.sleep(2000);
        WebElement frame1 = $(By.tagName("iframe"));
        //WebElement frame1 = $(By.cssSelector("iframe#cboxContent"));
        getDriver().switchTo().frame(frame1);
    }
    @Step("SelectProductFromList")
    public void SelectProductFromList(String Product) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        WebElement dropdownElement = $(By.xpath(ProductSelectionXpath));
        Select selectObject = new Select(dropdownElement);

    }
    @Step("EnterLeadNumber")
    public void EnterLeadNumber(String LeadNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EnterApplicationLeadNumber))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EnterApplicationLeadNumber))).sendKeys(LeadNumber);
    }
    @Step("ClickLoginButton")
    public void ClickLoginButton()  {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath))).click();
        getDriver().switchTo().defaultContent();
    }



}
