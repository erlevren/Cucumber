package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinition {
    AutomationPage auto = new AutomationPage();
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        auto.signIn.click();
    }
    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
        auto.email.sendKeys("erd@gmail.com");
    }
    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        auto.create.click();
    }
    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {
    auto.title.click();
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
    auto.firstName.sendKeys(faker.name().firstName());
    actions.sendKeys(Keys.TAB).
            sendKeys(faker.name().lastName())
            .sendKeys(Keys.TAB).sendKeys(Keys.TAB).
            sendKeys(faker.internet().password())
            .sendKeys(Keys.TAB).
            sendKeys("3").
            sendKeys(Keys.TAB)
            .sendKeys("July").
            sendKeys(Keys.TAB).sendKeys("1985").perform();
    auto.news.click();
    auto.offers.click();
            actions.sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
            .sendKeys("kepez").sendKeys(Keys.TAB).
            sendKeys("antalya").sendKeys(Keys.TAB).sendKeys("Texas").sendKeys(Keys.TAB).sendKeys("Texas").
            sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
            sendKeys("nediban").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("123456789").
            sendKeys(Keys.TAB).sendKeys("987654321").sendKeys(Keys.TAB).perform();

    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
        auto.register.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
        Assert.assertTrue(auto.myaccount.isDisplayed());
    }


}
