package Topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct text");	
			}
		else {
			System.out.println("wrong");
		}
		alert.accept();
		//alert.dismiss();
		driver.findElement(By.id("login1")).sendKeys("Devi");
		driver.findElement(By.name("passwd")).sendKeys("Devi1@");
		driver.findElement(By.name("proceed")).click();
		
		
		
		
	}

}
