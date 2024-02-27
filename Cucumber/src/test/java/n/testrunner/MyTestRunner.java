package n.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureNaveen/LoginPage.feature",glue= {"stepdefNaveen","AppHooksNaveen"},
monochrome = true,
plugin={"pretty",
"junit:target/JUnitReports/report.xml",
		"json:/target/JSONReports/report.json",
		"html:target/Html/Reports"})


public class MyTestRunner {

}
