package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_defs.TestBase;
import utilities.*;

import java.util.List;

public class ScheduleTimeTest extends TestBase {
    @When("user click on hunt")
    public void user_click_on_hunt() {
        WaitUtility.explicitWaitForPresenceOfElement(By.xpath("//a[contains(text(),'hunt')]"));
        mapPage.huntLink.click();
        UserActionsAndNavigationUtilities.assertEquals(huntPage.huntForSpotHeader.getText(),"hunt for spot");
    }

    @When("user sets the time and date")
    public void user_sets_the_time_and_date() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getHuntPageProperty("HuntPage_CalendarButton_ByXpath")));
        UserActionsAndNavigationUtilities.click(huntPage.calendarButton);

        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getHuntPageProperty("HundPage_datesTableAll_ByXpath")));
        WaitUtility.explicitWaitForVisibility(huntPage.datesTable);
        WaitUtility.explicitWaitForElementToBeClickable(huntPage.datesTable);

        list = UserActionsAndNavigationUtilities.getListOFWebElements(ByClassUtility.useByXpath(ConfigurationReaderUtility.getHuntPageProperty("HundPage_datesTable_ByXpath")));
        for(WebElement each:list){
            if(each.isDisplayed()&&each.isEnabled()){
                WaitUtility.explicitWaitForVisibility(each);
                WaitUtility.explicitWaitForElementToBeClickable(each);
                UserActionsAndNavigationUtilities.click(each);
            }
        }

        WaitUtility.explicitWaitForVisibility(huntPage.fromSelectionTime);
        UserActionsAndNavigationUtilities.click(huntPage.fromSelectionTime);

        WaitUtility.explicitWaitForVisibility(huntPage.fromTimeInput);
        UserActionsAndNavigationUtilities.click(huntPage.fromTimeInput);

        WaitUtility.explicitWaitForVisibility(huntPage.toInputTime);
        UserActionsAndNavigationUtilities.click(huntPage.toInputTime);

        WaitUtility.explicitWaitForVisibility(huntPage.toSelectionTime);
        UserActionsAndNavigationUtilities.click(huntPage.toSelectionTime);

    }

    @When("user clicks on search")
    public void user_clicks_on_search() {
        UserActionsAndNavigationUtilities.click(huntPage.searchIconButton);
    }

    @When("user navigates to free spot page")
    public void user_navigates_to_free_spot_page() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getFreeSpotProperty("FreeSpotPage_freeSpotsTile_ByXpath")));
        UserActionsAndNavigationUtilities.assertEquals("free spots",freeSpotsPage.freeSpotsTitle.getText());

    }

    @When("user books time")
    public void user_books_time() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getFreeSpotProperty("FreeSpotPage_bookButton_ByXpath")));
        WaitUtility.explicitWaitForVisibility(freeSpotsPage.bookButton);
        UserActionsAndNavigationUtilities.click(freeSpotsPage.bookButton);
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getConfirmationProperty("ConfirmationPage_confirmationTile_ByXpath")));
        UserActionsAndNavigationUtilities.assertEquals("confirmation", confirmationPage.confirmationTitle.getText());
    }

    @When("user clicks on confirm button")
    public void user_clicks_on_confirm_button() {
        WaitUtility.explicitWaitForElementToBeClickable(confirmationPage.confirmButton);
        UserActionsAndNavigationUtilities.click(confirmationPage.confirmButton);
    }

    @Then("confirmation message is displayed")
    public void confirmation_message_is_displayed() {
        WaitUtility.explicitWaitForVisibility(bookingStatusPage.confirmationMessage);
        UserActionsAndNavigationUtilities.assertEquals("yey, you got it",bookingStatusPage.confirmationMessage.getText());
    }
}
