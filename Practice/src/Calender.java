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

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		String date="5/05/2022";
		
		String[] s=date.split("/");
		String Date=s[0];
		String Month=s[1];
		String Year=s[2];
		
		String CalYear_Month=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(CalYear_Month);
		
		while(!CalYear_Month.equals(Year))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			Thread.sleep(9000);
			
		}
		
		String CalMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println("afater updating:"+CalMonth);
		
		while(!CalMonth.equals(Month))
		{
			driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'currentCol')]")).click();
		}
		
		 CalMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div[@class='ui-datepicker-title']")).getText();
		 
		 System.out.println("afater updating:"+CalMonth);
		 
		 new WebDriverWait(driver,Duration.ofSeconds(5))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
	WebElement cal= driver.findElement(By.className("ui-datepicker-calendar"));
	
		 List<WebElement> rows=cal.findElements(By.xpath("(//tbody)[2]"));
		 
		 System.out.println(rows.size());
	
	}

}
