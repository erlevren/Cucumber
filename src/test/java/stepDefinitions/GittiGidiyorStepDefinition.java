package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GittiGidiyorPage;
import utilities.Driver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GittiGidiyorStepDefinition {

    GittiGidiyorPage gitti = new GittiGidiyorPage();
    Random rnd = new Random();
    Actions actions;
    List<WebElement> ikinciSUrunler;
    WebDriverWait wait;


    @Then("kullanici bilgisayar icin arama yapar")
    public void kullanici_bilgisayar_icin_arama_yapar() {

        gitti.aramaKutusu.sendKeys("bilgisayar"+Keys.ENTER);

    }

    @Then("kullanici arama sayfasinda ikinci sayfaya gecer")
    public void kullanici_arama_sayfasinda_ikinci_sayfaya_gecer() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",gitti.ikinciSayfaGor);
        wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(gitti.ikinciSayfa));
        gitti.ikinciSayfa.click();


    }

    @Then("kullanici ikinci sayfada oldugunu test eder")
    public void kullanici_ikinci_sayfada_oldugunu_test_eder() {

        Assert.assertTrue(gitti.ikinciSayfa.isDisplayed());
    }

    @Then("kullanici urunlerden rastgele birini secer, bilgilerini ve tutarini txt dosyaya yazdirir")
    public void kullanici_urunlerden_rastgele_birini_secer_bilgilerini_ve_tutarini_txt_dosyaya_yazdirir() throws IOException {

        ikinciSUrunler =gitti.ikinciSayfaUrunler;
        int rondom = rnd.nextInt(ikinciSUrunler.size());
        ikinciSUrunler.get(rondom+1).getText();
        File file = new File("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\gitti.txt");
        FileWriter yaz = new FileWriter(file);
        yaz.write(ikinciSUrunler.get(rondom+1).getText());
        yaz.close();
        ikinciSUrunler.get(rondom+1).click();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @Then("kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
        wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(gitti.sepeteEkle));
        gitti.sepeteEkle.click();
    }

    @Then("kullanici sayfadaki ve sepetteki urunun fiyatinin dogrulugunu test eder")
    public void kullanici_sayfadaki_ve_sepetteki_urunun_fiyatinin_dogrulugunu_test_eder() {
        String sayfadakiFiyat = gitti.sayfaFiyat.getText();
        //actions.moveToElement(gitti.sepetIcon).perform();
        String sepettekiFiyat = gitti.sepetAmount2.getText();
        Assert.assertEquals(sepettekiFiyat,sayfadakiFiyat);
    }
    @Then("kullanici urunu arttirir ve {int} adet oldugunu dogrular")
    public void kullanici_urunu_arttirir_ve_adet_oldugunu_dogrular(Integer int1) {
        wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(gitti.sepetim));
        gitti.sepetim.click();
        List<WebElement>drop = gitti.amaunt;
        for (WebElement w:drop) {
            Select select = new Select(w);
            select.selectByIndex(int1);
        }
        Assert.assertEquals(gitti.sepetAmount.getText(),gitti.sepetAmount2.getText());
    }
    @Then("kullanici urunu sepetten siler ve sepetin bos oldugunu dogrular")
    public void kullanici_urunu_sepetten_siler_ve_sepetin_bos_oldugunu_dogrular() {
        wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(gitti.delete));
        gitti.delete.click();
        Assert.assertTrue(gitti.bosSepet.isDisplayed());
    }
}
