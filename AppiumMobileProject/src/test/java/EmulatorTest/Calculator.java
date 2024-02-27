package EmulatorTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities=new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	//	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

		capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c",false));	
		URL url=new URL("http://127.0.0.1:4723/wd/hub/");
		
		
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, capabilities);
	//	driver.get("https://www.amazon.com");
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// This package name of your app (you can get it from apk info app)
		 //       capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
		        // This is Launcher activity of your app (you can get it from apk info app)
		 //       capabilities.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity");

		
		
		
		//	AndroidDriver<MobileElement> driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub/"),capabilities);
		//	 driver=new RemoteWebDriver(url,capabilities);
		
		
		 //By apidemos = MobileBy.AccessibilityId ("API Demos");
//		MobileElement apiDemos=driver.findElements(By.className("android.widget.TextView")).get(7);
//		apiDemos.click();
		 
		 //driver.findElementsByAccessibilityId("API Demos");
	}
}
