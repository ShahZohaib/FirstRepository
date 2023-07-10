package QAFOX_Project;

import org.testng.annotations.*;

public class LoginPageTestClass 
{
	@BeforeMethod
	public void OpenLoginPage()
	{
		DriverClass.driver();
	}
	
	@Test
	public void Login_and_validate_components() throws InterruptedException
	{
		LoginPage.Enter_Email_id("ztoh@gmail.com");
		LoginPage.Enter_password("ztoh_india");
		LoginPage.Submit_Login();
		LoginPage.Click_on_components();
		LoginPage.Click_on_monitors();
		LoginPage.Click_on_select_Box("Price (High > Low)");
		LoginPage.Click_AddTo_Cart();
		Thread.sleep(3000);
		LoginPage.click_items();
		LoginPage.click_on_view_cart();
	}
}
