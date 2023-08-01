package Report;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;

public class ExtentReportDemo {
	 ExtentSparkReporter esr;
	 ExtentReports report;
	 ExtentTest et;
	 

	@BeforeClass
	public void before_method() {
		esr = new ExtentSparkReporter("ExtentReport.html");
		report = new ExtentReports();
		report.attachReporter(esr);
	}
	
	@BeforeMethod
	public void bm(Method m)
	{
		et = report.createTest(m.getName());
		
	}

	@Test
	public void TestCase_1() {

		et.info("Test Case 1 executed");
	}

	@Test
	public void TestCase_2() {
		et.info("Test Case2 executed");
	}

	@Test
	public void TestCase_3() {
		et.info("Test Case3 executed");
	}

	@AfterClass
	public void save_data() {
		report.flush();
	}


}
