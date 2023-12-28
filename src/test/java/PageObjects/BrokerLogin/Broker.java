package PageObjects.BrokerLogin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//import static com.github.rjeschke.txtmark.HTMLElement.iframe;

public class Broker extends PageObject{

    // Broker Elements

    String BrokerLoginXpath = "//div[@class='slider-buynow']";
    String BrokerSelectXpath = "//a[@id='brokerbutton']";
    String FrameXpath = "//iframe[@name='1703074201986']";

    String URL ="https://portals.freshive.co.za/clienteleonlinesales/";



    public void OpenWebsite(){

        getDriver().get(URL);

        getDriver().getWindowHandle();


    }

    // Broker Logic
    @Step("ClickBrokerLogin")
    public void ClickBrokerLogin(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerLoginXpath))).click();
    }
    @Step("SelectBrokerOption")
    public void SelectBrokerOption(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerSelectXpath))).click();
    }


//    public void switchToFrame (){
//
//
//        WebElement frame = $(By.tagName("iframe"));
//
//
//        getDriver().switchTo().frame(frame);
//
//    }

    }








