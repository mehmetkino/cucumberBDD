package code.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // this is the path for feature files //path from content root
        glue = "code/stepDefinitons",//this is path for steps // path from source root
        tags= "@dryRunTest", //without tags it will run everything that is present under feature file.When you put tags
                        //it will only runs the tagged ones
        dryRun =true //whn it is true it will check for undefinded steps, so it will give you snippets for undefined steps


)

public class TestRunner {

}
