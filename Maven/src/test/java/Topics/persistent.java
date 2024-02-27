package Topics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class persistent {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://groww.in/");
		   driver.findElement(By.xpath("//span[contains(text(),'Login/Register')]")).click();
		   WebElement ele=driver.findElement(By.tagName("iframe"));
		   driver.switchTo().frame(ele);
		   Thread.sleep(2000);
	        String win=driver.getWindowHandle();
	        driver.switchTo().window(win);
		   driver.findElement(By.id("gmail_signin_button")).click();   
		   System.out.println(driver.getTitle());
		   Set<String> windows=driver.getWindowHandles();		   
		   Iterator<String> itr=windows.iterator();		   
		   while (itr.hasNext()) {
	            String ChildWindow = itr.next();
	           
	                if (!win.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                System.out.println(driver.getTitle());
	                Thread.sleep(3000);
	                driver.findElement(By.name("identifier")).sendKeys("123@gmail.com");
	          
		  
		   
		   
	                } 
		   }
	}
	

	
	}
	


