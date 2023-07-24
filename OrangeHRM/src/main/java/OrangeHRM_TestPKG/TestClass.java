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
		LoginPage.enter_pass("admin123");
		LoginPage.enter_login();
	}
	
	@Test
	public void Validate_Dashboard_Leave() throws Exception 
	{
	  Dashboard_Leave.click_on_search_element("Leave");
	//  ValidationClass.Validate_text_msg_visible(Dashboard_Leave.leave_text_visible().isDisplayed());
	////	assertEquals(Dashboard_Leave.leave_text_visible().isDisplayed(), );
		assertTrue(Dashboard_Leave.leave_text_visible().isDisplayed(), "Text visible");
//	  Dashboard_Leave.click_on_navbar_element("Assign leave");
//		
//	  Dashboard_Leave.enter_name_emp_field("Test");		
	}
	
	@AfterClass(enabled = false)
	public void close_Window()
	{
		DriverClass.d.quit();
	}
	
}
