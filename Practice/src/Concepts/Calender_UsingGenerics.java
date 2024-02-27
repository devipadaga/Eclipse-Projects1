package Concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender_UsingGenerics {
	
	 static WebDriver driver;
	
	public static String[] getMonthYear(String MonthYearVal)
	{
		return MonthYearVal.split(" ");
	}
	
	public static void SelectDate(String ExDate,String ExMonth,String ExYear)
	{
		if(ExMonth.equals("February")&& Integer.parseInt(ExDate)>29)
				{
			System.out.println("wrong date "+ExMonth+":"+ExDate);
			return;
				}
		
		if(Integer.parseInt(ExDate)>31)
		{
			System.out.println("wrong date "+ExMonth+":"+ExDate);
			return;
		}
		
		String MonthTerVal=driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(MonthTerVal);
		
		while(!(getMonthYear(MonthTerVal)[0].equals(ExMonth))&&(getMonthYear(MonthTerVal)[1].equals(ExYear)))
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				MonthTerVal=driver.findElement(By.className("ui-datepicker-title")).getText();
			}
		
		driver.findElement(By.xpath("(//a[text='"+ExDate+"'])[2]")).click();
		
	}
		
		
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-title")));
			
		SelectDate("32","June","2022");

	}

	
		
		
	}


