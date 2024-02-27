package Codes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		
		//Capture Cookies from Browser
		Set<Cookie> Cookies=driver.manage().getCookies();
		System.out.println("No: of cookies are : "+ Cookies.size());
		
		//How to print cookies from browser
		for(Cookie c:Cookies)
		{
			System.out.println(c.getName()+" : "+c.getValue());
		}
		
		
		//How to add Cookie to the browser
				//create Cookie Object
		
		Cookie cookieObj=new Cookie("MyCookie","12345");
		Cookies=driver.manage().getCookies();
		System.out.println("No. of Cookies after Adding : "+Cookies.size());
		
		
		//How to  delete specific Cookie
		
		driver.manage().deleteCookie(cookieObj);
		driver.manage().deleteCookieNamed("MyCookie");
		Cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after deletion : "+Cookies.size());
		
		// Delete All Cookies
		driver.manage().deleteAllCookies();
		System.out.println("Size of cookies after deletion all : "+Cookies.size());
		driver.quit();

	}

}
