package StepsforHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksSteps {
	
	WebDriver driver =null;
/*	
	@Before(value="@smoke",order=1)
	public void BrowserSetup() throws Exception
	{
		System.out.println("......IM INSIDE BROWSER SETUP........");
		System.setProperty("webdriver.chrome.driver", "C:/Users/SPURGE/Downloads/chromedriver_win32 (3)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Before(order=0)
	public void Setup2()
	{
		System.out.println("...IM INSIDE SETUP2.....");
	}

	@After(order=1)
	public void TearDown()
	{
		System.out.println("......IM INSIDE TEAR DOWN...........");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void TearDown2()
	{
		System.out.println("......IM INSIDE TEAR DOWN 2...........");
		
	}
	
	
	
	@BeforeStep
	public static void BeforeSteps()
	{
		System.out.println("...IM INSIDE BEFORE STEPS.....");
	}

	@AfterStep
	public static void AfterSteps()
	{
		System.out.println("...IM INSIDE AFTER STEPS.....");
	}

//	@Given("user is on Login Page")
//	public void user_is_on_login_page() {
//	    
//	}
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//	  
//	
//	}
//	@When("clicks on LoginButton")
//	public void clicks_on_login_button() {
//	    
//	}
//	@Then("user navigates into thE Home Page")
//	public void user_navigates_into_th_e_home_page() {
//	   
//	}
//	
//	
*/


}
