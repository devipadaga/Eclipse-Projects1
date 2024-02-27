package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		
		//     ***************8        Mouse Hover ACTIONS  ***********************
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Travel Insurance')]")).click();
	
		WebElement ele=driver.findElement(By.xpath("//div[text()='Hotels']"));
		action.contextClick(ele).perform();
	
		
	/*	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		
		WebElement min_slide=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		System.out.println("Location of the webElement:"+min_slide.getLocation());
		System.out.println("Height and width is:"+min_slide.getSize());
	*/
	
	}
	
	

}
