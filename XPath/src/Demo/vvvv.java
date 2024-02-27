package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class vvvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://api.freecrm.com/register/");
			driver.findElement(By.xpath("//input[@class='search']")).click();
			
			List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'menu transition visible')]/div"));
			
			for(WebElement option : options)
			{
				String optiontext=option.getText();
				System.out.println(optiontext);
				
				//if(optiontext.contains(optiontext))
			}

	}

}
