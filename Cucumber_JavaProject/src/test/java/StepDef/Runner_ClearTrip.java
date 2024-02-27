package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature_ClearTrip/cleartrip.feature",glue= {"ClearTrip"},
monochrome = true,
dryRun=false,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"}

		)


public class Runner_ClearTrip {

}
