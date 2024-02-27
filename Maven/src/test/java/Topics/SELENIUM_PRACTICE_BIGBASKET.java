package Topics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SELENIUM_PRACTICE_BIGBASKET{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.linkText("Shop by Category")).click();
		


		List<WebElement> Vegetables=driver.findElements(By.xpath("//div[@class='items']//div[1]//product-template[1]//div[1]//div"));
		
		System.out.println(Vegetables);
//		
//		 Map<String,Integer> myveg=new HashMap<>();
//		   myveg.put("Capsicum - Green (Loose)", 2);
//		   myveg.put("Carrot - Orange (Loose)", 2);
//		   myveg.put("Beans - Haricot (Loose)", 2);
//		   
		  

	}

}
