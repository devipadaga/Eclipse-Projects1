package Topics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			
			String url=element.getAttribute("href");
			
		
			//Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
	        try {
				//Use URL Class - Create object of the URL Class and pass the url as parameter 
				URL link = new URL(url);
						
				HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
				httpConn.setConnectTimeout(2000);
		
				httpConn.connect();
		 
			if(httpConn.getResponseCode()== 200) {	
				System.out.println(url+" - "+httpConn.getResponseMessage());
			}
			if(httpConn.getResponseCode()== 404) {
				System.out.println(url+" - "+httpConn.getResponseMessage());
			}
		}        
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	
	}
}

}
