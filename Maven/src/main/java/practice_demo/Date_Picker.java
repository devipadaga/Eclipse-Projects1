package practice_demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {
	
//	static WebDriver driver;
//	
//	
//	public static void selectDate(String date,String month,String Year)
//	{
//	String MonYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//	System.out.println(MonYear);
//	
//	while(!(getMonthYear(MonYear)[0].equals(month))&&((getMonthYear(MonYear)[1].equals(Year))))
//	{
//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		MonYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//		
//	}
//	
//	driver.findElement(By.xpath("//a[contains(text(),'+ExDate+')]")).click();
//	}
//    
//    
//	
//	public static String[] getMonthYear(String MonYear)
//    {
//		return MonYear.split(" ");
//    	
//    }

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='menu']/ul/li[4]/a"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Testing Site')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'DatePicker')]")).click();
		action.sendKeys(Keys.ENTER).build().perform();
//		driver.navigate().refresh();
		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println(size);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.cssSelector("#datepicker")).click();
        
        String date="19 December 2024";
        String d[]=date.split(" ");
        String dt=d[0];
        String month=d[1];
        String year=d[2];
        
       
       String MonYear=driver.findElement(By.className("ui-datepicker-title")).getText();
       System.out.println(MonYear);
       
       while(!(MonYear.equals(month)) &&(MonYear.equals(year)))
       {
    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    	   MonYear=driver.findElement(By.className("ui-datepicker-title")).getText();
    	   System.out.println("Displayed month is :"+MonYear);    	   
       }
       
       
       
//       if(!MonYear.equalsIgnoreCase(year))
//       {
//    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//    	   MonYear=driver.findElement(By.className("ui-datepicker-title")).getText();
//    	   System.out.println("Displayed year is :"+MonYear);
//    	   
//       }
       
       WebElement cal=driver.findElement(By.className("DayPicker-Month"));
		List<WebElement> rows=cal.findElements(By.tagName("tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List <WebElement> cols=rows.get(i).findElements((By.tagName("td")));
	
			for(int j=0;j<cols.size();j++)
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
	
	


