package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
	
	
	public static WebDriver LaunchApp(WebDriver driver,String browserName,String appURL) throws InterruptedException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webDriver.chrome.driver","c://chromedriver.exe" );
			driver=new ChromeDriver();
					}
		else if(browserName.equals("Firefox"))
		{
			
		}
		else if(browserName.equals("InternetExplorer"))
		{
			
		}
		
		else
		{
			System.out.println("Doesn't support");
		}
		
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(1000);
		
	
	return driver;
	
	
	}
		
	
	
	public static void CloseApp (WebDriver driver)
	{
		driver.quit();
		
	}
	
	

}
