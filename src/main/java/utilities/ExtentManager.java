package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports extent; 
	
	public static ExtentReports getInstance()
	{
		if(extent == null)
		{
			String timestamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
			String folderpath = "test-output/ExtentReports_" + timestamp;
			String reportpath = folderpath + "/ExtentReport.html";
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
			
			extent = new ExtentReports();
			
			extent.attachReporter(reporter);
		}
	
		return extent;
	}

}
