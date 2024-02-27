import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_Example {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(5000);
		
		// File
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\SPURGE\\eclipse-workspace\\Practice\\ScreenShots\\Image.jpg");
		FileUtils.copyFile(srcfile, destfile);
		System.out.println("***************Screenshot saved Successfully************8");
		
		//ByteArray
		TakesScreenshot ts1=(TakesScreenshot) driver;
		byte[] ByteArray=ts.getScreenshotAs(OutputType.BYTES);
		File destfile2=new File("C:\\Users\\SPURGE\\eclipse-workspace\\Practice\\ScreenShots\\ImagewithByTEArray.jpg");
		FileOutputStream fos=new FileOutputStream(destfile2);
		fos.write(ByteArray);
		fos.close();
		
		System.out.println("***************Screenshot saved Successfully************8");
		
		
		//Base64
		TakesScreenshot ts2=(TakesScreenshot) driver;
		String Base64Code=ts.getScreenshotAs(OutputType.BASE64);
		byte[] ByteArray1=Base64.getDecoder().decode(Base64Code);
		
		File destfile3=new File("C:\\Users\\SPURGE\\eclipse-workspace\\Practice\\ScreenShots\\ImagewithBase64.jpg");
		FileOutputStream fos1=new FileOutputStream(destfile3);
		fos1.write(ByteArray1);
		fos1.close();
		driver.quit();
		
		System.out.println("***************Screenshot saved Successfully************8");
		
		

	}

}
