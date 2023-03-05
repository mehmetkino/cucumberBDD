package code.runner;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // this is the path for feature files //path from content root
        glue = "code/stepDefinitons",//this is path for steps // path from source root
        tags= "@TESTCASE1",
        dryRun = false,
        plugin = {
                "pretty", // this is to have more understandable console logs.
                "rerun:target/rerun.txt",// this will help us to store failed scenarios in rerun.t
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"}



)

public class TestRunner {

}
