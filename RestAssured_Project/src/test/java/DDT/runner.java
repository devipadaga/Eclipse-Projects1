package DDT;

//import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\DDT\\ddt.feature",glue={"stepdef"},
dryRun=false,monochrome=true,
plugin="json:target\\jsonReports\\CucumberReports.json"
//tags= "@SingleCol"
)


public class runner extends AbstractTestNGCucumberTests{
	
}

























//@SingleCol
//Scenario: Get status of pets using single col
//Given user enters into the page with payload
//When user checks the status
//Then user should get the response and status code should be 200
//
// | available |
// | sold      |
// | pending   |