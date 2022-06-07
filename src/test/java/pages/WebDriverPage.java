package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverPage {
    public WebDriverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[normalize-space()='LOGIN PORTAL']")
    public WebElement loginPortal;
    @FindBy(xpath = "//input[@id='text']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement ikinciLoginButton;

}
