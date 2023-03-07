package parallel.parallelSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HuntPage;
import step_defs.TestBase;
import utilities.*;

public class LoginAndVerifyTest extends TestBase {

    @Given("user opens Bookit application")
    public void user_opens_bookit_application() {

        UserActionsAndNavigationUtilities.navigateTo(EnvironmentUtility.URL);

    }
    @When("user logs in as a teacher in qa1")
    public void user_logs_in_as_a_teacher_in_qa1() {

        loginPage.logIn(EnvironmentUtility.TEACHER_EMAIL,EnvironmentUtility.TEACHER_PASSWORD);

    }
    @When("user is on Bookit application home page")
    public void user_is_on_bookit_application_home_page() {
        UserActionsAndNavigationUtilities.titleAssert("bookit");
        UserActionsAndNavigationUtilities.assertEquals("bookit",DriverUtility.gD().getTitle());


    }
    @Then("title is {string}")
    public void title_is(String title) {
        WaitUtility.explicitWaitForPresenceOfElement(By.xpath("//*[contains(text(),'schedule')]"));
        UserActionsAndNavigationUtilities.assertEquals(title, DriverUtility.gD().getTitle());
    }

    @And("user clicks on schedule, my")
    public void userClicksOnScheduleMy() {
        WaitUtility.explicitWaitForVisibility(bookingDeletionPage.scheduleLink);
        KeyboardAndMouseActionsUtility.hoverOver(bookingDeletionPage.scheduleLink);

        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getBookingDeletionValueProperty("BookDeletion_MyLink_ByXpath")));
        WaitUtility.explicitWaitForVisibility(bookingDeletionPage.myLink);
        UserActionsAndNavigationUtilities.click(bookingDeletionPage.myLink);
    }

    @Then("user is My on schedule page")
    public void userIsMyOnSchedulePage() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getSchedulePageProperty("SchedulePage_table_ByXpath")));

    }

    @Then("user prints each roomName from map")
    public void userPrintsEachRoomNameFromMap() {
        WaitUtility.explicitWaitForVisibility(mapPage.huntLink);
        boolean roomIsPresent=false;
        if(mapPage.huntLink.isDisplayed()){
            list = UserActionsAndNavigationUtilities.getListOFWebElements(ByClassUtility.useByXpath(ConfigurationReaderUtility.getMapPageProperty("MapPage_map_ByXpath")));

            for(WebElement each:list){
                if(each.getText().contains("microsoft")){
                    roomIsPresent=true;
                }
                System.out.println(roomIsPresent);
                System.out.println(each.getText());
            }
        }


    }
}
