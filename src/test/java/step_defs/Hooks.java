package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import pages.LoginPage;
import utilities.DriverUtility;
import utilities.ScenarioInfoUtility;
import utilities.UserActionsAndNavigationUtilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

public class Hooks {


    @Before
    public void setupScenario(Scenario scenario){

        System.out.println(System.getProperty("user.dir"));
    }


    @After
    public void screenShot(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverUtility.gD()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", scenario.getName());
        }
        DriverUtility.closeDriver();

    }





}
