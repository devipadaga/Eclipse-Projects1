package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Demo2_Steps {
	
	public static WebDriver driver=null;
	
	@Given("^I've a valid set of data and access$")
	public void ValidUserCheck() throws Exception
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://demo.guru99.com/test/newtours/");
		
	}
	
	@When("Registration Page Display")
	public void registration_page_display() throws Exception {
		
		//WebDriver driver = null;
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER"))).click();
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].setAttribute('target','_self');",register);
		register.click();
		
	
	}

	@Then("Enter valid data")
	public void enter_valid_data(DataTable UserDetails) {
	    
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	
	}

	@Then("click on submit")
	public void click_on_submit() {
	    
		driver.findElement(By.name("submit")).click();
	
	}

	@Then("Click Signoff")
	public void click_signoff() {
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	
	}

	@And("Close")
	public void close() {


			driver.close();
			driver.quit();
		
}


}
