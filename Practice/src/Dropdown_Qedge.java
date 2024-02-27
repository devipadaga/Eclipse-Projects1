import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Qedge {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
	/*	Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).build().perform();
	*/	
		Select select=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		List<WebElement> list=select.getOptions();
		
		
		int count=list.size();
		System.out.println(count);
		
	/*	for(int i=1;i<=list.size();i++)
		{
			String names=list.get(i).getText();
			System.out.println(names);
		}
	*/
     //********************************************************************************
		// SCRIPT TO CHECK SPECIFIED ITEM IS PRESENT OR NOT
		
	/*	
		String item_to_check="Electronics";
		boolean isitem_present=false;
		
		for(int j=1;j<list.size();j++)
		{
			String Options=list.get(j).getText();
			if(Options.equalsIgnoreCase(item_to_check))
			{
				System.out.println(j+" Item is present in the list");
				isitem_present=true;
				break;
			}
			
		}
			
			if(isitem_present)
			{
				System.out.println(item_to_check+" is present in the list , test pass");
			}else
			{
				System.out.println(item_to_check+" is not present in the list , test fail");
			}
		
	*/
	//******************************************************************************************
			//  SCRIPT TO CHECK ELEMENTS ARE PRESENT IN ASCENDING ORDER/NOT
			
			
			String ele1,ele2;
			boolean order=false; 
	
			for(int k=2;k<list.size();k++)
			{
				 ele1=list.get(k-1).getText();
				 ele2=list.get(k).getText();
				 
				 if(ele2.compareToIgnoreCase(ele1)<0)
				 {
					 order=false;
					 break;
				 }
				
			}
	
			if(order)
			{
				System.out.println("Elements are in ASCENDING ORDER");
			}
	
			else
			{
				System.out.println("Elements are  not in ASCENDING ORDER");
			}
	}

}
