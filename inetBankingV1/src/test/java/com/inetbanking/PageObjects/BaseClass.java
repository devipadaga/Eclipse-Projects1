package com.inetbanking.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	public static Properties prop;
	public static WebDriver driver;	
	Logger logger=Logger.getLogger(BaseClass.class);
	
	
	//public String URL=https://demo.guru99.com/v4/index.php;
	public String URL=readconfig.getAppURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String browserName=readconfig.getBrowser();
	
//
//	public BaseClass()
//	{
//		File file=new File("./Configuration/config.properties");
//		try
//		{
//		prop=new Properties();
//		FileInputStream fis=new FileInputStream(file);
//		prop.load(fis);
//		}
//		catch(Exception e)
//		{
//		System.out.println("Exception is :"+e.getMessage());
//		}
//	}
//	
	//@Parameters("browser")
	@BeforeClass
	public void setup()
	{		
		//String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Incorrect Browser");	
		}
		
		logger.info("Browser Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		//logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		logger.info("Closing the browser");
		driver.quit();
	}

}
