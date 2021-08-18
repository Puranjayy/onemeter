package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefinitions"}, plugin= {"pretty","html:target/Reports/HTMLReports"},monochrome=true)
public class TestRunner {

}
