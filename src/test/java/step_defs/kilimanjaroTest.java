package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import step_defs.TestBase;
import utilities.*;

import java.io.IOException;

public class kilimanjaroTest extends TestBase {

    private String title;

    @And("user clicks on kilimanjaro link")
    public void userClicksOnKilimanjaroLink() {
        WaitUtility.explicitWaitForPresenceOfElement(ByClassUtility.useByXpath(ConfigurationReaderUtility.getMapPageProperty("MapPage_kilimanjaroLink_ByXpath")));
        WaitUtility.explicitWaitForVisibility(mapPage.kilimanjaroLink);
        UserActionsAndNavigationUtilities.click(mapPage.kilimanjaroLink);
        title = "schedule";
    }

    @Then("user navigates to schedule kilimanjaro page")
    public void userNavigatesToScheduleKilimanjaroPage() {

        UserActionsAndNavigationUtilities.assertEquals(title,mapPage.scheduleText.getText());
        try {
            ScreenshotUtility.takeScreenshot("Scenario002");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
