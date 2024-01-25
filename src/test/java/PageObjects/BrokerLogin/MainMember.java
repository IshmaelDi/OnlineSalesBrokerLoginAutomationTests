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
    String BrokerTitleXpath = "(//select[@id='onTtl'])[1]";
    String BrokerNameXpath = "(//input[@id='onName'])[1]";
    String BrokerSurnameXpath = "(//input[@id='onSurname'])[1]";
    String BrokerIdNumberXpath = "//input[@id='onID']";
    String BrokerContactNumberXpath = "//input[@id='onMobile']";
    String PastalAddressXpath = "(//input[@id='onAddress1'])[1]";
    String PostalCodeXpath = "(//input[@id='onPostal'])[1]";
    String IncomeXpath = "(//select[@id='onIncome'])[1]";
    String OccupationXpath = "(//select[@id='onOccupation'])[1]";
    String EducationXpath = "(//select[@id='onEducation'])[1]";


    // FICA Declaration Elements

    String Fica1Xpath = "(//select[@id='fica01'])[1]";
    String Fica2Xpath = "(//select[@id='fica02'])[1]";

    // Continue Button Confirmation
    String MainContinueButtonXpath = "(//div[@class='fr btn'][normalize-space()='Continue'])[1]";




        //MainMember Web Logic Implementations

    @Step("Select BrokerTitle")
    public void BrokerTitle(String Title)  {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerTitleXpath)));
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
    @Step("Captgure IdNumber")
    public void IdNumber(String IdNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerIdNumberXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerIdNumberXpath))).sendKeys(IdNumber);
    }
    @Step("Captgure ContactNumber")
    public void ContactNumber(String mobileNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerContactNumberXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BrokerContactNumberXpath))).sendKeys(mobileNumber);
    }

    @Step("Captgure PostalAddress")
    public void PostalAddress(String PostalAddress){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PastalAddressXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PastalAddressXpath))).sendKeys(PostalAddress);
    }

    @Step("Captgure PostalCode")
    public void PostalCode(String PostalCode) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PastalAddressXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PastalAddressXpath))).sendKeys(PostalCode);
    }

    @Step("Select monthly income from dropdown")
    public void selectMonthlyIncome(String MonthlyIncome){
        WebElement dropdown = $(By.xpath(IncomeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(MonthlyIncome);

    }

    @Step("Select Occupation from dropdown")
    public void selectOccupation(String Occupation){
        WebElement dropdown = $(By.xpath(OccupationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Occupation);

    }

    @Step("Select Education from dropdown")
    public void selectEduction(String Education){
        WebElement dropdown = $(By.xpath(EducationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Education);
    }


    // Implementation of FICA Declarations

    @Step("Navigate to FICA Page")
    public void navigateFICA()throws  InterruptedException{
        Thread.sleep(5000);

        //$(By.xpath(FICAXpath)).click();

        WebElement isProminentPublicOfficial = $(By.xpath("(//select[@id='fica01'])[1]"));
        Select selectObject = new Select(isProminentPublicOfficial);
        selectObject.selectByValue("yes");

        WebElement isProminentInternationalPublicOfficial = $(By.xpath("(//select[@id='fica02'])[1]"));
        Select selectObject1 = new Select(isProminentInternationalPublicOfficial);
        selectObject1.selectByValue("yes");

       // $(By.xpath("//span[@class='title']")).click();

    }

    @Step("Click ContinueButton to Navigate to")

    public void ContinueButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MainContinueButtonXpath))).click();

    }









}
