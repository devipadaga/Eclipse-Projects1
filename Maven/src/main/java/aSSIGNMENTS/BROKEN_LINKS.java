package aSSIGNMENTS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BROKEN_LINKS {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		
		   driver.get("https://www.snapdeal.com/");
		   List<WebElement> links=driver.findElements(By.cssSelector("[class=\'underLineOnHover\']"));
		   System.out.println(links.size());
		   
		   SoftAssert a=new SoftAssert();
		   
		   for(WebElement link:links)
		   {
			   String url=link.getAttribute("href");
			   HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			   conn.setRequestMethod("HEAD");
			   conn.connect();
			   int respCode=conn.getResponseCode();
			   
			 System.out.println(url+" - "+conn.getResponseMessage());
			 
			 a.assertTrue(respCode<400,"The Link with "+ link.getText() +" is found broken with responseCode : "+respCode);
			 a.assertAll();
			 
			 
		//*********can write like below alsooo	 
//			   if(respCode>400)
//				   System.out.println("The Link with "+ link.getText() +" is found broken with responseCode : "+respCode);
//			   
			   
		   }
	}

}
