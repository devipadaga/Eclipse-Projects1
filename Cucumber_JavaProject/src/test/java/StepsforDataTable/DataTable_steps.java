package StepsforDataTable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTable_steps {
	
	public static WebDriver driver=null;
	
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
	@When("^User enters Credentials to LogIn$")
	public void user_enters_credentials_to_log_in(DataTable datatable) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		System.out.println("Credentials Entered");          
        List<String> signUpForm = datatable.asList();         
        String userName = signUpForm.get(0);
        String passWord = signUpForm.get(1);          
        driver.findElement(By.name("txtUsername")).sendKeys(userName);
        driver.findElement(By.name("txtPassword")).sendKeys(passWord);       
        driver.findElement(By.id("btnLogin")).submit();
 

		List<Map<String,String>> data = datatable.asMaps(String.class,String.class);
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get("userName")); 
	    driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get("passWord"));
	    driver.findElement(By.id("btnLogin")).click();
	
		
	   List<List<String>> data = datatable.asLists(String.class);
	    Thread.sleep(3000);
	    String userName = data.get(1).get(1);
	    String passWord = data.get(2).get(1);

	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {

		if(driver.getPageSource().contains("MarketPlace"))
		{
			System.out.println("HOME PAGE DISPLAYED");
		}
	}


	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
	   
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		if(driver.getPageSource().contains("LOGIN Panel"))
		{
	System.out.println("LogOut Successfully");
		}

*/	
	}
}
