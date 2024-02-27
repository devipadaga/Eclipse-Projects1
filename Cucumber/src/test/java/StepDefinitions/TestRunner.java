package StepDefinitions;

import org.junit.runner.RunWith;
//import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\SDSD.feature",glue= {"testngTOcucumbertestcase.java"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"}

		)

public class TestRunner {

	
}

