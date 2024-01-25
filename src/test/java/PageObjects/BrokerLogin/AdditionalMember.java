package PageObjects.BrokerLogin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class AdditionalMember extends PageObject{

    String SpouseXpath = "(//span[@class='rd'])[1]";
    String SpouseTitleXpath = "(//select[@id='onTtlSp'])[1]";
    String SpouseNameXpath = "(//input[@id='onNameSp'])[1]";
    String SpouseSurnameXpath = "(//input[@id='onSurnameSp'])[1]";

    // Extended member Elements

    String ExtendedMemberXpath = "(//span[@class='rd'])[3]";
    String ExtMemberTitleXpath = "(//select[@id='onTtlMem1'])[1]";
    String ExtMemberNameXpath = "(//input[@id='onNameMem1'])[1]";
    String ExtMemberSurnameXpath = "(//input[@id='onSurnameMem1'])[1]";

    // Extended Member Logic Implementation.

    @Step("Navigate to Extended Member Page")
    public void ExtendedMemberPage()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(ExtendedMemberXpath)).click();

    }

    @Step("Enter Extended Member Title")
    public void ExtendedMemberTitle(String extMemberTitle){
        WebElement Title = $(By.xpath("(//input[@id='onNameMem1'])[1]"));
        Title.click();
        Title.sendKeys(extMemberTitle);

    }

    @Step("Enter Extended Member Name")
    public void ExtendedMemberName(String spouseName){
        WebElement Name = $(By.xpath("(//input[@id='onNameMem1'])[1]"));
        Name.click();
        Name.sendKeys(spouseName);
    }

    @Step("Enter Extended Member Surname")
    public void ExtendedMemberSurname(String spouseSurname){
        WebElement Surname = $(By.xpath("(//input[@id='onSurnameMem1'])[1]"));
        Surname.click();
        Surname.sendKeys(spouseSurname);
    }





    // Spouse Logic Implementation

    @Step("Navigate to Spouse Page")
    public void navigateSpouse()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(SpouseXpath)).click();

    }

    @Step("Enter Spouse Title")
    public void spouseTitle(String spouseTitle){
        WebElement Title = $(By.xpath("//select[@id='Title']"));
        Title.click();
        Title.sendKeys(spouseTitle);

    }

    @Step("Enter Spouse Name")
    public void spouseName(String spouseName){
        WebElement Name = $(By.xpath("//input[@id='FirstNames']"));
        Name.click();
        Name.sendKeys(spouseName);
    }

    @Step("Enter Spouse Surname")
    public void spouseSurName(String spouseSurname){
        WebElement Surname = $(By.xpath("//input[@id='Surname']"));
        Surname.click();
        Surname.sendKeys(spouseSurname);
    }


}
