package com.companyname.projectname.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class MyListeners extends TestBase implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		
		test.info("Staring Test case MyListeners "+testCaseName );
	}

	public void onTestSuccess(ITestResult result) {

		test.pass("Execution of Test case "+testCaseName +" is completed and it succeed" );
		quitDriver();
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail("Execution of Test case "+testCaseName +" is Failed because " +result.getThrowable().getMessage());

		CommonMethods.takeScreenShot();
		quitDriver();
		
	}
	
	public void onTestSkipped(ITestResult result) {

		test.skip("Execution of Test case "+testCaseName +" is Skipped as it's Run Mode is set to NO" );
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
	

}
