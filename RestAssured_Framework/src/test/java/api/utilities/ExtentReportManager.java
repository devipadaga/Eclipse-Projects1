package api.utilities;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


	public class ExtentReportManager extends TestListenerAdapter
	{
		public ExtentSparkReporter sparkReporter;
		public ExtentReports extent;
		public ExtentTest logger;
		
			
		public void onStart(ITestContext testContext)
		{
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			String repName="Test-Report- "+timeStamp+".html";
			
			sparkReporter=new ExtentSparkReporter(".\\reports\\"+repName);  //specify location of the report	
			extent=new ExtentReports();
			
			extent.attachReporter(sparkReporter);
			extent.setSystemInfo("Application","Pet Store Users API");
			extent.setSystemInfo("Host name","localhost");
			extent.setSystemInfo("Environemnt","QA");
			extent.setSystemInfo("user","TirumalaDevi");
			
			sparkReporter.config().setDocumentTitle("RestAssuredAutomationFramework"); // Tile of report
			sparkReporter.config().setReportName("Pet Store Users API"); // name of the report
			//sparkReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
			sparkReporter.config().setTheme(Theme.DARK);
		}
		
		public void onTestSuccess(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); 
			logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 
		}
		
		public void onTestFailure(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); 
			logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); 
			
			String screenshotPath=".\\Screenshots\\"+tr.getName()+".png";
			
			File f = new File(screenshotPath); 
			
			if(f.exists())
			{
			logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
			}
			
		}
		
		public void onTestSkipped(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); 
			logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
		}
		
		public void onFinish(ITestContext testContext)
		{
			extent.flush();
		}

}
