import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self {

	public static void main(String[] args) throws Exception {
		
	/*	String s="abc";
	//	char[] ch=s.toCharArray();
		char remove='b';
		String result="";
		
		for(int i=0;i<=s.length();i++)
		{
			if(s.charAt(i)!=remove)
			{
				result=result+s.charAt(i);
			}
			System.out.println(result);		
			}
		*/	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='row pt-3 pb-6 p-relative px-4']//button[1]")).click();
		
		String date="23/March/2023";
		
		String[] s=date.split("/");
		String dt=s[0];
		String month=s[1];
		String year=s[2];
		
		String CalYear=driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']")).getText();
		
		while(!CalYear.equals(year))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @class='c-pointer c-secondary-500']")).click();
			 
		}
		CalYear=driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']")).getText();
	    //  WebElement m= driver.findElement(By.xpath("//*[local-name()='svg' and @dataicon='home']/*[local-name()='path']"));

		String CalMonth=driver.findElement(By.xpath("")).getText();
		
		
		
		
		}


}
