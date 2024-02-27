package aSSIGNMENTS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Ascending {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.spicejet.com/");
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
//		
//		List<WebElement> list=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-8fdsdq']//div[@class='css-1dbjc4n']")).findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
//		System.out.println(list.size());
//		
//		List<String> names=new ArrayList<>();
//		
//		for(int i=0;i<list.size();i++)
//		{
//			names.add(list.get(i).getText());
//		}
//		System.out.println("Default Sorting :"+names);
//		
//		List<String> nList=new ArrayList<>(names);
//		Collections.sort(nList);
//		//Collections.sort(nList,Collections.reverseOrder());
//		
//		System.out.println("After Sorting :"+nList);
//		
//		boolean isSorted=names.equals(nList);
//		
//		if(isSorted)
//		{
//			System.out.println("Nmaes are in Asc order");
//		}		
//		else
//			System.out.println("Not arranged in asc order");
//		
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drpDown=driver.findElement(By.cssSelector("[rel-title='Select Country'] select"));
		Select select=new Select(drpDown);
		
		List<WebElement> allOptions=select.getOptions();
		
		List<String> al=new ArrayList<>();
		
		for(WebElement option:allOptions)
		{
			al.add(option.getText());
		}
		System.out.println("Default order :"+al);
		
		List<String> newal=new ArrayList<>(al);
		Collections.sort(newal);
		System.out.println("after sorting :"+newal);
		
		if(newal.equals(al))
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
			
		
	}

}
