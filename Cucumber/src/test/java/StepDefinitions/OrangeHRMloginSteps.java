package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class OrangeHRMloginSteps {
//	WebDriver driver=null;
//
//	@Given("browser is open and enters url")
//	public void browser_is_open_and_enters_url() {
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("Project Path is:"+projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user  on login page")
//	public void user_on_login_page() {
//	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//	}
//
//	@When("^enters (.*) and (.*)$")
//	public void enters_username_and_password(String username,String password) throws InterruptedException {
//	    driver.findElement(By.id("txtUsername")).sendKeys(username);	
//	    driver.findElement(By.id("txtPassword")).sendKeys(password);	
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.id("btnLogin")).click();	
//	    }
//
//	@Then("user is on homepage")
//	public void user_is_on_homepage() throws InterruptedException {
//		driver.getPageSource().contains("Assign Leave");
//		Thread.sleep(2000);
//		driver.close();
//	    
//	}
//
}
