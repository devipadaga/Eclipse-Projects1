package testRunner;

import org.testng.annotations.*;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import variables.ConfigReader;


@CucumberOptions(
		features = "src\\test\\java\\FeatureFiles\\search.feature",glue= {"stepdefinitions"},
		monochrome = true,
//		tags= {"@tag1,@tag2"},
		plugin={"pretty",
				"junit:target/JUnitReports/report.xml",
						"json:/target/JSONReports/report.json",
						"html:target/Html/Reports"})

public class runner2 {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass() throws Exception
	{
		testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider="scenarios")
	public void scenario(PickleWrapper pickle,FeatureWrapper cucumberfeature)
	{
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}
	
	
	@DataProvider
	public Object[][] scenarios()
	{
		return testNGCucumberRunner.provideScenarios();
	}
	
	
	@AfterClass(alwaysRun=true)
	public void tearDownClass() throws Exception
	{
		testNGCucumberRunner.finish();
	}

}
