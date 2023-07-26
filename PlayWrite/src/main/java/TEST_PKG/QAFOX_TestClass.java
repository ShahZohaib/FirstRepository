package TEST_PKG;

import org.testng.annotations.*;
import QAFOX_BasePKG.DriverClass;
import QAFOX_BasePKG.LoginPage;

public class QAFOX_TestClass 
{
	@BeforeClass
	public void open_page()
	{
		DriverClass.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
//		String act_ul ="https://tutorialsninja.com/demo/index.php?route=account/login";
//		Assert.assertEquals(act_ul, DriverClass.p.url(),"Incorrect URL");
//		System.out.println("Correct URL");
	}
	@Test
	public void Enter_Login_Detail()
	{
		LoginPage.enter_email("ztoh@gmail.com");
		
	
		LoginPage.enter_pass("ztoh_india");
		
		LoginPage.enter_login();
		
		System.out.println("Login Successful");
	}
	@AfterClass
	public void close_window()
	{
		DriverClass.p.close();
	}
	
}
