package aSSIGNMENTS;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Al {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		  driver.get("https://www.spicejet.com/");
		  System.out.println( driver.getCurrentUrl());
		  
		  //driver.switchTo().alert().dismiss();
		  
		 driver.findElement(By.cssSelector("[data-testid='to-testID-destination']")).click();
//	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		 WebElement dest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='to-testID-destination']")));
//		 driver.findElement(By.cssSelector("[data-testid='to-testID-destination']")).sendKeys("b");
//		 dest.sendKeys("b");
		  List<WebElement> destCities=driver.findElement(By.cssSelector(".css-1dbjc4n.r-b5h31w.r-95jzfe")).findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
		  System.out.println(destCities.size());	
		  
		  for(int i=0;i<destCities.size();i++)
		  {
			  if(destCities.get(i).getText().contains("Bengaluru"))
			  {
				  destCities.get(i).click();
			  }
		  }
		  
		  
		  driver.findElement(By.cssSelector("[data-testid=\"departure-date-dropdown-label-test-id\"]")).click();

	}

}
