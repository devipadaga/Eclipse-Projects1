package Topics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.travelkhana.com/travelkhana/indian-railways-time-table");
		
		WebElement trainnum=driver.findElement(By.xpath("(//input)[1]"));
		trainnum.sendKeys("1271");
		
		List<WebElement> list=driver.findElement(By.className("ac_results")).findElements(By.tagName("li"));	
		list.get(8).click();
		
		driver.findElement(By.id("stnfromm")).sendKeys("ELR");
		driver.findElement(By.id("stntoo")).sendKeys("VSKP");
		
	/*	String year="2023";
		String month="May";
		String date="15";
		driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		
		while(true) {
		String monthYear =driver.findElement(By.className("datepicker-switch")).getText();
		
		String arr[]=monthYear.split(" ");
		String month1=arr[0];
		String year1=arr[1];
		
		if(month1.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) 
			break;
		
		else 
		
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
		
			//String monthyear=driver.findElement(By.xpath("//th[normalize-space()='March 2022']")).getText();
		}
		
	
		List<WebElement> days=driver.findElements(By.xpath("//div[@class='datepicker-days']//table[@class='table-condensed']"));
				days.get(0);
				
				for(WebElement day:days)
				{
					String s=day.getText();
					
					if(s.equals(date))
					{
						s.click();
						break;
					}
				}
		*/
	
		//***********************"DATE PICKER USING GENERICS*****************************************************
		
		
		driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		Thread.sleep(2000);
		
		
		selectDate("15", "May", "2024");
	
	}
	
	

	public static String[] getMonthYear(String monthYear) {
		return monthYear.split(" ");
		
	}
	
	public static void selectDate(String exDate, String exMonth, String exYear)
	{
		if(exMonth.equals("February") && Integer.parseInt(exDate)>29)
				{
			System.out.println("wrong date  :"+exMonth+" : "+exDate);
			return;
				}
		
		if(Integer.parseInt(exDate)>31)
		{
			System.out.println("wrong date  :"+exMonth+" : "+exDate);
			return;
		}
	
		String monthYear =driver.findElement(By.className("datepicker-switch")).getText();
		System.out.println(monthYear);
		
		while(!(getMonthYear(monthYear)[0].equals(exMonth) && getMonthYear(monthYear)[1].equals(exYear)))
				
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
			monthYear =driver.findElement(By.className("datepicker-switch")).getText();
		}
		
		//driver.findElement(By.xpath("//td[normalize-space()='"+exDate+"']")).click(); 
		
		    // above-it is for specific date selection(not recommended)
		
		
		WebElement cal = driver.findElement(By.className("table-condensed"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		for(int  i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(exDate))
				{
					cols.get(j).click();
					break;
				}	
			}
		}
	}
	

}
