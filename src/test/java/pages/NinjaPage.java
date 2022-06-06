package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {
    public NinjaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
    public WebElement phone;
    @FindBy(xpath = "//h4")
    public List<WebElement> phoneList;
    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addToCart;
    @FindBy(id = "cart-total")
    public WebElement sepet;
    @FindBy(xpath = "//*[@class='text-left']")
    public List<WebElement> sepettekiIsimler;

}
