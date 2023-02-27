package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingDeletionPage extends BasePage{
    @FindBy(xpath = "//a[contains(text(),'schedule')]")
    public WebElement scheduleLink;

    @FindBy(xpath = "//div[@class='navbar-dropdown is-transparent']/a[contains(text(),'my')]")
    public WebElement myLink;


}
