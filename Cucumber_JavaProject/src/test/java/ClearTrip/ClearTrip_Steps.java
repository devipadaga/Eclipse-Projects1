package ClearTrip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class ClearTrip_Steps {

	
		public static WebDriver driver;

	@Given("user browse to cleartrip")
	public void user_browse_to_cleartrip() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
	
	}
	@And("user is on search results")
	public void user_is_on_search_results() {
		
		if(driver.getPageSource().contains("Search flights"))
		{
			System.out.println("Page Opened");
		}
	
	}
	@And("Select country as India")
	public void select_country_as_india() throws Exception {
		
		
		
		driver.findElement(By.xpath("(//div[@class='p-relative mr-4'])[2]")).click();
		//div[contains(@class,'p-relative mr-4')])[2]")
		//html/body/div[1]/div/div/header/div/div/div/div/div/div[2]/div[2]/div/button
		//(//button)[2]
		//(//div[@class='p-relative mr-4'])[2]


		
		Thread.sleep(2000);
		List<WebElement> countryList=driver.findElement(By.xpath("//div[contains(@class,'bg-white br-4 elevation-5 p-1 p-absolute')]")).findElements(By.tagName("li"));
		System.out.println(countryList.size());
		
		for(int i=0;i<countryList.size();i++)
		{
			try {
				Thread.sleep(2000);
				if(countryList.get(i).getText().contains("India"))
				{
				//	if(!countryList.get(i).isSelected())
				//	{
						countryList.get(i).click();
						break;
				//	}
				}
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		Thread.sleep(2000);
		
	}
	@When("user clicks one way radio button")
	public void user_clicks_one_way_radio_button() {
		
	//	driver.navigate().refresh();
		
		WebDriverWait wait= new WebDriverWait(driver,30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[1]//div[1]")));
		
		
		WebElement radiobutton=driver.findElement(By.xpath("//label[1]//div[1]"));
		
			if(!radiobutton.isSelected())
			{
				radiobutton.click();
			}
			
	}
	@And("Selects from station and To Station")  


	public void selects_from_station_and_to_station() throws Exception {

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad");
		//(//input[contains(@placeholder,'Any worldwide city or airport')])[1]
		Thread.sleep(2000);
		List<WebElement> FromList=driver.findElements(By.xpath("//div[contains(@class,'br-4 elevation')]//ul//li//p"))/*.findElements(By.xpath("//ul//li//p"))*/;
		
		System.out.println(FromList.size());
	
	//	FromList.get(1).click();
		
		for(int i=0;i<FromList.size();i++)
		{
			if(FromList.get(i).getText().contains("Rajiv Gandhi International"));
			{
				FromList.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Any worldwide city or airport')])[2]")).sendKeys("Visakhapatnam");
		
		List<WebElement> ToList=driver.findElements(By.xpath("//div[contains(@class,'br-4 elevation')]//ul//li//p"))/*.findElements(By.xpath("//ul//li//p"))*/;
	
		System.out.println(ToList.size());
		
		for(int j=0;j<ToList.size();j++)
		{
			if(ToList.get(j).getText().contains("Vishakhapatnam (VTZ)"));
			{
				ToList.get(j).click();
				break;
			}
		}
		
	
	}
	@And("select Daparture Date")
	public void select_daparture_date() throws Exception {
		
		driver.findElement(By.xpath("(//button)[4]")).click();
		String date="03/March/2023";
		String[] temp=date.split("/");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
		
		String calyear=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']")).getText();
		String calmonth=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']")).getText();
		
		while(!(calyear.equals(year))&&!(calmonth.equals(month)))
		{
			//driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'currentCol')]")).click();
			driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']")).click();
		}
	
/*		Thread.sleep(3000);
	//	String calmonth=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']")).getText();
		Thread.sleep(2000);
		System.out.println(calmonth);
	//	System.out.println(calyear);
		
		while(!calmonth.equals(month))
		{
			driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']")).click();
			
			// below statement update the new month value
			
		}
	*/	
		calyear=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']")).getText();
		calmonth=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']")).getText();
		
		
		WebElement cal=driver.findElement(By.xpath("//div[@class='DayPicker-Body']"));
		List<WebElement> rows=cal.findElements(By.xpath("//div[@class='DayPicker-Week']"));
		System.out.println("rows are :"+rows.size());
		for(int i=1;i<=rows.size();i++)
		{
			List <WebElement> cols=rows.get(i).findElements((By.xpath("//div[@class='DayPicker-Day DayPicker-Day--leftEdge DayPicker-Day--outside']")));
			
			System.out.println("cols are :"+cols.size());
			for(int j=0;j<=cols.size();j++)
			{
				
				if(cols.get(j).getText().equals(dt))
				{
					cols.get(j).click();
					break;
					
				}
				}
			}
		


	
	}
	@And("Selects No of adults and children")
	public void selects_no_of_adults_and_children() {
		
		Select select=new Select(driver.findElement(By.xpath("(//div//select[@class='default-select bc-neutral-100 bg-transparent h-8 br-4 pl-2 p-relative zIndex-5'])[1]")));
		select.selectByValue("2");
		

	
	}
	@And("clicks on Search flights")
	public void clicks_on_search_flights() {
		
		driver.findElement(By.xpath("//button[normalize-space()='Search flights']")).click();

	
	}
	@Then("user gets list of Available Flights")
	public void user_gets_list_of_available_flights() {

	
	}
	@And("user choose the appropriate airline within budget {int}")
	public void user_choose_the_appropriate_airline_within_budget(Integer int1) {

	
	}



	
	

}
