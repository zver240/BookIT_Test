package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{
    @FindBy(xpath = "//h1[contains(text(),'confirmation')]")
    public WebElement confirmationTitle;

    @FindBy(xpath = "//button[contains(text(),'confirm')]")
    public WebElement confirmButton;
}
