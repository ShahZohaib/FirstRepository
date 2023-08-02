package OrangeHRM_BasePKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DriverClass {
	public static WebDriver d;
	public static ExtentSparkReporter esr;
	public static ExtentReports report;
	public static ExtentTest Test1;
	public static ExtentTest Test2;
	
	@BeforeSuite
	public static void driver(String url)
	{
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		esr = new ExtentSparkReporter("Extent.html");
		report = new ExtentReports();
		report.attachReporter(esr);
	}
	@AfterSuite
	public void save_Data()
	{
		report.flush();
	}
}
