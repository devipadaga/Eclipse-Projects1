package Topics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SELENIUM_PRACTICE_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   String s="Radio Button Example";
		   String name=driver.findElement(By.cssSelector("div[id='radio-btn-example'] fieldset legend")).getText();
		   System.out.println(name);
		   Assert.assertEquals(s, name,"Name is Same");
		   WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		  if(!radio1.isSelected())
		  {
			  radio1.click();
		  }
		  WebElement radio2=driver.findElement(By.cssSelector("input[value='radio2']"));
		  WebElement radio3=driver.findElement(By.cssSelector("input[value='radio3']"));
		  if(!radio2.isSelected())
		  {
			  radio3.click();
		  }
		  
		  System.out.println("----------DONE"+name);
		  
		  String name1=driver.findElement(By.cssSelector("div[id='select-class-example'] fieldset legend")).getText();
		  
		  driver.findElement(By.id("autocomplete")).sendKeys("Canada");
		  List<WebElement> list=driver.findElement(By.id("autocomplete")).findElements(By.tagName("li"));
		  for(int i=0;i<list.size();i++)
		  {
			  String country="Canada";
			  if(list.get(i).getText().contains(country))
			  {
				  list.get(i).click();
			  }
			  
		  }
		  System.out.println("----------DONE"+name1);
//		  Actions action=new Actions(driver);
//		  action.moveToElement(radio3);
//		  System.out.println("Text example Done");
		  
		   
		  String name2=driver.findElement(By.cssSelector("div[class='cen-right-align'] fieldset legend")).getText();
		  
		  
		  System.out.println("----------DONE"+name2);
		  

	}

}
