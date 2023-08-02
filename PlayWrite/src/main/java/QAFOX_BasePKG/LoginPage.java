package QAFOX_BasePKG;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Locator;

public class LoginPage extends DriverClass{
	
	@BeforeClass
	public void bc()
	{
		Test1 = report.createTest("Login_Xpath");
	}
	@BeforeMethod
	public void bm(Method m)
	{
		Test2 = Test1.createNode(m.getName());
	}
	
	
	
	
//selector	
	private static final String email = "//input[@id='input-email']";
	private	static final String password = "//input[@id='input-password']";
	private	static final String Login = "//input[@type='submit']";
	private static final String my_account = "//span[text()='My Account']";
	private static final String logout ="//a[text()='Logout']";
	
//////////for validation	
	private static final String after_login_msg = "//div[@id='content']";
	private static final String warning_msg = "//div[text()='Warning: No match for E-Mail Address and/or Password.']";
	private static final String by_myAccount_details = "//ul[@class='dropdown-menu dropdown-menu-right']";
	private static final String by_after_logout_msg = "//div[@id=\"content\"]//p[text()='You have been logged off your account. It is now safe to leave the computer.']";
	
/////locator
	
  public static Locator click_email()
  {
	  return p.locator(email);
  }
  public static Locator click_pass()
  {
	  return p.locator(password);
  }
  public static Locator click_login()
  {
	  return p.locator(Login);
  }
  public static Locator go_my_account()
  {
	  return p.locator(my_account);
  }
  public static Locator move_to_logout()
  {
	  return p.locator(logout);
  }
 //////////validation method 
  public static Locator after_login_accont_detail()
  {
	  return p.locator(after_login_msg);
  }
  public static Locator after_click_login_with_invalid_data()
  {
	  return p.locator(warning_msg);
  }
  public static Locator after_click_on_myAccount()
	{
		return p.locator(by_myAccount_details);
	}
  public static Locator after_logout_msg()
  {
	  return p.locator(by_after_logout_msg);
  }
  //action
  public static void enter_email(String email)
  {
	  click_email().click();
	  click_email().type(email);
	  Test2.info("Email id entered successfully");
  }
  public static void enter_pass(String pass)
  {
	  click_pass().click();
	  click_pass().type(pass);
	  Test2.info("Password entered successfully");

  }
  public static void enter_login()
  {
	  click_login().click();
	  Test2.info("Login Button Clicked successfully");

  }
  public static void click_my_account()
  {
	  go_my_account().click();
  }
  public static void click_logout()
  {
	  move_to_logout().click();
  }
  

}
