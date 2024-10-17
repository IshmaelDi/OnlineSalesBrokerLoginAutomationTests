package PlatformChangeRequestTests.MozInsurance;

import net.serenitybdd.core.pages.PageObject;

import java.time.Duration;



public class MozOrders extends PageObject {

    String Url = "https://apptest.korridor.com/";

    public void OpenKorridorWebsite() {


        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();
        getDriver().get(Url);



    }

    String nXpath = "//*[@id=\"username\"]";
    String pXpath = "//*[@id=\"password\"]";
    String sXpath = "//*[@id=\"login-btn\"]";




}
