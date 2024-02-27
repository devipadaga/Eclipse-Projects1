package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class groupques {

	public static void main(String[] args) {
		
		 System.out.println("STARTING TEST ON CHROME BROWSER");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.name("q")).sendKeys("iphone");
		   
		   driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		   
		 
	/*	   List<WebElement> list=driver.findElements(By.xpath("//ul//li//div//a"));
		
		   
	   System.out.println(list.size());
		   
		   for(int i=0;i<list.size();i++)
		   {
			   if(list.get(i).getText().contains("iphone 13 pro max"));
			   {
				   list.get(i).click();
		   }
		   }
	*/	
		   
		   driver.findElement(By.xpath("//ul//li[1]")).click();

	}

}
