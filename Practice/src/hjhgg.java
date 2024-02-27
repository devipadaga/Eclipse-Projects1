import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hjhgg {
	static WebDriver driver;
	
	public static String elecheck(String link_tobe_check)
	{
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		//String  = "Messenger";
		boolean islinkpresent = false;
		
		for(int i=0;i<links.size();i++)
		{
			String linkname = links.get(i).getText();
			if(linkname.equalsIgnoreCase(link_tobe_check))
			{
				islinkpresent=true;
				break;
			}			
		}
		
		if(islinkpresent)
		{
			System.out.println(link_tobe_check+" is present in the page, test pass");
		}else
		{
			System.out.println(link_tobe_check+" is not present in the page, test fail");
		}
		return link_tobe_check;
	}
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		
		elecheck("Messenger");

	}

}
