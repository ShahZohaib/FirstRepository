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
	
	@BeforeMethod 
	public void EnterLoginDetails()
	{
		LoginPage.enter_id("Admin");
		String act = "Admin";
		String exp = LoginPage.user_ele().getAttribute("value");
		System.out.println(exp);
		LoginPage.enter_pass("admin123");
		LoginPage.enter_login();
	}
	
	@Test
	public void Validate_Dashboard_Leave() throws Exception 
	{
	Dashboard_Leave.click_on_search_element("Leave");
	assertTrue(Dashboard_Leave.leave_text_visible().isDisplayed(), "Leave Text Not Displayed");
	
    Dashboard_Leave.click_on_navbar_element("Assign leave");
    assertTrue(Dashboard_Leave.check_assign_leave_text().isDisplayed(), "Assign Text Not Displayed");
    
    
//	  Dashboard_Leave.enter_name_emp_field("Test");		
	}
	
	@AfterClass
	public void close_Window()
	{
		DriverClass.d.quit();
	}
	
}
