package EcommerceAPP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://rahulshettyacademy.com/client");
		   
		   //*****************BELOW CODE FOR REGISTER*************************************************
		   
		   
//		   driver.findElement(By.linkText("Register")).click();
//		   
//		   driver.findElement(By.id("firstName")).sendKeys("Tirumala");
//		   driver.findElement(By.id("lastName")).sendKeys("Kadiyam");
//		   driver.findElement(By.id("userEmail")).sendKeys("1234@gmail.com");
//		   driver.findElement(By.id("userMobile")).sendKeys("9876543210");
//		   WebElement drpdown=driver.findElement(By.xpath("//select[@class='custom-select ng-untouched ng-pristine ng-valid']"));
//		  Select select=new Select(drpdown);
//		  select.selectByVisibleText("Engineer");
//		  driver.findElement(By.xpath("//input[(@value='Female')]")).click();
//		  driver.findElement(By.id("userPassword")).sendKeys("Saibaba1@");
//		  driver.findElement(By.id("confirmPassword")).sendKeys("Saibaba1@");
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//input[@type='submit']")).click();
//		  
		  
		  driver.findElement(By.id("userEmail")).sendKeys("Tirumala@gmail.com");
		  driver.findElement(By.id("userPassword")).sendKeys("Saibaba1@");
		  driver.findElement(By.id("login")).click();
		  
		  WebElement women=driver.findElement(By.xpath("//div[@class='py-2 ml-3']/div/label[contains(text(),'women')]"));
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;		
		  js.executeScript("arguments[0].scrollIntoView();",women);
		  
		  //new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(women)).click();
		
		  js.executeScript("arguments[0].click();",women);
		  
		   
		 List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted\"]//b"));
		
		 System.out.println(list.size());
		 

			Map<String, Integer> mylist = new HashMap<String, Integer>();
			mylist.put("ZARA COAT 3", 1);
			mylist.put("IPHONE 13 PRO", 1);
			

		 
		 for(int i=0;i<list.size();i++)
		 {
			 String s=list.get(i).getText();
			 System.out.println(s);
			 if(mylist.containsKey(s))
			 {
				 for(int j=0;j<mylist.get(s);j++)
				 {
					 WebElement e=driver.findElement(By.cssSelector(".card-body button:last-of-type"));
					 e.click();
					 System.out.println("Done add to cart");
					 Thread.sleep(5000);
				 }
			 }
			 
			 
		 }
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 driver.findElement(By.xpath("//ul/li[4]/button")).click();

		   
		   
		   
		   
	}

}
