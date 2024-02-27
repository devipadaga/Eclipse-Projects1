package Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;										//https://www.railyatri.in/time-table
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//https://www.railyatri.in/time-table");
		
	/*	//*[@id="homepage-main-container"]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[1]
		//*[@id="homepage-main-container"]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]
		//*[@id="homepage-main-container"]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[3]
		
		WebElement table=driver.findElement(By.xpath("//table[@class='table table-condensed']"));
		List <WebElement> rows=table.findElements(By.tagName("tr"));
		
		//System.out.println("ROWS:"+rows.size());
		
		
		// PRINT ALL THE ROW INFO
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			//System.out.println("COLUMNS SIZE:"+cols.size());
			//String trainnum=cols.get(0).getText();
			//String trainname=cols.get(1).getText();
			//String bbbbb=cols.get(2).getText();
			//System.out.println(trainnum+""+trainname);
			//System.out.println("ALL DATA:"+rows.get(i).getText());
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
	*/	
		
		WebElement traintable=driver.findElement(By.xpath(""));
		
		
			
			
		}
		
		
		
		}
	

