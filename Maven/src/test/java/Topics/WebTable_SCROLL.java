package Topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_SCROLL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://www.irctctourism.com/");
		   driver.findElement(By.cssSelector(".Nav-icons.Package")).click();
		// WebElement OriginTable= driver.findElement(By.cssSelector("//div[@class='left-fliter']//div[3]"));
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		 //  js.executeScript("arguments[0].scrollIntoView(true)", OriginTable);
		   Thread.sleep(4000);
		   //js.executeScript("document.querySelector('//div[@class='left-fliter']//div[3]').scrollTop=200");
		   js.executeScript("document.querySelector('div[class='left-fliter'] div:nth-child(3)')).scrollTop=300");

	}

}
