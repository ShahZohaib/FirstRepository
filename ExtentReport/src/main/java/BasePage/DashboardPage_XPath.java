package BasePage;

import java.lang.reflect.Method;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

public class DashboardPage_XPath extends BasePage_Driver
{
 
    @BeforeClass
	public void bc()
	{
		BasePage_Driver.Test1 = report.createTest("LoginPageTest");
	}
	@BeforeMethod
	public void bf(Method m)
	{
		BasePage_Driver.Test2= BasePage_Driver.Test1.createNode(m.getName());
	}

	public static void Click_on_Admin()
	{
		Test2.info("Click_on_Admin successful");
	}
	
	public static void click_on_time()
	{
		Test2.info("clicked_on_time ");
	}
	
	public static void click_on_Leave()
	{
		Test2.info("Clicked on leave successfully");
	}
}
