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

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.core.webdriver.IsMobile.driver;

public class DashBoad extends PageObject {
    WebDriver driver;

    // Add elements
    String NewOrderXpath = "/html/body/div[6]/div/div/div/div[1]/div[1]/div/a[1]";
    String DriverXpath = "/html/body/div[6]/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div[2]/a/span";
    String TruckXoath = "/html/body/div[6]/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[3]/div[2]/a/span";
    String TrailerXpath = "/html/body/div[6]/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[4]/div/div[1]/div/a/span";
    String CountryXpath = "/html/body/div[6]/div/div/div/div[1]/div[2]/div/div/div/form/div[2]/div/a/span";
    String ContinueXpath = "/html/body/div[6]/div/div/div/div[1]/div[2]/div/div/div/form/div[26]/div/button";

    // Methods

    @Step("click New Once off Order Button")
    public void NewOnceOffOrderButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NewOrderXpath))).click();
    }

    @Step("Select Driver")
    public void SelectDriver(String string3){
//        WebElement sl = driver.findElement(By.xpath("b/html/body/div[9]/div/div/div[2]/div/form/select"));
        WebElement dropdown = driver.findElement(By.xpath("b/html/body/div[9]/div/div/div[2]/div/form/select"));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText("mugabe, bob");
    }
    @Step("SelectTruck")
    public void SelectTruck(String string4){
//        WebElement sl2 = driver.findElement(By.xpath("b/html/body/div[9]/div/div/div[2]/div/form/select"));
//        Select selectObject = new Select(sl2);
        WebElement dropdown = driver.findElement(By.xpath("b/html/body/div[9]/div/div/div[2]/div/form/select"));
        Select selectObject = new Select(dropdown);
//        selectObject.selectByValue("187401");
        selectObject.selectByVisibleText("ABB76543 (Volvo 2010 FB667)");

    }

    @Step("ClickContinueButton")
    public void ClickCOntinueButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ContinueXpath))).click();

    }
}
