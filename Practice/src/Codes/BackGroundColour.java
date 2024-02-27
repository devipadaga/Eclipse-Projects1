package Codes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.optional.qual.Present;
//import org.apache.poi.ss.usermodel.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class BackGroundColour {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	/*	driver.get("https://www.redbus.com/");
		
		WebElement t=driver.findElement(By.xpath("//div[@class='search-lbl']"));
		
		String BackgroundColour=driver.findElement(By.xpath("//div[@class='search-lbl']"))
				.getCssValue("background-color");
		String color=t.getCssValue("color");
		
		//convert rgba to Hex
	     String c = Color.fromString(color).asHex();

	//	JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	js.executeScript("document.getElementByxpath(\"(//div//a//div//div[@class='imgCont'])[3]").style.backgroundColor = '';");

		System.out.println("colour is :"+color);
		System.out.println("Hex value is "+c);
		System.out.println(BackgroundColour);
		driver.close();
		
	
		
		//practice  1.VERIFY ToolTip USING getAttribute
		
		driver.get("https://www.justdial.com/");
		
		WebElement t=driver.findElement(By.linkText("Free Listing"));
		
		String data=t.getAttribute("title");
		
		System.out.println(data);
		
		if(data.equals("List your business for free"))
		{
			System.out.println("Verified Tooltip");
		}
		
		else
		{
			System.out.println("Not verified");
		}
	
		
		
		//2.verify whether element is present or not using js
		
		driver.get("https://www.justdial.com/");
		WebElement e=driver.findElement(By.xpath("//span[@id='hotkeys_text_0']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementByxpath('//span[@id='hotkeys_text_0']').style.display='e';");
		
		boolean value=e.isDisplayed();
		
		
		if(value)
			System.out.println("Element is Present....");
		
		else
			System.out.println("Element is not Present.........");
			
	*/
		
		
		//Handling frames
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//*[@id=\"iFrame\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@id='current_filter']")).click();
		
		
		
	}

}
