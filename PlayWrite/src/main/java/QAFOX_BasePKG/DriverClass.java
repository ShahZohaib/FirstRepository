package QAFOX_BasePKG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverClass 
{
	public static Page p;

	public static ExtentSparkReporter esr;
	public static ExtentReports report;
	public static ExtentTest Test1;
	public static ExtentTest Test2;
	
		
	public static void driver(String url)
	{
		Playwright pw = Playwright.create();
		  Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  p = bw.newPage();
		  p.navigate(url);
		 
	}
	@BeforeSuite
	public void bs()
	{
		esr = new ExtentSparkReporter("Extent.html");
		report = new ExtentReports();
		report.attachReporter(esr);
	}
	@AfterSuite
	public void Save_Data()
	{
		report.flush();
	}
}
