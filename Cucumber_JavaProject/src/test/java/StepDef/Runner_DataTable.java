package StepDef;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/DataTable.feature",glue= {"StepsforDataTable"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"}


		)

public class Runner_DataTable extends AbstractTestNGCucumberTests  {
	
	

}

