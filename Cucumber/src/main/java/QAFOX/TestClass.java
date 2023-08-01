package QAFOX;

import org.testng.annotations.*;

public class TestClass {
	@BeforeClass
	public void openLogin()
	{
		DriverClass.driver("");
	}
	@Test
	public void enter_login_details()
	{
		Login.Enter_Email_id("ztoh@gmail.com");
		
		Login.Enter_password("ztoh_india");
		
		Login.Submit_Login();
	}
	@AfterClass
	public void close_window()
	{
		DriverClass.d.quit();
	}

}
