package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement email;
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    public WebElement create;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement title;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//span[normalize-space()='Register']")
    public WebElement register;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement news;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement offers;
    @FindBy(xpath = "//*[@class='info-account']")
    public WebElement myaccount;


}
