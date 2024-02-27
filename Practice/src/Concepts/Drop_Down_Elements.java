package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Elements {

	 static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[starts-with(@id,\"u_0_2\")]")).click();
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(14);
		
		WebElement melement=driver.findElement(By.id("month"));
		Select month=new Select(melement);
		month.selectByValue("5");
		
		// to print all the options in the year
		
		WebElement YearElement=driver.findElement(By.id("year"));
		Select year=new Select(YearElement);
		List<WebElement> ylist =year.getOptions();
		System.out.println(ylist.size());
		
		for(int i=0;i<ylist.size();i++)
		{
			System.out.println(ylist.get(i).getText());
			year.selectByValue("1988");
		}
		
		
		/////////want to select required item//////////////
		
		Select category= new Select(driver.findElement(By.id("month")));
		List<WebElement> catlist=category.getOptions();
		
		String itemtobecheck="May";
		boolean isitempresent=false;
		
		for(int i=0;i<catlist.size();i++)
		{
			String item=catlist.get(i).getText();
			
			if(item.equalsIgnoreCase(itemtobecheck))
			{
				isitempresent=true;
				break;
			}
			
		}
		
		if(isitempresent)
		{
			System.out.println(itemtobecheck+"element present");
		}
		else {System.out.println(itemtobecheck+"element present");
}
		
		
		////////////////////////////////////RADIO BUTTON//////////////////////
		
		WebElement radio=driver.findElement(By.xpath("//*[contains(@class='radio_circle')]"));		
		
		if(!radio.isSelected())
		{
			radio.click();
		}
		//radio.click();
	}
}
		
		
		
		
	


