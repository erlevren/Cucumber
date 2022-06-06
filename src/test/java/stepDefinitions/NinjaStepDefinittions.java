package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NinjaStepDefinittions {
    NinjaPage ninja = new NinjaPage();
    List<String> sayfaListesi = new ArrayList<>();
    List<String> sepetListesi = new ArrayList<>();
    //~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    //    ~ click on Phones & PDAs
    //    ~ get the brandName of phones
    //    ~ click on add to button for all elements
    //    ~ click on black total added cart button
    //    ~ get the names of list from the cart
    //    ~ compare the names from displaying list and cart list
    @Given("kullanici ninja anasayfasinda")
    public void kullanici_ninja_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("ninjaUrl"));
    }
    @Then("kullanici phone sayfasina gider")
    public void kullanici_phone_sayfasina_gider() {
        ninja.phone.click();
    }
    @Then("telefonlarin marka adini alir")
    public void telefonlarin_marka_adini_alir() {

        for (WebElement w:ninja.phoneList) {
            sayfaListesi.add(w.getText());
        }
    }
    @Then("tum ogeleri sepete ekle")
    public void tum_ogeleri_sepete_ekle() {
        for (WebElement w : ninja.addToCart) {
            w.click();
        }
    }
    @Then("sepete tikla")
    public void sepete_tikla() throws InterruptedException {
        Thread.sleep(2000);
        ninja.sepet.click();
    }
    @Then("sepetteki isimleri al")
    public void sepetteki_isimleri_al() {

        for (WebElement each:ninja.sepettekiIsimler) {
            sepetListesi.add(each.getText());
        }
    }
    @Then("sepetteki ve sayfadaki listeleri karsilastir")
    public void sepetteki_ve_sayfadaki_listeleri_karsilastir() {
        System.out.println(sayfaListesi);
        System.out.println(sepetListesi);
        Collections.sort(sayfaListesi);
        Collections.sort(sepetListesi);
        Assert.assertEquals(sayfaListesi,sepetListesi);
    }
    @Then("sayfayi kapat")
    public void sayfayi_kapat() {
        Driver.closeDriver();
    }
}
