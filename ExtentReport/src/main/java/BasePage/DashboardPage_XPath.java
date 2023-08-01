package BasePage;

import java.lang.reflect.Method;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

public class DashboardPage_XPath extends BasePage_Driver
{
 
    @BeforeClass
	public void bc()
	{
		BasePage_Driver.er = report.createTest("LoginPageTest");
	}
	@BeforeMethod
	public void bf(Method m)
	{
		BasePage_Driver.e= BasePage_Driver.er.createNode(m.getName());
	}

	public static void Click_on_Admin()
	{
		e.info("Click_on_Admin successful");
	}
	
	public static void click_on_time()
	{
		e.info("clicked_on_time ");
	}
	
	public static void click_on_Leave()
	{
		e.info("Clicked on leave successfully");
	}
}
