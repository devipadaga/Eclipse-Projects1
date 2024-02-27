package JavaScriptExecutor;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	WebDriver driver;
	
	
	//Flashing	
/*	public static void Flash(WebElement element,WebDriver driver)
	{
		String bgcolor=element.getCssValue("backgroundColor");
		
		for(int i=0;i<500;i++)
		{
		ChangeColor("#FFFF00", element, driver);
		ChangeColor(bgcolor, element, driver);
		}
	}
	
	public static void ChangeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+" '", element);
		
		try
		{
			Thread.sleep(20);
		}
		
		catch(InterruptedException e)
		{}
		
	}	
	
		//DRAW BORDER
		public static void drawBorder(WebElement element1, WebDriver driver)
		{
			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("arguments[0].style.border='3px solid yellow'",element1);
			
		}
*/		
		//getTitle
		
		public static String getTitle(WebDriver driver)
		{
			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			String title=js1.executeScript("return document.title;").toString();
			return title;
		}
		
		//ElementClick
		public static void ElementClick(WebElement element,WebDriver driver)
		{
			
			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("arguments[0].click;",element);
			
		}
		
		//generateAlert
		public static void generateAlert(WebDriver driver,String message)
		{

			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("alert('" + message +"')");
			
		}
		
		//RefreshBrowser
		public static void refreshBrowser(WebDriver driver)
		{

			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("history.go(0)");
			
		}
		
		//ScrollIntoView
		public static void ScrollIntoView(WebDriver driver,WebElement element)
		{

			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("arguments[0].scrollIntoView(true);",element);
			
		}
		
		//ScrollDown
		public static void ScrollDown(WebDriver driver)
		{

			JavascriptExecutor js1 =((JavascriptExecutor)driver);
			js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		
		
		
		
	}


