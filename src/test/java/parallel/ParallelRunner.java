package parallel;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        plugin = {
                "json:target/reports/cucumberToJSON2.json",//JSON Report
                "html:target/reports/defaultHTMLreport2.html",//HTML Report
                "junit:target/reports/XMLReports2.xml",//XML Report
                "rerun:target/rerunFiles/rerun2.txt",//Rerun DIR
                "timeline:test-output-thread"
        },
        features = "src/test/resources/parallel",
        glue = "parallel/parallelSteps",
        dryRun = false,
        monochrome = false,
        publish = false,
        tags = "@RegressionTestNG"
)

public class ParallelRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
