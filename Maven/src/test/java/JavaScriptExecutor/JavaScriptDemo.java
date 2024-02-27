package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		WebElement Search=driver.findElement(By.xpath("//a[@id='pills-home-tab']"));
		
		//JavaScriptUtil.Flash(Search, driver);
		
		//JavaScriptUtil.drawBorder(Search, driver);
		
	/*	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\SPURGE\\Pictures\\Screenshots\\javaScript.png");
		FileUtils.copyFile(src, trg);
		
		
		JavaScriptUtil.getTitle(driver);
		
		
		WebElement offers=driver.findElement(By.xpath("//a[contains(@class,'nav-link')][normalize-space()='Offers']"));
		JavaScriptUtil.ElementClick(offers, driver);
		
		
		JavaScriptUtil.generateAlert(driver,"Clicked on offers button");
		
		
		JavaScriptUtil.refreshBrowser(driver);
		
		
		
		WebElement element=driver.findElement(By.xpath("//div[@class='bus-services-img']"));
		JavaScriptUtil.ScrollIntoView(driver, element);
		
*/
		JavaScriptUtil.ScrollDown(driver);
		
	}

}
