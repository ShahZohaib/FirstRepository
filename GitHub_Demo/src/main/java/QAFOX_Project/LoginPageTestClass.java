package QAFOX_Project;

import org.testng.annotations.*;

public class LoginPageTestClass 
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
	public void Login_and_validate_components() throws InterruptedException
	{
		
		LoginPage.Click_on_components();
		LoginPage.Click_on_monitors();
		LoginPage.Click_on_select_Box("Price (High > Low)");
		LoginPage.Click_AddTo_Cart();
		Thread.sleep(3000);
		LoginPage.click_items();
		LoginPage.click_on_view_cart();
		
		
	}
	@AfterMethod
	public void logout()
	{
		LoginPage.click_on_myaccount();
		LoginPage.click_on_logout();
	}
	@AfterClass
	public void closewindow()
	{
		DriverClass.d.quit();
	}
	
}
