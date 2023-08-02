package TEST_PKG;

import static org.testng.Assert.*;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import QAFOX_BasePKG.DriverClass;
import QAFOX_BasePKG.LoginPage;

public class QAFOX_LoginPage_TestClass extends DriverClass
{
	@BeforeClass
	public void open_page()
	{
	 
	  Test1 = report.createTest("LoginPage_TestCases");
	}
	@BeforeMethod
	public void bm(Method m)
	
	{
   DriverClass.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		String act_ul ="https://tutorialsninja.com/demo/index.php?route=account/login";
		assertEquals(act_ul, DriverClass.p.url(),"Incorrect URL");
	    System.out.println("Test case1 Pass");	
		Test2 = Test1.createNode(m.getName());
	}
	
	@Test(priority = 1)
	public static void Validate_Login_With_Valid_Credentials() throws InterruptedException
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
	
        
//      LoginPage.click_my_account();
//      assertTrue(LoginPage.after_click_on_myAccount().isVisible(), "After click on myAccount dropdown menu right is not visible");
//        Thread.sleep(3000);
//        LoginPage.click_logout();
//        assertTrue(LoginPage.after_logout_msg().isVisible(), "Logout msg not displayed");
//        Thread.sleep(3000);
     
        Test2.info("Test 1 Pass:Logout Successful");
	}
	@Test(priority = 2)
	public void  Validate_login_with_Invalid_credentials()
	{
		LoginPage.enter_email("Admin");
		String act_email = "ztoh_india";
		assertNotEquals(act_email,LoginPage.click_email().inputValue(),"Invalid Email is required");
		
		LoginPage.enter_pass("Admin1234");
		String act_pass="ztoh_india";
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Pass is required");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with invalid credentials");		
	  
	    Test2.warning("Login Failed");

	    Test2.info("Test 2 Pass");
	}
	@Test(priority = 3)
	public void validate_login_with_valid_user_and_invalid_password()
	{
	    LoginPage.enter_email("ztoh@gmail.com");
		String act_email = "ztoh@gmail.com";
		assertEquals(act_email, LoginPage.click_email().inputValue()," Invalid Email Id");
		
		LoginPage.enter_pass("Admin1234");
		String act_pass="ztoh_india";
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Invalid Pass");
		Test2.info("Invalid Password");
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with invalid credentials");		
		
		Test2.warning("Login Failed");

		 Test2.info("Test 3 Pass");
	}
	@Test(priority = 4)
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
		Test2.warning("Login Failed");
	
		 Test2.info("Test 4 Pass");
	}
	@Test(priority = 5)
	public void validate_login_empty_user_empty_password()
	{ 
		LoginPage.enter_email(" ");
		String act_email = "ztoh@gmail.com";
		assertNotEquals(act_email, LoginPage.click_email().inputValue()," Empty Email Id");
		
		LoginPage.enter_pass(" ");
		String act_pass="ztoh_india";
		System.out.println(LoginPage.click_pass().inputValue());
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Empty Password Required");
		
		LoginPage.enter_login();
		Test2.warning("Login Failed");
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with Empty credentials");
		Test2.info("Test5:Login With Empty Credetentials Pass");
	}
	@Test(priority = 6)
	public void Validate_login_with_valid_user_empty_password()
	{
		LoginPage.enter_email("ztoh@gmail.com");
		String act_email = "ztoh@gmail.com";
		assertEquals(act_email, LoginPage.click_email().inputValue()," Invalid Email Id");
		
		LoginPage.enter_pass(" ");
		String act_pass="ztoh_india";
		System.out.println(LoginPage.click_pass().inputValue());
		assertNotEquals(act_pass,LoginPage.click_pass().inputValue(),"Empty Password Required");
		
		LoginPage.enter_login();
		assertTrue(LoginPage.after_click_login_with_invalid_data().isVisible(),"Test failed with Empty password");
		Test2.warning("Login Failed");
		
		Test2.info("Test6: Valid username and empty password");
	}
	
	
	@AfterMethod
	public void close_window()
	{
		DriverClass.p.close();
	}
	
}
