package Listeners_Utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report confriguration");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("repoter backup - suite exxecution ended");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Screenshot-Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}

}
