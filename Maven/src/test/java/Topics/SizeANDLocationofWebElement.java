package Topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeANDLocationofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
			// LOCATION OF AN ELEMENT------------METHOD1
		System.out.println("Location of logo(x,y) is:"+logo.getLocation());
		System.out.println("Location of (x) is:"+logo.getLocation().getX());	
		System.out.println("Location of (y) is:"+logo.getLocation().getY());	
		
		// LOCATION  OF AN ELEMENT------------METHOD 2
		
		System.out.println("Location of logo(x,y) is:"+logo.getRect());
		System.out.println("Location of (x) is:"+logo.getRect().getX());	
		System.out.println("Location of (y) is:"+logo.getRect().getY());	
		
		System.out.println("***********************************8");
		
		// SIZE  OF AN ELEMENT------------METHOD 1
		
		System.out.println("SIZE(Width,Height):"+logo.getSize());
		System.out.println("SIZE(Width):"+logo.getSize().getWidth());
		System.out.println("SIZE(Height):"+logo.getSize().getHeight());
		
		// SIZE  OF AN ELEMENT------------METHOD 2
		
				System.out.println("SIZE(Width,Height):"+logo.getRect());
				System.out.println("SIZE(Width):"+logo.getRect().getDimension().getWidth());
				System.out.println("SIZE(Height):"+logo.getRect().getDimension().getHeight());
				
	}

}
