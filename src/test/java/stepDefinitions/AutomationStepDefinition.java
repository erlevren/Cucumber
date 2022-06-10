package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ConfigReader;

public class AutomationStepDefinition {
    AutomationPage auto = new AutomationPage();
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        auto.signIn.click();
    }

    @And("user Create and account bölümüne email adresi girer")
    public void userCreateAndAccountBölümüneEmailAdresiGirer() {
        auto.email.sendKeys(ConfigReader.getProperty("email"));
    }
    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        auto.create.click();
    }
    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {

    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
    }
}
