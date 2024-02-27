import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nnnnnnnnnnnn {
	
	public static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		selectDate("15", "June", "2022");

	}
	
	public static String[] getMonthYear(String monthYear)
	{
		return monthYear.split(" ");
	}
	
	public static void selectDate(String exDate,String exMonth,String exYear)
	{
		String monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);
		
		while(!getMonthYear(monthYear)[0].equals(exMonth)&& getMonthYear(monthYear)[1].equals(exYear))
		{
			driver.findElement(By.xpath("//*[contains(@data-handler,'next')]")).click();
			monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
			
		}
		
		//div[@class='ui-datepicker-group ui-datepicker-group-last']
	}

}
