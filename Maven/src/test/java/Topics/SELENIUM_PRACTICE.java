package Topics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SELENIUM_PRACTICE {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// USING HASHMAP
		List<WebElement> vegetables = driver.findElements(By.xpath("//div[@class='product']//h4[@class='product-name']"));

		Map<String, Integer> myveg = new HashMap<>();
		myveg.put("Brocolli - 1 Kg", 2);
		myveg.put("Cauliflower - 1 Kg", 2);

		for (int i = 0; i < vegetables.size(); i++) {
			String str = vegetables.get(i).getText();
			if (myveg.containsKey(str)) {
				for (int j = 0; j < myveg.get(str); j++) {
					WebElement e = driver.findElement(By.xpath("//h4[text()='" + str + "']//following::button[1]"));
					e.click();
					Thread.sleep(5000);
				}
			}
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		Thread.sleep(5000);
		List<WebElement> itemsname = driver.findElements(By.xpath("(//ul[@class='cart-items'])[1]//li//p[@class='product-name']"));
		List<WebElement> noofitems = driver.findElements(By.xpath("(//ul[@class='cart-items'])[1]//li//p[@class='quantity']"));

		Map<String, String> newMap = new HashMap<>();
		for (int i = 0; i < itemsname.size(); i++) {
			newMap.put(itemsname.get(i).getText(), noofitems.get(i).getText());

		}

		System.out.println(newMap);

		driver.quit();
		
		
		
		
		

		// USING ARRAYLIST(done in video "rahul")

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++)
		{
			// Brocolli - 1 Kg

			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
				{
					break;

				}
			}
		}

	}

}
