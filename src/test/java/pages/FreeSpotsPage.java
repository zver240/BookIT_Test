package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeSpotsPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'free spots')]")
    public WebElement freeSpotsTitle;

    @FindBy(xpath = "//div[@class='columns is-multiline is-centered']/div//div/p[contains(text(),' faith moves mountains ')]/parent::div/following-sibling::footer//button")
    public WebElement bookButton;




}
