package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/reports/cucumberToJSON.json",//JSON Report
                "html:target/reports/defaultHTMLreport.html",//HTML Report
                "junit:target/reports/XMLReports.xml",//XML Report
                "rerun:target/rerunFiles/rerun.txt"//Rerun DIR
                 },
        features = "src/test/resources/features",
        glue = "step_defs",
        dryRun = false,
        monochrome = false,
        publish = false,
        tags = ""

)

public class MainRunner {


}
