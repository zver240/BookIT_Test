package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends BasePage{

    @FindBy(xpath = "//a[@id='room-121']")
    public WebElement kilimanjaroLink;

    @FindBy(xpath = "//h1[contains(text(),'schedule')]")
    public WebElement scheduleText;

    @FindBy(xpath = "//a[contains(text(),'hunt')]")
    public WebElement huntLink;

}
