package drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import Utils.WebEventListener;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	Logger log=Logger.getLogger(BaseClass.class);
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	
	
	public BaseClass()
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("src\\main\\java\\Config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	//Without using properties file
/*
	@BeforeClass()
	@Parameters({"url"})
	public void SetUp(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	//@AfterClass
	public void TearDown()
	{
		driver.close();
	}
*/
	
	
	
	//with using properties file
	
	@BeforeMethod
	
	public void Setup()  
	{
		String browserName=prop.getProperty("browser");
	
		if (browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe" );
		log.info("launching the browser");
		driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\Users\\SPURGE\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\SPURGE\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Incorrect Browser");	
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("launching the URL");
		driver.get(prop.getProperty("url"));
						
}
	
	
	@AfterMethod
	public void TearDown()
	{
		log.info("Closing the browser");
		driver.quit();
	}
}
