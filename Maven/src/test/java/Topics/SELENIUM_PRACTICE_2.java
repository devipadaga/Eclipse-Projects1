package Topics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SELENIUM_PRACTICE_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://www.goibibo.com/");
		   driver.findElement(By.xpath("(//div//p[normalize-space()='Enter city or airport'])[1]")).click();
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("H");
		   List<WebElement> fromList=driver.findElement(By.xpath("//ul[@id='autoSuggest-list']")).findElements(By.tagName("li"));
		   System.out.println(fromList.size());
		   for(int i=0;i<fromList.size();i++)
			{
				if(fromList.get(i).getText().contains("Rajiv Gandhi International Airport"))
				{
					fromList.get(i).click();
					break;
				}
				
			}
		   Thread.sleep(2000);
		   
			//driver.findElement(By.xpath("//div[@class='sc-bYoBSM elpDYd']")).click();
//									//(OR)
		 //*******no need to write below line.bcoz automatically clicking by th ebsite after entering from address  
//			WebElement to=driver.findElement(By.xpath("//div[@class='sc-bYoBSM elpDYd']//p[@class='sc-bBHxTw hqJqrJ fswWidgetPlaceholder']"));
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeAsyncScript("arguments[0].click();", to);
//			
			
		  // driver.findElement(By.xpath("//div[@class='sc-jJoQJp echhfS']/input[@type='text']")).sendKeys("B");
		   							//(OR)
		   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("B");
		   
			Thread.sleep(2000);
			
			
		  List<WebElement> ToList=driver.findElement(By.xpath("//ul[@id='autoSuggest-list']")).findElements(By.tagName("li"));
		  System.out.println(ToList.size());
		  for(int i=0;i<ToList.size();i++)
		  {
		
	//*************getting stale element exception thats y wrote code in try-catch block
			  
			  try
			  {
			  if(ToList.get(i).getText().contains("Bengaluru International Airport"))
			  {
				  ToList.get(i).click();
			  }
			  }
			  
		  
			  catch(StaleElementReferenceException e)
			  {
				  System.out.println(e);
			  }
			  
			  
			  
		  }
		  Thread.sleep(2000);
		  
		  
			//*******no need to write below line.bcoz automatically clicking by th ebsite after entering destinity
			    // driver.findElement(By.xpath("//span[@class=\"sc-ieecCq gToiRQ fswDownArrow\"]")).click();
			 
		  
		  String month="December 2022";
		  String exp_Date="19";
		  
		  while(true)
		  {
		  String text=driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
		  System.out.println(text);
		  
		  if(text.equalsIgnoreCase(month))
		  {
			  break;
		  }
		  
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		  }
		  }
		  
		  List<WebElement> dates=driver.findElements(By.xpath("//div[@role='row']"));
		 System.out.println(dates.size());
		  
		  for(int i=0;i<dates.size();i++)
		  {
			  String date_text=dates.get(i).getText();
				 String date[]=date_text.split("\n");
				 System.out.println(date[0]+" :"+date[1]);
				 
				 if(date[0].equals(exp_Date))
				 {
					 dates.get(i).click();
					 Thread.sleep(2000);
					 break;
				 }
		  }
		  
		 String verify_Date=driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).getText();
		 Assert.assertEquals(verify_Date, "19 Dec'22", "Perfect Date for Destination");
		  
		  driver.findElement(By.xpath("//span[normalize-space()='Done']")).click();
		  
		  // driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).click();
		  
		   //System.out.println(driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).getText()); 
		   int i=1;
		  while(i<5)
		  {
			  driver.findElement(By.xpath("(//span[@class='sc-ehCJOs kujlZU'])[2]")).click();
		  i++;
		  }
		  driver.findElement(By.xpath("//a[@class='sc-eLwHnm hHxEGr']")).click();
		  System.out.println(driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).getText()); 

  
		  
		  
		  
		  
		//div[@class='DayPicker-Month']/div[3]/div
		 // document.querySelector("div[aria-label='Fri Sep 09 2022']") 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
			
		 
		
			
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //*********************************01**************************************************8
			
			//THIS CODE IS FOR NO .OF ADULTS SELECTION IN ANY FLIGHT RESERVATION
		  
		  
//		   driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).click();
		  
//		   //System.out.println(driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).getText()); 
//		   int i=1;
//		  while(i<5)
//		  {
//			  driver.findElement(By.xpath("(//span[@class='sc-ehCJOs kujlZU'])[2]")).click();
//		  i++;
//		  }
//		  driver.findElement(By.xpath("//a[@class='sc-eLwHnm hHxEGr']")).click();
//		  System.out.println(driver.findElement(By.xpath("//div[@class='sc-ezbkAF dDYAou']")).getText()); 
//
//		  
			//**********************************01**************************************************
		  
		  
		  //*************************************02*************************************************
		  
		  		//DIFF KINDS OF WAITS
		  
			 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class=\\\"sc-ieecCq gToiRQ fswDownArrow\\\"]")));
			  
			 
//			  new WebDriverWait(driver,Duration.ofSeconds(5))
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\\\"sc-ieecCq gToiRQ fswDownArrow\\\"]"))).click();


//			new WebDriverWait(driver,Duration.ofSeconds(5))
//			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("DayPicker-Caption")));
//			
		  
		  
		  //***************************************02**********************************************
	}
	
	
	
	}
  


