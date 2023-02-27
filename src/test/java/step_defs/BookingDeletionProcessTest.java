package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_defs.TestBase;
import utilities.*;

public class BookingDeletionProcessTest extends TestBase {

    @When("user goes into my schedule")
    public void user_goes_into_my_schedule() {
        WaitUtility.explicitWaitForVisibility(bookingDeletionPage.scheduleLink);
        KeyboardAndMouseActionsUtility.hoverOver(bookingDeletionPage.scheduleLink);
        WaitUtility.explicitWaitForVisibility(bookingDeletionPage.myLink);
        UserActionsAndNavigationUtilities.click(bookingDeletionPage.myLink);
    }
    @When("user clicks on the schedule listed on the calendar")
    public void user_clicks_on_the_schedule_listed_on_the_calendar() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getSchedulePageProperty("SchedulePage_calendarData_ByXpath")));
        UserActionsAndNavigationUtilities.click(schedulePage.calendarData);
    }
    @When("user clicks on cancel conference")
    public void user_clicks_on_cancel_conference() {
        WaitUtility.explicitWaitForVisibility(schedulePage.cancelButton);
        UserActionsAndNavigationUtilities.click(schedulePage.cancelButton);
    }
    @Then("user verifies that booking is canceled")
    public void user_verifies_that_booking_is_canceled() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getSchedulePageProperty("SchedulePage_cancellationMessage_ByXpath")));
        WaitUtility.explicitWaitForVisibility(schedulePage.cancellationMessage);
        UserActionsAndNavigationUtilities.assertEquals(schedulePage.cancellationMessage.getText(),"conference in half dome has been canceled");
    }


}
