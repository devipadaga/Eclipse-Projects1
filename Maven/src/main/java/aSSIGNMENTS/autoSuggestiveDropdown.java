package aSSIGNMENTS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		 driver.get("http://qaclickacademy.com/practice.php");
		 driver.findElement(By.id("autocomplete")).sendKeys("ind");
		 List<WebElement> list=driver.findElement(By.cssSelector("[class=\'ui-menu ui-widget ui-widget-content ui-autocomplete ui-front\']")).findElements(By.tagName("li"));
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++)
		 {
			 String name=list.get(i).getText();
			 if(name.equalsIgnoreCase("india"))
			 {
				 list.get(i).click();
				 break;
			 }
		 }
		 
		 
		 

	}

}
