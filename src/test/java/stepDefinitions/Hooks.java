package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
      Step definition package'i icerisinde @before,@after gibi bir notasyon varsa
    extends testBase dememize gerek kalmadan her scenario'dan once ve/veya sonra
    bu method'lar calisacaktir.
      Bu da bizim istemeyecegimiz bir durum degildir
      Cucumber'da @before, @after kullanma ihtiyacimiz olursa bunu
    stepDefinition package'i altinda olusturacagimiz hooks class'ina koyariz
      Biz her scenario'dan sonra test sonucunu kontrol edip failed olan
    scenario'lar için screenshoot olmasi amaciyla
    @After methodu kullanacağız
     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
