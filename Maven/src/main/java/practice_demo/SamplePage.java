package practice_demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplePage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id=\"menu\"]/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Sample Page Test')]")).click();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		driver.findElement(By.xpath("//div[@class='grunion-field-wrap grunion-field-name-wrap']/input[@type='text']")).sendKeys("Devi");
		driver.findElement(By.cssSelector("#g2599-email")).sendKeys("devi12345@gmail.com");
		driver.findElement(By.id("g2599-website")).sendKeys("https://devidemo.com");
		Select select=new Select(driver.findElement(By.id("g2599-experienceinyears")));
		select.selectByValue("1-3");
		driver.findElement(By.cssSelector("[value='Automation Testing']")).click();
		driver.findElement(By.cssSelector("[value='Graduate']")).click();
		driver.findElement(By.cssSelector("[onclick='myFunction()']")).click();
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys(alertText);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\SPURGE\\Desktop\\filetransfer.txt");
		
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id=\"menu\"]/ul/li[4]/a"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Testing Site')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Frames And Windows')]")).click();
		//action.sendKeys(Keys.ENTER).build().perform();
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] a[class='button e.g. button_hilite button_pale small_button']")).click();
		
		String firstW=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(all);
		
		Iterator<String> itr=all.iterator();
		while(itr.hasNext())
		{
			String newF=itr.next();
			if (!firstW.equalsIgnoreCase(newF)) 
			{		
				driver.switchTo().window(newF);
				
				System.out.println("im in new Tab");
				//driver.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] a[class='button e.g. button_hilite button_pale small_button']")).click();
			}
			driver.switchTo().defaultContent();
			System.out.println("im in parent Tab");
			//driver.navigate().back();
			
		}
		driver.findElement(By.xpath("//div[@class='newtabs horizontal']/ul/li[2]")).click();
		System.out.println("clicked on new window ");
		String winText=driver.findElement(By.cssSelector("[rel-title='Open New Window'] div")).getText();
		System.out.println(winText);
		
//		By passwordLocator = RelativeLocator.with(By.tagName("a")).below(By.cssSelector("[rel-title='Open New Window'] div"));
//		driver.findElement(passwordLocator).click();
//		
		driver.findElement(By.xpath("(//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here'])[2]")).click();
		//driver.switchTo().parentFrame();
		
		
		System.out.println("clicking on iFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='newtabs horizontal']/ul/li[3]")).click();
		System.out.println("clicked on iFrame");
		String FrameText=driver.findElement(By.cssSelector("[rel-title='iFrame'] div")).getText();
		System.out.println(FrameText);
		
//		driver.switchTo().frame(1);
//		WebElement all_in_IFrame=driver.findElement(By.xpath("//span[@id='current_filter']"));
//		//driver.switchTo().frame(all_in_IFrame);
//		action.moveToElement(all_in_IFrame).build().perform();
		
		System.out.println(driver.findElement(By.tagName("//frame")));
		
		
		driver.findElement(By.xpath("//div[@class='menu-widgets-container']/ul/li[4]")).click();
		
	}
}

