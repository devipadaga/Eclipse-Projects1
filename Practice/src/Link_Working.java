import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Working {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Images")).click();
		
		// CHECKING BY TITLE
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Google Images"))
		{
			System.out.println("link is working");
		}
		
		else
		{
			System.out.println("Link is not working");
		}

		//****************************************************************************88
		
		    // CHECKING BY URL
	
		String pgurl = driver.getCurrentUrl();
		if(pgurl.toLowerCase().contains("gmail"))
		{
			System.out.println("GMail Link working, test pass");
		}else
		{
			System.out.println("GMail Link not working, test fail");
		}
		
		driver.close();
	
	
	
	
	}

}
