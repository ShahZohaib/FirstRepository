package BasePage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasePage_Driver 
{
	public static ExtentSparkReporter esr;
	public static ExtentReports report;
	public static ExtentTest er;
	public static ExtentTest e;
	@BeforeSuite
	public static void Open_Extent_report()
	{
		esr = new ExtentSparkReporter("Extent.html");
		report = new ExtentReports();
		report.attachReporter(esr);
	}
	
	@AfterSuite
	public static void save_data()
	{
		report.flush();
	}

	

}
