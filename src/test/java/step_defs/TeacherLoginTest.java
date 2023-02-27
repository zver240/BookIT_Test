package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

import java.io.IOException;

public class TeacherLoginTest extends TestBase {


    @When("user logs in")
    public void userLogsIn() {
        loginPage.logIn(EnvironmentUtility.TEACHER_EMAIL,EnvironmentUtility.TEACHER_PASSWORD);
    }

    @Then("user is on bookIt home page")
    public void user_is_on_book_it_home_page() {

        UserActionsAndNavigationUtilities.assertEquals("bookit",DriverUtility.gD().getTitle());
        try {
            ScreenshotUtility.takeScreenshot("Screenshot003");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }



}
