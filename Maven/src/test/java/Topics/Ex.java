package Topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//				
//		 //  driver.get("https://www.goibibo.com/");
//		
//		
//		
//		driver.get("https://www.facebook.com");
//	    List<WebElement> AllLinks= driver.findElements(By.tagName("a"));
//	    
//	     System.out.println("Total links present on webpage: "+AllLinks.size());
//	    
//	     
//	     WebElement Footer=driver.findElement(By.xpath("//div[@id='pageFooter']"));
//	     List<WebElement> footerLinks=Footer.findElements(By.tagName("a"));
//	     
//	     System.out.println("Total links present in footers are: "+footerLinks.size());
//	     
//	     List<WebElement> diff=AllLinks-Footer.findElements(By.tagName("a");
//	     System.out.println(diff);
		
		
List<Integer> list=new ArrayList<>();
        
        list.addAll(Arrays.asList(2,3,10,1,4,5,6));
        System.out.println("Before removing list : "+ list);
        list.remove("10");
        
      System.out.println("After removing element : "+ list);

	}

}
