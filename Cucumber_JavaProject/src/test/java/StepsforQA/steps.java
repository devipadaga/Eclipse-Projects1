package StepsforQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class steps {
	public static 
	WebDriver driver=null;
	
	
/*	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	

	
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Navigated to LoginPage");

	
	}
	//@When("^User enters (.*) and (.*)$")
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username); 
		driver.findElement(By.id("txtPassword")).sendKeys(password); 
		driver.findElement(By.id("btnLogin")).click();

	
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		
		if(driver.getPageSource().contains("MarketPlace"))
		{
			System.out.println("HOME PAGE DISPLAYED");
		}
		//Assert.assertTrue(null, false);

	
	}
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();   
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		
		if(driver.getPageSource().contains("LOGIN Panel"))
				{
			System.out.println("LogOut Successfully");
				}
	}
*/

	


}
