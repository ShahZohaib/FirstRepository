package Base_PKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DriverClass 
{
	public static WebDriver d;
	private static ExtentSparkReporter esr;
	public static ExtentReports report;
	public static ExtentTest test1;
	public static ExtentTest test2;
	
	
	public static void open_Driver(String url)
	{
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}
	@BeforeSuite
	public static void Extent_Report()
	{
		esr = new ExtentSparkReporter("OrangeHRM_Extent_Report.html");
		report = new ExtentReports();
		report.attachReporter(esr);
	}
	@AfterSuite
	public static void save_report()
	{
		report.flush();
	}
	
	
}
