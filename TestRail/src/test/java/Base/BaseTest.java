package Base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import com.gurock.testrail.APIException;
import com.testrailManager.TestRailManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {


	public static WebDriver driver;
	protected String testCaseID;


	@Parameters("url")
	@BeforeClass
	public static void setup(String url)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.get(url);

	}

	@AfterClass
	public static void teardown()
	{
		driver.quit();
	}


	@AfterMethod
	public void addResultsToTestRail(ITestResult result) throws MalformedURLException, IOException, APIException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			TestRailManager.addResultsforTestCAse(testCaseID, TestRailManager.TEST_RUN_PASS_STATUS, "");
		}

		else if(result.getStatus()==ITestResult.FAILURE)
		{
			TestRailManager.addResultsforTestCAse(testCaseID, TestRailManager.TEST_RUN_FAIL_STATUS, "Test got Failed "+result.getTestName()+" : Failed");
		}
		
		
	}
}
