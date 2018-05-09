package com.renual.qa.takeScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.renual.qa.generic.TestBase;

public class ListenersTest implements  ITestListener
{

	private ITestResult result;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
String name = result.getMethod().getMethodName();
		
		EventFiringWebDriver e = new EventFiringWebDriver(TestBase.driver);
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Project Management\\com.renual.qa.test\\screenShots"+name+".png");
		try 
		{
			org.apache.commons.io.FileUtils.copyFile(src, dest);
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
