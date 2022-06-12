package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import java.util.ArrayList;
import java.util.List;

public class GuruStepDefinition {
    GuruPage demoGuruPage=new GuruPage();

    @And("kullanici {string} sutunundaki tum degerleri yazdirir")
    public void kullaniciSutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        List<List<WebElement>> sutunBaslikListesi=new ArrayList<>();
        sutunBaslikListesi.add(demoGuruPage.sutunBaslikList1);
        sutunBaslikListesi.add(demoGuruPage.sutunBaslikList2);
        sutunBaslikListesi.add(demoGuruPage.sutunBaslikList3);
        sutunBaslikListesi.add(demoGuruPage.sutunBaslikList4);
        sutunBaslikListesi.add(demoGuruPage.sutunBaslikList5);

        switch (istenenBaslik){
            case "Company":
                sutunBaslikListesi.get(0).forEach(t-> System.out.println(t.getText()));
                break;
            case "Group":
                sutunBaslikListesi.get(1).forEach(t-> System.out.println(t.getText()));
                break;
            case "Prev Close (Rs)":
                sutunBaslikListesi.get(2).forEach(t-> System.out.println(t.getText()));
                break;
            case "Current Price (Rs)":
                sutunBaslikListesi.get(3).forEach(t-> System.out.println(t.getText()));
                break;
            case "% Change":
                sutunBaslikListesi.get(4).forEach(t-> System.out.println(t.getText()));
                break;
        }
    }
}