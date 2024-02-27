package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackGround_Demo/background.feature",glue= {"StepsforBackground"},
monochrome = true,
dryRun=true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"}
		)


public class TestRunner_BackGroundDemo {

}
