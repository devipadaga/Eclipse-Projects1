package Topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class goibiboWebsite {
	
	
	//TO CHECK WHETHER RADIO BUTTON IS ENABLED OR NOT

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://www.goibibo.com/");
		 //System.out.println(driver.findElement(By.xpath("(//div[@class='sc-ezbkAF eSEmhF'])[4]")).isEnabled());
		 Thread.sleep(5000);
		 //System.out.println(driver.findElement(By.xpath("(//P[@class=\"sc-fotOHu jNyPRF fswWidgetTitle\"])[2]")).getText());
		 System.out.println(driver.findElement(By.xpath("//p[@class='sc-dJjYzT bGPvpH']")).getText());
		 driver.findElement(By.xpath("(//div[@class='sc-ezbkAF eSEmhF'])[4]")).click();
		 System.out.println(driver.findElement(By.xpath("(//P[@class=\"sc-fotOHu jNyPRF fswWidgetTitle\"])[2]")).getText());
		 
		 if(driver.findElement(By.xpath("(//P[@class=\"sc-fotOHu jNyPRF fswWidgetTitle\"])[2]")).getText().contains("Sep"))
		 {
			 System.out.println("Enabled");
			 Assert.assertTrue(true, "Return is Enabled");
		 }
		 
		 else
		 {
			Assert.assertTrue(false, "It is not Enabled"); 
		 }
			 
			 	 
		 

		    
		 
		
			 
			 
		 

	}

}
