package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.WebDriverPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepDefinition {

    WebDriverPage web = new WebDriverPage();
    ArrayList<String> windows;
    String url;
    @Then("kullanici login portal'a kadar asagi iner")
    public void kullaniciLoginPortalAKadarAsagiIner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        url = Driver.getDriver().getCurrentUrl();
    }
    @And("kullanici login portal'a tiklar")
    public void kullaniciLoginPortalATiklar() {
        web.loginPortal.click();
    }
    @And("kullanici diger window'a gecer")
    public void kullaniciDigerWindowAGecer() {
        windows = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }
    @And("kullanici username kutusuna {string} bilgileri girer")
    public void kullaniciUsernameKutusunaBilgileriGirer(String username) {
        web.username.sendKeys(username);
    }
    @And("kullanici password kutusuna {string} bilgilerini girer")
    public void kullaniciPasswordKutusunaBilgileriniGirer(String password) {
        web.password.sendKeys(password);
    }
    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        web.ikinciLoginButton.click();
    }
    @And("kullanici popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
        String actualPopupText = Driver.getDriver().switchTo().alert().getText();
        String expectedPopupText = "validation failed";
        Assert.assertEquals(expectedPopupText,actualPopupText);
    }
    @And("kullanici popupu kapatir")
    public void kullaniciOkABasarPopupUKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windows.get(0));
    }
    @And("kullanici ilk sayfaya dondugunu test eder")
    public void kullaniciIlkSayfayaDondugunuTestEder() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),url);
    }
    @And("tum sayfalari kapatir")
    public void tumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
