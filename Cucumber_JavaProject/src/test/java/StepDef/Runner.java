package StepDef;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.testng.Reporter;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/QA.feature",glue= {"StepsforQA"},
monochrome = true,
plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json",
		 

"junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"}


		)

public class Runner   {
	
	
	

}

