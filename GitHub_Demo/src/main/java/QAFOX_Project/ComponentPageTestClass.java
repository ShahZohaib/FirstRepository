package QAFOX_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class ComponentPageTestClass 
{
	@BeforeClass
	public void OpenLoginPage()
	{
		DriverClass.driver();
	}
	@BeforeMethod
	public void Enter_LoginDetails()
	{
		LoginPage.Enter_Email_id("ztoh@gmail.com");
		
		LoginPage.Enter_password("ztoh_india");
		
		LoginPage.Submit_Login();
	}
	@Test
	public void Login_and_validate_components() throws Exception
	{
		
		LoginPage.Click_on_components();
		QAFOX_Validation.Validate_Data(LoginPage.Go_To_Component().isEnabled());
		LoginPage.Click_any_Component("Monitors (2)");
		QAFOX_Validation.Check_msg_displayed(LoginPage.monitor_msg().isDisplayed());
		
		LoginPage.Click_on_select_Box("Price (High > Low)");
		
		LoginPage.Select_item();
		QAFOX_Validation.Check_img_displayed(LoginPage.Check_img_Displayed().isDisplayed());
		LoginPage.Enter_Quantity("2");
		String actual_value = "2";
		String exp_value=LoginPage.Select_Quantity().getAttribute("value");
		QAFOX_Validation.check_equal(actual_value, exp_value);
//		LoginPage.Click_AddTo_Cart();
//		Thread.sleep(3000);
//		LoginPage.click_items();
//		LoginPage.click_on_view_cart();
		
		
	}
//	@AfterMethod
//	public void logout()
//	{
//		LoginPage.click_on_myaccount();
//		LoginPage.click_on_logout();
//	}
//	@AfterClass
//	public void closewindow()
//	{
//		DriverClass.d.quit();
//	}
	
}
