package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SPURGE\\eclipse-workspace\\E2E_Ecom\\src\\test\\java\\features\\E2E.feature",glue= "stepdef",
dryRun=false,
plugin="json:target\\jsonReports\\CucumberReports.json"
//tags= {"@login" , "@AddProduct"}
)
public class Runner 
{

}
