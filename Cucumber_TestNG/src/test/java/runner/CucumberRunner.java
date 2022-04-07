package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        features = {"src/test/resources/scenarios"},
        glue = {"steps"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
