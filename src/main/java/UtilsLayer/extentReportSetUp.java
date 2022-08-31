package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.BaseClass;

public class extentReportSetUp extends BaseClass {
 public static ExtentReports extent;
	
 public static ExtentReports extendreportsetup() {
	ExtentSparkReporter sparkReports =new ExtentSparkReporter("C:\\Users\\gjain\\eclipse-workspace\\HybridFrameWork2\\ExtendReports\\abc.html");
	extent =new ExtentReports();
	extent.attachReporter(sparkReports);
	sparkReports.config().setTheme(Theme.DARK);
	return extent;
	}	
	
	
	
}