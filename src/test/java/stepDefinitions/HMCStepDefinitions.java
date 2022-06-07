package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
    HotelMyCampPage hotel = new HotelMyCampPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hotel.loginButtonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hotel.username.sendKeys(ConfigReader.getProperty("hotelUser"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hotel.password.sendKeys(ConfigReader.getProperty("hotelPassword"));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hotel.login.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hotel.basariliGiris.isDisplayed());
    }
    @Then("gecersiz password girer")
    public void gecersizpasswordgirer() {
        hotel.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }


    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hotel.login.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotel.username.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username {string} girer")
    public void gecersizUsernameGirer(String username) {
        hotel.username.sendKeys(username);
    }

    @And("gecersiz password {string} girer")
    public void gecersizPasswordGirer(String password) {
        hotel.password.sendKeys(password);
    }
}
