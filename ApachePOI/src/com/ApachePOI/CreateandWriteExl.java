package com.ApachePOI;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateandWriteExl {

	public static void main(String[] args) throws Exception {
		
	//	System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

	//	Logger log = (Logger) LogManager.getLogger(EventExample.class.getName());
		File file=new File("C:\\Users\\SPURGE\\Documents\\test2.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new  XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("HELLO");
		sheet.getRow(0).createCell(1).setCellValue("WORLD");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("WELCOME");
		sheet.getRow(1).createCell(1).setCellValue("HERE");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		fis.close();
		fos.close();
		workbook.close();
		
		static WebDriver driver;
		public ExtentTest logger;
		public ExtentReports extent;
		public ExtentSparkReporter htmlReporter;
		//public static ExtentReports report;
		
		
		@Override
		public void onStart(ITestContext testContext) {
			log("Test Started....");
//			String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//			String repName="Test-Report."+timeStamp+".html";
//			htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+repName);
//			//htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");		
//			extent=new ExtentReports();
//			extent.attachReporter(htmlReporter);
//			
		}

		@Override
		public void onTestSuccess(ITestResult tr) {

			log("Test '" + tr.getName() + "' PASSED");

			// This will print the class name in which the method is present
			log(tr.getTestClass());

			// This will print the priority of the method.
			// If the priority is not defined it will print the default priority as
			// 'o'
			log("Priority of this method is " + tr.getMethod().getPriority());

			System.out.println(".....");
		}

		@Override
		public void onTestFailure(ITestResult tr) {

			log("Test '" + tr.getName() + "' FAILED");
			log("Priority of this method is " + tr.getMethod().getPriority());
			System.out.println(".....");
			String screenshotpath=System.getProperty("C:\\Users\\SPURGE\\eclipse-workspace\\inetBankingV1\\test-output"+System.currentTimeMillis()+tr.getName()+".png");
			File f=new File(screenshotpath);
			if(f.exists())
			{
				try {
					logger.fail("screenshot is below : " +logger.addScreenCaptureFromPath(screenshotpath));
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
		}

		@Override
		public void onTestSkipped(ITestResult tr) {
			log("Test '" + tr.getName() + "' SKIPPED");
			System.out.println(".....");
		}

		private void log(String methodName) {
			System.out.println(methodName);
		}

		private void log(IClass testClass) {
			System.out.println(testClass);
	}
	}
	}

}
