package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.WaitUtility;

public class SchedulePage extends BasePage{

    @FindBy(xpath = "//tbody/tr/td[@rowspan]")
    public WebElement calendarData;

    @FindBy(xpath = "//button[contains(text(),'cancel conference')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[contains(text(),'conference in half dome has been canceled')]")
    public WebElement cancellationMessage;

    @FindBy(xpath = "//table")
    public WebElement table;


}
