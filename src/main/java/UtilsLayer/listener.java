package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listener extends extentReportSetUp implements ITestListener {
	public static ExtentTest extenttest;
    public void onStart(ITestContext context) {
		System.out.println("Suite is started");
		extent= extentReportSetUp.extendreportsetup();
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is started");
		extenttest=extent.createTest(result.getMethod().getMethodName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is running");
		extenttest.log(Status.PASS,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is fails");
	extenttest.log(Status.FAIL,result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skip");
		extenttest.log(Status.SKIP,result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Suite is completed");
		extent.flush();
	}

}
