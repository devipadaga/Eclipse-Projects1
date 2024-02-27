package Topics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RELATIVE_LOCATORS_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://www.snapchat.com/");
		   driver.findElement(By.xpath("//aside//p[contains(text(),'Log in to chat')]")).click();
		   
		   String parentWindow=driver.getWindowHandle();
		   
		   Set<String> allWindows=driver.getWindowHandles();
		   
		   Iterator<String>itr=allWindows.iterator();
		   while(itr.hasNext())
		   {
			   String child=itr.next();
			   if(!parentWindow.equals(child))
			   {
				   driver.switchTo().window(child);
			   }
		   }
		   WebElement uname=driver.findElement(By.id("username"));
		   
		   //above
		  String name= driver.findElement(with(By.tagName("label")).above(uname)).getText();
		  System.out.println(name);
		  
		  //below
		  String name2= driver.findElement(with(By.tagName("label")).below(uname)).getText();
		  System.out.println(name2);
		  
		  
		  WebElement text=driver.findElement(By.id("password"));
		  String name3=driver.findElement(with(By.tagName("a")).below(text)).getText();
		  System.out.println(name3);
		  
		  //toLeftOf
		  driver.findElement(By.xpath("//a[text()='Sign Up']")).click();    //clicking on SignUp
		  WebElement phneNum=driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		  String sendLinkLabel=driver.findElement(with(By.tagName("button")).toLeftOf(phneNum)).getText();
		  System.out.println(sendLinkLabel);
		  
	}

	

}
