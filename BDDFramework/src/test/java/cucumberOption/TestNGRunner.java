package cucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
        glue="stepDefinitions",monochrome = true, tags="@SmokeTest and @RegressionTest",
plugin = {"pretty", "html:traget/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
