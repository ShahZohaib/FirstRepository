package OrangeHRM_TestPKG; 
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;
import OrangeHRM_BasePKG.Dashboard_Leave;
import OrangeHRM_BasePKG.DriverClass;
import OrangeHRM_BasePKG.LoginPage;
import dev.failsafe.internal.util.Assert;

public class TestClass {
	
	@BeforeClass
	public void openpage()
	{
		DriverClass.driver("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void EnterLoginDetails()
	{
		LoginPage.enter_id("Admin");
		String act = "Admin";
		String exp = LoginPage.user_ele().getAttribute("value");
		System.out.println(exp);
		
		LoginPage.enter_pass("admin123");
		LoginPage.enter_login();
	}
	
	@AfterClass
	public void close_Window()
	{
		DriverClass.d.quit();
	}
	
}
