package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class GoogleSearchSteps {
	
	
	WebDriver driver=null;
	

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step:browser is open ");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step:Search Page Opened ");
		
		driver.navigate().to("https://www.google.com/");
		
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step:user enters text ");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SaiBaba images");
		Thread.sleep(2000);
	}

	@And("press enter")
	public void press_enter() throws InterruptedException {

		System.out.println("Inside step:user hits enter ");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}

	@Then("user navigate to search results")
	public void user_navigate_to_search_results() throws InterruptedException {
		System.out.println("Inside step:user move to search results page ");
		driver.getPageSource().contains("Images");
		Thread.sleep(2000);
		driver.close();
	
	}

}
