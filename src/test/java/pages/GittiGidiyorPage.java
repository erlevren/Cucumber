package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GittiGidiyorPage {
    public GittiGidiyorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Keşfetmeye Bak']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "(//*[@class='u0996x-2 lbZvZt'])[16]")
    public WebElement ikinciSayfaGor;
    @FindBy(xpath = "//*[@class='sc-12aj18f-1 ubwpe']")
    public WebElement ikinciSayfa;
    @FindBy(xpath = "//*[@class='sc-1nx8ums-0 dyekHG']")
    public List<WebElement> ikinciSayfaUrunler;
    @FindBy(xpath = "//div[@id='sp-addbasket-button']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "((//*[@id=\"sp-price-highPrice\"])[1]")
    public WebElement sayfaFiyat;
    @FindBy(xpath = "(//*[@class='icon-sepet-line-wrapper']")
    public WebElement sepetIcon;
    @FindBy(xpath = "//*[@class='tyj39b-5 bEEsJG']")
    public WebElement alert;
    @FindBy(xpath = "//*[@class='header-cart-hidden-link']")
    public WebElement sepetim;
    @FindBy(xpath = "//*[@id=\"cart-item-532588705\"]/div[1]/div[4]/div/div[2]/select/option")
    public List<WebElement> amaunt;
    @FindBy(xpath = "//*[@class='gg-d-8 gg-m-10 detail-price']")
    public WebElement sepetAmount;
    @FindBy(xpath = "//*[@class='total-price']")
    public WebElement sepetAmount2;
    @FindBy(xpath = "(//*[@class='gg-icon gg-icon-bin-medium'])[1]")
    public WebElement delete;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement bosSepet;


}
