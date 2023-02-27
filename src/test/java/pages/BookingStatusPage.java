package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingStatusPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'yey, you got it')]")
    public WebElement confirmationMessage;
}
