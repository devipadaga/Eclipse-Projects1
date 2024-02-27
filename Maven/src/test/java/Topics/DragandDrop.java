package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		
		WebElement sourceElement=driver.findElement(By.xpath("//li[1]"));
		
		
		WebElement DstElement=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(DstElement).release().build().perform();
		action.dragAndDrop(sourceElement, DstElement);
	}

}
