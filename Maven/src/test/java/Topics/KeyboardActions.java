package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Google Account creation page")).click();
		//driver.navigate().forward();
		driver.findElement(By.id("firstName")).sendKeys("Tirumala");
		driver.findElement(By.id("lastName")).sendKeys("kadiyam");
		driver.findElement(By.id("username")).sendKeys("TirumalaDevi12345123");
		driver.findElement(By.name("Passwd")).sendKeys("Tirumala1@1@");
		//WebElement confirm=driver.findElement(By.name("ConfirmPasswd"));
		//confirm.sendKeys("Tirumala1@1@");
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(5000);
		
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
	
		act.sendKeys(Keys.TAB);
		act.perform();
		Thread.sleep(5000);
	
	
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.perform();
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//input[@id='i3']")).click();
	//driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

	}
	

}
