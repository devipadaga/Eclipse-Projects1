package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShaowDOM {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		//driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804782%7Ce%7Cfacebook%20register%7C&placement=&creative=550525804782&keyword=facebook%20register&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409281995%26loc_physical_ms%3D9040231%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAsNKQBhAPEiwAB-I5zYmKWdep87-SUVBZt-R-2GvviOrUAvHoeJKRSy8MrEjPQUkN9zqFYxoCcDMQAvD_BwE");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//Self 
		driver.findElement(By.xpath("//div[@class='curLink tabs']/self::div")).click();
		String text=driver.findElement(By.xpath("//a[normalize-space()='MphasiS Ltd.']/self::a")).getText();
		System.out.println(text);
		
		/*
		//Parent
		String text1=driver.findElement(By.xpath("//a[normalize-space()='MphasiS Ltd.']/parent::td")).getText();
		System.out.println(text1);
		
		//Ancestor
		String text2=driver.findElement(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr")).getText();
		System.out.println(text2);
		
		//child
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/child::td"));
		System.out.println("No:0f child elements:"+childs.size());
		
		//descendant
		List<WebElement> descendants=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/descendant::*"));
		System.out.println("No:of descendants:"+descendants.size());
		
		List<WebElement> descendants1=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/descendant::td"));
		System.out.println("No:of descendants:"+descendants1.size());
		
		//Following
		List<WebElement> following=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/following::*"));
		System.out.println("No:of following:"+following.size());
		
		List<WebElement> following1=driver.findElements(By.xpath("a[normalize-space()='MphasiS Ltd.']/ancestor::tr/following::tr"));
		System.out.println("No:of following1:"+following.size());
		
		//following-sibling
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/following-sibling::tr"));
		System.out.println("No:of followingsiblings=="+followingsiblings.size());
		
		//preceeding_sibling
		List<WebElement> preceedingsiblings=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/preceding-sibling::*"));
		System.out.println("No:of preceedingsiblings=="+preceedingsiblings.size());

		List<WebElement> preceedingsiblings1=driver.findElements(By.xpath("//a[normalize-space()='MphasiS Ltd.']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("No:of preceedingsiblings=="+preceedingsiblings1.size());
		
	*/
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[normalize-space()=\"Today's Deals\"]")).click();
		//driver.close();
	}
	
	//input[@id='u_0_6_jp']/ancestor::div[1]/preceding::input[6]
	//input[@id='u_0_6_jp']/ancestor::div[2]/div[1]/div/div[2]
	//input[@id='u_0_6_jp']/ancestor::div[2]/div[1]/div/div[2

}
