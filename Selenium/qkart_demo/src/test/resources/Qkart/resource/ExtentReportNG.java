package Qkart.resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	public static ExtentReports extentReporter() {
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter spark= new ExtentSparkReporter(path);
		spark.config().setReportName("Automation Title");
		spark.config().setDocumentTitle("Automation Test Result");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Tester", "Viren Chauhan");
		return extent;
		
	}

}
