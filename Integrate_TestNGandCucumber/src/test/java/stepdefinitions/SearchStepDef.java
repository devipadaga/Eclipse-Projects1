package stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import variables.ConfigReader;

public class SearchStepDef {

	public static WebDriver driver;
	static String s1;
	static String s2;
	
		@Given("user launches the browser")
		public void user_launches_the_browser() {
			
			if(ConfigReader.prop.getProperty("Browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(options);
			}
			
			else if(ConfigReader.prop.getProperty("Browser").equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}		
		}

		@And("user navigates to amazon website")
		public void user_navigates_to_amazon_website() {
			
			driver.get(ConfigReader.prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}

		@When("user searches {string} and clicks SearchBar")
		public void user_searches_and_clicks_search_bar(String s1) {
			
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']")).sendKeys(s1);
			driver.findElement(By.id("nav-search-submit-button")).click();
		}

		@Then("user navigates to SearchResults")
		public void user_navigates_to_search_results() {
		
			String exp1="Amazon.in : iphone 14",exp2="Amazon.in : apple";
			String t1=driver.getTitle(),t2=driver.getTitle();
			
			if(t1.equalsIgnoreCase(exp1))
			{
			String text=driver.findElement(By.xpath("//span[contains(text(),'iPhone 14. Big and bigger.') and @class='a-truncate-cut']")).getText();
			
			Assert.assertEquals(t1, exp1,"Navigated to iphone results");
			}
			
			else if(t2.equalsIgnoreCase(exp2))
			{
			String  text2=driver.findElement(By.xpath("//a[@data-elementid='sbx-headline']")).getText();
			Assert.assertEquals(t2, exp2,"Navigated to apple results");
			}			
		}
	}

	


