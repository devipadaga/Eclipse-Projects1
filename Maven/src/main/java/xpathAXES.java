import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathAXES {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Create New Account")).click();
		//driver.get("https://www.google.com/");
		//using ancestor to locate form tag
		driver.get("https://demoqa.com/text-box");
		boolean bol =driver.findElement(By.xpath("//label[text()='Full Name']/ancestor::form")).isDisplayed();
		System.out.println("Form is displayed : "+bol);
		
		//using following-sibling to locate email 
		driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div/input)[2]")).sendKeys("abc@xyz.com");
//		(//div[@class='col-md-9 col-sm-12']/child::input)[2]		
		
		//using child to locate full name textbox from form
		String label=driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']/child::label[@id='userName-label']")).getText();
		System.out.println("The label text is : "+ label);
		
		//child
		//div[@class="col-md-3 col-sm-12"]/child::label[@id="userName-label"]-------getText   using child
		
		//parent
		
		//preceeding
		//input[@id='userName']/preceding::label
		
		//following
		//input[@id='userName']/preceding::textarea
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//using decendent axis to locate yes radio
		//driver.get("https://www.demoqa.com/radio-button");
		//driver.findElement(By.xpath("//div[@class= 'custom-control custom-radio custom-control-inline']/descendant::input/following-sibling::label")).click();
		
		//using parent axis to locate yes radio
//		boolean bo = driver.findElement(By.xpath("//input[@id='yesRadio']/parent::div")).isSelected();
//		System.out.println("The Yes radio is selected : "+bo);
		

		
	}
}
		
		
		
		
		


