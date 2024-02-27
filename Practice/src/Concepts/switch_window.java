package Concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_window {

	private static CharSequence Banglore;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		String firstwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("View all")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows+" :windows are");
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
			
            if (!firstwindow.equalsIgnoreCase(childwindow)) {		
		//	if(driver.getTitle().equals("Exclusive offers &amp; deals for flights, hotels, activities - Cleartrip"));
		//	{
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//a[@class='hotels']")).click();;
			
           // }
		}
			Thread.sleep(3000);
			driver.switchTo().window(firstwindow);
			driver.findElement(By.xpath("(//input)[4]")).sendKeys("Banglore");
		}
		
		
		
		
	}
		
	}


