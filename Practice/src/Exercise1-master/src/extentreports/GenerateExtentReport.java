package extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateExtentReport {

	public static void main(String[] args) throws IOException {


		ExtentReports extent=new ExtentReports();
		
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("./reports/report.html");
		
		extent.attachReporter(sparkreporter);
		extent.createTest("Test 1");
		extent.flush();
		
		Desktop.getDesktop().browse(new File("D:\\eclipse workspace\\simplejavaproject\\reports\\report.html").toURI());
	}

}
