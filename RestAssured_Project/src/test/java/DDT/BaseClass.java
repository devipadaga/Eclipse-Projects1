package DDT;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.xml.XmlTest;

public class BaseClass {

	WebDriver driver;
	XmlTest xmlTest;

	public BaseClass() {
		try {
			xmlTest = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest();
			System.out.println(xmlTest.getParameter("status"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	
	public static void main(String[] args) {		
		BaseClass b=new BaseClass();
	}
}
