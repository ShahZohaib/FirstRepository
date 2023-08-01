package TEST_PKG;

import static org.testng.Assert.*;

import org.testng.annotations.*;

import QAFOX_BasePKG.Dashboard_component;
import QAFOX_BasePKG.DriverClass;
import QAFOX_BasePKG.LoginPage;

public class QAFOX_TestClass 
{
	@BeforeMethod
	public void open_page()
	{
	 DriverClass.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		String act_ul ="https://tutorialsninja.com/demo/index.php?route=account/login";
		assertEquals(act_ul, DriverClass.p.url(),"Incorrect URL");
	    System.out.println("Test case1 Pass");	
	}
	
	@Test(priority = 1,enabled=false)
	public void Validate_Login_With_Valid_Credentials() throws InterruptedException
	{
		
		LoginPage.enter_email("ztoh@gmail.com");
		
		String act_email = "ztoh@gmail.com";
		assertEquals(act_email, LoginPage.click_email().inputValue()," Invalid Email Id");
	
		LoginPage.enter_pass("ztoh_india");
		String act_pass="ztoh_india";
		assertEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Password");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_login_accont_detail().isVisible(),"After Login Account Details Account Data not visible");
		Thread.sleep(3000);
		Dashboard_component.click_nav_ele("Components");
		assertTrue(Dashboard_component.all_components_box().isVisible(),"Component dropdown details not visible");
		
		Thread.sleep(3000);

        Dashboard_component.click_comp_ele("Monitors (2)");
        Thread.sleep(3000);
        assertTrue(Dashboard_component.monitor_page_visible().isVisible(),"Monitor Page not visible");
        Thread.sleep(3000);
        
      LoginPage.click_my_account();
      assertTrue(LoginPage.after_click_on_myAccount().isVisible(), "After click on myAccount dropdown menu right is not visible");
        Thread.sleep(3000);
        LoginPage.click_logout();
        assertTrue(LoginPage.after_logout_msg().isVisible(), "Logout msg not displayed");
        Thread.sleep(3000);
        System.out.println("Test 1 Pass:Logout Successful");
	}
	@Test(priority = 2,enabled=false)
	public void Validate_login_with_Invalid_credentials()
	{
		LoginPage.enter_email("Admin");
		String act_email = "ztoh_india";
		assertNotEquals(act_email,LoginPage.click_email().inputValue(),"Invalid Email is required");
		
		LoginPage.enter_pass("Admin1234");
		String act_pass="ztoh_india";
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Pass is required");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with invalid credentials");		
	    System.out.println("Test 2 pass");
	}
	@Test(enabled=false)
	public void validate_login_with_valid_user_and_invalid_password()
	{
	    LoginPage.enter_email("ztoh@gmail.com");
		String act_email = "ztoh@gmail.com";
		assertEquals(act_email, LoginPage.click_email().inputValue()," Invalid Email Id");
		
		LoginPage.enter_pass("Admin1234");
		String act_pass="ztoh_india";
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Pass");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with invalid credentials");		
		System.out.println("Test 3 pass");
	}
	@Test
	public void validate_login_with_invalid_user_and_valid_password()
	{
	    LoginPage.enter_email("Admin");
		String act_email = "ztoh@gmail.com";
		assertNotEquals(act_email, LoginPage.click_email().inputValue()," Invalid Email Id");
		
		LoginPage.enter_pass("ztoh_india");
		String act_pass="ztoh_india";
		assertEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Pass");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with invalid credentials");		
		System.out.println("Test 3 pass");
	}
	
	
	@AfterMethod
	public void close_window()
	{
		DriverClass.p.close();
	}
	
}
