package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunner1 {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(tags = "", features = "src/test/resources/Features/LoginPage.feature", glue = "StepDefinitions",
			monochrome = true,
			dryRun=true,
	                 plugin = {"pretty",
	                		 "junit:target/JUnitReports/report.xml",
	                			"json:/target/JSONReports/report.json",
	                			"html:target/Html/Reports"})
	    
	public class CucumberRunnerTests {
	    
	}

}
