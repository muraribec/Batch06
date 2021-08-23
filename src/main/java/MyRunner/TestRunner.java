package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\LENOVO PC\\workspace\\BDDFramework\\src\\main\\java\\Features\\login.feature"
		,glue={"stepDefinitions"},
		format = {"html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		tags = {"@murari","~@kumar"},
		dryRun = false,
		strict = true,
		monochrome = true
		)

public class TestRunner {
	

}
