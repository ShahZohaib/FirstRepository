package TestPage;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.BasePage_Driver;
import BasePage.DashboardPage_XPath;


public class Dashboard_Test extends BasePage_Driver
{
	
    @BeforeClass
    public void bc()
    {
    	BasePage_Driver.Test1 = report.createTest("DashboardPage");	
    }
    @BeforeMethod
    public void bf(Method m)
    {
    	BasePage_Driver.Test2 = BasePage_Driver.Test1.createNode(m.getName());
    	
    }
	@Test(priority =1)
	public void Valid_dashboard_admin()
	{
		DashboardPage_XPath.Click_on_Admin();
		BasePage_Driver.Test2.info("Valid_dashboard_Admin-Test 1 pass");
	}
	@Test(priority =2)
	public void Valid_dashboard_time()
	{
		DashboardPage_XPath.click_on_time();
		BasePage_Driver.Test2.info("Valid_dashboard_time-Test 2 pass");
	}
	@Test(priority =3)
	public void Valid_dashboard_leave()
	{
		DashboardPage_XPath.click_on_Leave();
		BasePage_Driver.Test2.info("Valid_dashboard_leave-Test 3 pass");
	}
}
