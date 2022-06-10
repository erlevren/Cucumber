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



}
