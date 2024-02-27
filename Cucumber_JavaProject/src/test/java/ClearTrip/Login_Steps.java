package ClearTrip;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login_Steps 

{
	
//	public static WebDriver driver;
	
/*	
	public void setup()
	{
	
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
	
	}
	*/
/*	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
	

		driver.getPageSource().contains("Search flights");
		System.out.println("USER IS ON HOME PAGE");
	
	
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() throws Exception {
		
		driver.findElement(By.xpath("//button//p[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'hover:bg-secondary-600')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='d-flex flex-middle flex-row flex-center']")).click();
	
	}

	@And("^User enters Email and Password$")
	public void user_enters_email_and_password(io.cucumber.datatable.DataTable dataTable) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email address']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		Thread.sleep(3000);
		
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email address']")).sendKeys(data.get(0).get("Email")); 
	    driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(data.get(0).get("passWord"));
	    
	}

	@And("clicks Login Button")
	public void clicks_login_button() {
		
		driver.findElement(By.xpath("//span[@class='fs-3 fw-550']")).click();
	
	}

	@And("user clicks Not now Button")
	public void user_clicks_not_now_button() {

	
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		
		driver.getPageSource().contains("My account");
		System.out.println("Login success with VALID CREDENTIALS");
		
	}

	@When("User clicks My account")
	public void user_clicks_my_account() {

		driver.findElement(By.xpath("//p[contains(text(),'My account')]")).click();
	}

	@And("clicks Sign out")
	public void clicks_sign_out() {

		driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
	}

	@Then("user come back to Home Page")
	public void user_come_back_to_home_page() {

		driver.getPageSource().contains("Fly anywhere. Fly everywhere");
		System.out.println("LOGOUT SUCCESSFULLY");
	}

	@After
	public void TearDown()
	{
		driver.quit();
	}


}
*/
}