package TestClasses;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.*;

import Base_PKG.DriverClass;
import Base_PKG.OrangeHRM_LoginPage;

public class OrangeHRM_TestCases extends DriverClass 
{
	@BeforeClass
	public void bc()
	{
		test1= report.createTest("Login Test Cases");
	}
	@BeforeMethod
	public void bm(Method m)
	{
		DriverClass.open_Driver("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String act_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(act_url, d.getCurrentUrl(),"Wrong Login Page");
		
		test2 = test1.createNode(m.getName());
	}
	
	@Test
	public void Validate_With_Vaild_Credentials()
	{
		OrangeHRM_LoginPage.enter_id("Admin");
		String act_user = "Admin";
		Assert.assertEquals(act_user,OrangeHRM_LoginPage.user_ele().getAttribute("value"),"Invalid user name");
		
		OrangeHRM_LoginPage.enter_pass("admin123");
		String act_pass = "admin123";
		Assert.assertEquals(act_pass,OrangeHRM_LoginPage.pass_ele().getAttribute("value"),"Invalid Password");

		OrangeHRM_LoginPage.enter_login();
		Assert.assertTrue(OrangeHRM_LoginPage.check_icons_Displayed().isDisplayed(), "Login Failed");
		test2.info("Icons Displayed after login");
		
		test2.info("Login Successful");
	}
	@Test
	public void Validate_invalid_credentials()
	{
		OrangeHRM_LoginPage.enter_id("user");
		String act_user = "Admin";
		Assert.assertNotEquals(act_user,OrangeHRM_LoginPage.user_ele().getAttribute("value"),"Something went wrong:Login should fail");
		
		OrangeHRM_LoginPage.enter_pass("user123");
		String act_pass = "admin123";
		Assert.assertNotEquals(act_pass,OrangeHRM_LoginPage.pass_ele().getAttribute("value"),"Something went wrong:Login should fail");

		OrangeHRM_LoginPage.enter_login();
		Assert.assertTrue(OrangeHRM_LoginPage.invalid_message().isDisplayed(),"Login successful with invalid credentials");
		
		test2.info("Login Failed: Test Pass");
	}
	@AfterMethod
	public void close_Window()
	{
		d.close();
	}
}

