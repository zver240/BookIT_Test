package parallel.parallelSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverUtility;

public class HooksTestNG {

    @Before
    public void setupScenario(Scenario scenario){

        System.out.println(System.getProperty("user.dir"));
    }


    @After(order = 1)
    public void screenShot(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverUtility.gD()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", scenario.getName());
        }


    }
    @After(order = 2)
    public void tearDown(){
        DriverUtility.closeDriver();
    }
}
