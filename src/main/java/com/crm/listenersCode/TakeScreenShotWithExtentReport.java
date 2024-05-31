package com.crm.listenersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseClassDws;

public class TakeScreenShotWithExtentReport extends BaseClassDws implements ITestListener {

	public ExtentReports report;
	public ExtentSparkReporter spark;
 	public ExtentTest test;
 	
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test=report.createTest(name);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS,"your testCase has passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "your testCase has  Failed");
	TakesScreenshot	ts=(TakesScreenshot) driver;
    String	from=ts.getScreenshotAs(OutputType.BASE64);
    test.addScreenCaptureFromBase64String(from);
	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "your testCase has skiped");
		
	}
	@Override
	public void onStart(ITestContext context) {
		File  path=new File("./ExtentReport/capture.html");
		spark=new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("nahi mahit");
		spark.config().setReportName("Aditya");
		spark.config().setTheme(Theme.STANDARD);
		report=new ExtentReports();
		report.setSystemInfo("os", "windows 11");
		report.setSystemInfo("browser", "chrome");
		report.attachReporter(spark);
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("on finish");
		report.flush();
	}
}
