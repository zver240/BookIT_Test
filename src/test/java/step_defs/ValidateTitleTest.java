package step_defs;

import io.cucumber.java.en.Given;
import io.opentelemetry.api.logs.LoggerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.EnvironmentUtility;
import utilities.ScreenshotUtility;
import utilities.UserActionsAndNavigationUtilities;

import java.io.IOException;

public class ValidateTitleTest extends TestBase {

    @Given("user navigates to bookIt application")
    public void userNavigatesToBookItApplication() {
        UserActionsAndNavigationUtilities.navigateTo(EnvironmentUtility.URL);
        UserActionsAndNavigationUtilities.titleAssert("bookit");

        try {
            ScreenshotUtility.takeScreenshot("Screenshot001");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
