import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//What is log? : capturing info/activities at the time of program execution. 
// types of logs:
	//1. info
	//2. warn
	//3. debug
	//4. fatal

//how to generate the logs? :   use Apache log4j API (log4j jar)
//How it works? :   it reads log 4j configuration from log4j.properties file
//where to create:   create inside resources folder


	public class LoginTest {
	
		WebDriver driver;

		Logger log=Logger.getLogger(LoginTest.class);
	
	@BeforeMethod
	public void SetUp()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver=new ChromeDriver();
	log.info("LAUNCHING CHROME BROWSER");
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	
	
	log.info("ENTERING APP URL");
	log.warn("this is warning msg");
	log.fatal("this is fatal");
	log.debug("this is debug");
	}

		
		
		@Test(priority=1,groups="logo")
		public void GoogleLogoTest()
		{
			log.info("*******************starting test case********************88");
			 boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
			 System.out.println(logo);
			 Assert.assertTrue(logo);
			 // above or below command can write
			 Assert.assertEquals(logo, true);
			 
				log.info("*******************ending test case********************88");

		}
		

		@Test(priority=2,groups="link")
		public void GoogleLinkTest()
		{
			log.info("*******************starting test case********************88");

			 boolean link=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).isDisplayed();
			 System.out.println(link);
			 
				log.info("*******************ending test case********************88");

		}
		

		@AfterMethod
		public void TearDown()
		{
			driver.quit();
		}
		
		


}
