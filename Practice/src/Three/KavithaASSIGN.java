package Three;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KavithaASSIGN {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Careers')]")).click();
		String firstwindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String>itr=allWindows.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			if(!firstwindow.equalsIgnoreCase(childwindow))
			{
			driver.switchTo().window(childwindow);
			
			
			
			Actions action=new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
			

			
			
			String url=driver.findElement(By.cssSelector("td[valign='top'] a[class='url']")).getText();
			System.out.println("url in child window is :"+url);
			
			
			
			
			String text=driver.findElement(By.cssSelector("td[class='cleanbg'] p[align='center']")).getText();
			System.out.println("text is :"+text);
			
			String[] editText=text.split(" ");
			String  data1=editText[0];
			System.out.println(data1);
			
			String  data2=editText[1];
			System.out.println(data2);
			
			String  data3=editText[2];
			System.out.println(data3);
			
			String  data4=editText[3];
			System.out.println(data4);
			

			String  data5=editText[4];
			System.out.println(data5);
			
			String  data6=editText[5];
			System.out.println(data6);
			
			
			
			
			driver.switchTo().window(firstwindow);
			
			action.sendKeys(Keys.PAGE_UP).build().perform();
			
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")).click();
			
			
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement email=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[4]"));
			
			js.executeScript("arguments[0].scrollIntoView();", email);
			email.click();
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data6);
			}
			
		}
		
		
	//************** KAVITHA CODE TOOK IN CHAT
		
//		String parent=driver.getWindowHandle();
//        Set<String>child=driver.getWindowHandles();
//        System.out.println(child+" : are windows ");
//        Iterator<String> itr=child.iterator();
//        String data = "";
//        while(itr.hasNext())
//        {
//            String childwindow=itr.next();
//            driver.switchTo().window(childwindow);
//            String title=driver.getTitle();
//            if(title.contains("Careers | SpiceJet Airlines"))
//            {
//                 data=driver.findElement(By.xpath("//td[@class='cleanbg']//p[@align='center']")).getText().split(" ")[5];
//                System.out.println(data);
//            }
//            
//        }
//        driver.switchTo().window(parent);
//        Thread.sleep(3000);
//        WebElement element=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-adyw6z r-1kfrs79']"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        driver.findElement(By.xpath("//div[text()='Login']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-p1pxzi']/div[2]/div[1]")).click();
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data);
//		
//		
		
		
		
		
		
		
		
		
		
//		WebElement AboutUs=driver.findElement(By.xpath("//body/div//div//div//div//div//div//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz']/div[1]"));
//		List<WebElement> links=AboutUs.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
		
//		for(int i=0;i<links.size();i++)
//		{	
//			 links.get(i).click();
//			//element.click();
//			//System.out.println(child+" : are windows ");
//			 String parent=driver.getWindowHandle();
//			Set<String>child=driver.getWindowHandles();
//				
//			Iterator<String> itr=child.iterator();
//			while(itr.hasNext())
//			{
//				String childwindow=itr.next();
//				System.out.println("child window is :"+childwindow);
//				if (!parent.equals(childwindow)) {
//					System.out.println(driver.switchTo().window(childwindow).getTitle());
//				Thread.sleep(3000);
//			}
//			String url=element.getAttribute("href");
//			System.out.println(url);
//		}
//	}

}
}







//div[@class='css-1dbjc4n r-1kihuf0 r-18u37iz r-13qz1uu']
//div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-17s6mgv r-1wyyakw']
//body/div//div//div//div//div//div//div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz']/div[1]