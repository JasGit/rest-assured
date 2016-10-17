package test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jaspreetwalia on 17/10/2016.
 */

@RunWith(Cucumber.class)

@CucumberOptions(  monochrome = true,
        features = "src/test/resources/features/",
        glue = "step_definations" )


public class TestRunnerClass {
}
