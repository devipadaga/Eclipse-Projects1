package virtualDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Calculator {

//	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM,MobilePlatform.ANDROID);
//		capabilities.setCapability("VERSION", "14");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c",false));
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<MobileElement> driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub/"),capabilities);
//		 driver=new RemoteWebDriver(url,capabilities);
		driver.get("https://www.google.com");
		
		

	}

}
