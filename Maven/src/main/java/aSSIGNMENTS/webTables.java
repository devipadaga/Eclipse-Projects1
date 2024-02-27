package aSSIGNMENTS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		 driver.get("http://qaclickacademy.com/practice.php");
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 //****************WINDOW SCROLL-DOWN
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(3000);
		 
		 //*******************WEBTABLE SCROLL-DOWN
		 js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		 
		 
		 //***************TASK IS TO PRINT 2ND ROW IN THE TABLE
		 
		 
		 WebElement table=driver.findElement(By.cssSelector(".table-display"));
		 
		 int rows=table.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr")).size();
		
		int columns= table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();

		 System.out.println("rows : "+rows);
		 System.out.println("columns : "+columns);
		
		List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));	
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());
			 
		 
		
		
		 
		
	}

}
