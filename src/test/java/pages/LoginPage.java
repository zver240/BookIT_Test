package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtility;

public class LoginPage extends BasePage{

    @FindBy (name = "email")
    public WebElement userName;
    @FindBy (name = "password")
    public WebElement password;
    @FindBy (xpath = "//button[contains(text(),'sign in')]")
    public WebElement signIn;
    @FindBy(xpath = "//a[@class='navbar-item']/img")
    public WebElement bookItLogoImage;
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement mapHeader;

    public void logIn(String userName, String passWord){

        this.userName.sendKeys(userName);
        this.password.sendKeys(passWord);
        signIn.click();

    }


}
