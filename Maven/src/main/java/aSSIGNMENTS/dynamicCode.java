package aSSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		String name=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend")).getText();
		System.out.println(name);
		
		
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).click();
		String chckBox=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(chckBox);
		Thread.sleep(3000);
		
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropDown);
		select.selectByVisibleText(chckBox);
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys(chckBox);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		String alertText=driver.switchTo().alert().getText();
		
		if(alertText.contains(chckBox))
		{
			driver.switchTo().alert().accept();
		}
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
