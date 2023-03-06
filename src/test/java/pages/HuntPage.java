package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HuntPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'hunt for spot')]")
    public WebElement huntForSpotHeader;

    @FindBy(xpath = "//input[contains(@id,'mat-input')]")
    public WebElement dateInput;

    @FindBy (xpath = "//tbody[@class='mat-calendar-body']")
    public WebElement datesTable;

    @FindBy(xpath = "//div[contains(text(),'25')]")
    public WebElement HundPage_datesTable_ByXpath;

    @FindBy(xpath = "//span[contains(text(),'8:30am')]/parent::mat-option/span")
    public WebElement fromTimeInput;

    @FindBy(xpath = "//mat-select[@aria-label='from']")
    public WebElement fromSelectionTime;

    @FindBy(xpath = "//mat-option[@id='mat-option-31']")
    public WebElement toSelectionTime;

    @FindBy(xpath = "//mat-select[contains(@id,'mat-select-')][@placeholder='to']")
    public WebElement toInputTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchIconButton;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement calendarButton;


}
