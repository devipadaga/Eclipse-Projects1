package testRunner;



//import org.junit.runner.RunWith;
import org.testng.annotations.*;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import variables.ConfigReader;




@CucumberOptions(
		features = "src\\test\\java\\FeatureFiles\\search.feature",glue= {"stepdefinitions"},
		monochrome = true,
		plugin={"pretty",
				"junit:target/JUnitReports/report.xml",
						"json:/target/JSONReports/report.json",
						"html:target/Html/Reports"})
		

public class Runner extends AbstractTestNGCucumberTests{
	
	
	@BeforeClass
	public static void beforeClass()
	{
		ConfigReader.initializePropertyFile();
	}
	
	
	
	@AfterClass
	public static void afterClass()
	{
		
	}
	
	
//	
//	Define your use cases/scenarios with Cucumber (languageformat for cucumber is gherkin - which is almost plain english)
//	Build code for each step with selenium (webdriver). this allows you to direct your browser to perform each job of the testcases
//	Run using TestNG configurations
//	
//	
	
	
	
	
	
	
	
	
	
	
	/*
	 * private TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass() public void setUpClass() throws Exception {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @Test(dataProvider="features") public void my_test(CucumberFeatureWrapper
	 * cucumberFeature) {
	 * testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature()); }
	 * 
	 * 
	 * @DataProvider public Object[][] features() { return
	 * testNGCucumberRunner.provideFeatures(); }
	 */

}
