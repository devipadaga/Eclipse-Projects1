package Topics;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//////////NOT WORKING






public class BrokenImages {

	public static void main(String[] args) {

		int iBrokenImageCount=0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
			List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total no. of images are " + imagesList.size());
			for (WebElement img : imagesList) {
			
				if (img.getAttribute("naturalWidth").equals("0"))
				{
					System.out.println(img.getAttribute("outerHTML") + " is broken.");
				      iBrokenImageCount++;			
				}	
				System.out.println(iBrokenImageCount);
			}
		
}
}
