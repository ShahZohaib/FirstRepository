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
		er = report.createTest("LoginPage");
	}
	@BeforeMethod
	public void bf(Method m)
	{
		e= er.createNode(m.getName());
	}
	
	public static void Enter_User_name()
	{
		e.info("User name entered successfully");
	}
	
	public static void Enter_password()
	{
		e.info("Password Entered successfully");
	}
	
	public static void Enter_login()
	{
		e.info("Login Button clicked successfully");
	}
}
