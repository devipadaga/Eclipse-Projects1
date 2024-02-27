package aSSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.findElement(By.linkText("Nested Frames")).click();
		
		   System.out.println("No. of Frames in WebPage are : "+driver.findElements(By.tagName("frame")).size());
		   driver.switchTo().frame("frame-top");
		   System.out.println("No. of iFrames in TopFrame are : "+driver.findElements(By.tagName("frame")).size());
		   driver.switchTo().frame("frame-middle");
		   System.out.println(driver.findElement(By.id("content")).getText());
		   

	}

}
