package PageObjects.BrokerLogin;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainMember extends PageObject {


    //MainMember Web Elements Implementations
    String BrokerTitleXpath = "//select[@id='onTtl']";
    String BrokerNameXpath = "/(//input[@id='onName'])[1]";
    String BrokerSurnameXpath = "(//input[@id='onSurname'])[1]";
    String BrokerIdNumberXpath = "//input[@id='onID']";
    String BrokerContactNumberXpath = "//input[@id='onMobile']";


    //MainMember Web Logic Implementations

    @Step("Select BrokerTitle")
    public void BrokerTitle(String Title) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerTitleXpath))).click();
        WebElement BrokerTitle = $(By.xpath(BrokerTitleXpath));
        Select selectObject = new Select(BrokerTitle);
        selectObject.selectByValue(Title);



        //selectFromDropdown(BrokerTitle, Title);
    }
    @Step("CApture BrokerName")
    public void BrokerName(String Name){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerNameXpath))).sendKeys(Name);
    }
    @Step("Capture BrokerSurname")
    public void BrokerSurname(String Surname){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerSurnameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerSurnameXpath))).sendKeys(Surname);

    }
}
