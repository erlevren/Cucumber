package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@onclick='addElement()']")
    public WebElement addElement;
    @FindBy (xpath = "//button[@class='added-manually']")
    public WebElement deleteButton;
    @FindBy (id="elements")
    public WebElement delete;

}
