package BasePage;

import java.lang.reflect.Method;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

public class LoginPage_XPaths extends BasePage_Driver
{	

    
	@BeforeClass
	public void bc()
	{
		Test1 = report.createTest("LoginPage");
	}
	@BeforeMethod
	public void bf(Method m)
	{
		Test2= Test1.createNode(m.getName());
	}
	
	public static void Enter_User_name()
	{
		Test2.info("User name entered successfully");
	}
	
	public static void Enter_password()
	{
		Test2.info("Password Entered successfully");
	}
	
	public static void Enter_login()
	{
		Test2.info("Login Button clicked successfully");
	}
}
