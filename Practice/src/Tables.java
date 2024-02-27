import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.railyatri.in/time-table");
		Thread.sleep(5000);
		
		WebElement table=driver.findElement(By.xpath("//div[@class='container-fluid bgclr-wht margin-top-15 shadow']"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
		System.out.println(cols.size());
		
	/*	for(int i=0;i<rows.size();i++)
		{
			String Rows=rows.get(i).getText();
			System.out.println(Rows);
		}
	*/	
		//      (or)
		
		for(int i=1;i<rows.size();i++)
		{
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.println(data+" ");
			}
			System.out.println();
		}
		

	}

}
