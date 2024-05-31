package extentReport;

import java.io.File;
import java.util.logging.FileHandler;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Program1 {

	
	@Test
	public void launchThereport() {
		ExtentReports report=new ExtentReports();
		
		File path=new File("./ExtentReport/program1.html");
		
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		
		spark.config().setDocumentTitle("OK01 FirstREPORT");
		
		spark.config().setReportName("Aditya Londhe");
		spark.config().setTheme(Theme.DARK);
		//attach spark report to extent report
		report.setSystemInfo("os", "windows 11");
		report.attachReporter(spark);
		//create the test case
		
		ExtentTest test1=report.createTest("test1");
		
		test1.log(Status.FAIL, "login function error");
		
		report.flush();
		
	}
}
