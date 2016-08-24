package com.gspann.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener

{
    WebDriver driver;
	@Override
	public void onFinish(ITestContext arg0)
	{
		System.out.println("onFinish-"+arg0.getName());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onStart-"+arg0.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage"+arg0.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult arg0)//
	{
		IrctcListenerTest ilt = new IrctcListenerTest();
		driver = ilt.getDriver();
		System.out.println("onTestFailure"+arg0.getName());
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("D:/sonam/s1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped"+arg0.getName());
		
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart"+arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess"+arg0.getName());
		
	}

}
