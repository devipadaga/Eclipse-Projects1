package AppHooksNaveen;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;
import n.factory.DriverFactory;
import n.util.ConfigReader;

public class Hooks {
	
	private DriverFactory DF;
	private WebDriver driver;
	private ConfigReader CR;
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty()
	{
		CR=new ConfigReader();
		prop=CR.init_prop();
	}
	
	@Before(order=1)
	public void LaunchBrowser()
	{
		String browserName=prop.getProperty("browser");
		DF=new DriverFactory();
		driver=DF.init_driver(browserName);
	}


	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void TearDown(Scenario sc)
	{
		if(sc.isFailed())
		{
			// take screenshot:
			String ScreenShotName=sc.getName().replaceAll(" ", "_");
			byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			sc.attach(sourcePath, "image/png", ScreenShotName);
		}
	}
	
}
