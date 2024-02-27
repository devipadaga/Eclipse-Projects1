package Codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	/*	
		//1.UPTO Pixels
		
		js.executeScript("window.scrollBy(0,1000)");
		
		//2.upto Element
		
		WebElement element=driver.findElement(By.xpath("(//span[@class='a-truncate'])[4]"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
*/
		
		//3.UPTO BOTTOM OF THE PAGE
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
	}

}
