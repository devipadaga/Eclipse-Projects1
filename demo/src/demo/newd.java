package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newd {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		driver.manage().window().maximize();

	}

}
