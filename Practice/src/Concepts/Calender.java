package Concepts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//button)[4]")).click();
		String date="03/Dec/2022";
		String[] temp=date.split("/");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
		
		String calyear=driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'currentCol')]")).click();
		}
	
	
		String calmonth=driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']")).getText();
		
		while(!calmonth.equals(month))
		{
			driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'currentCol')]")).click();
			
			// below statement update the new month value
			calmonth=driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']")).getText();
		}
		
		
		WebElement cal=driver.findElement(By.className("DayPicker-Month"));
		List<WebElement> rows=cal.findElements(By.className("DayPicker-Week"));
		for(int i=1;i<=rows.size();i++)
		{
			List <WebElement> cols=rows.get(i).findElements((By.className("DayPicker-Day DayPicker-Day--leftEdge DayPicker-Day--disabled DayPicker-Day--outside")));
	
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

}
