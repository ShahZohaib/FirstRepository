package QAFOX_BasePKG;

import com.microsoft.playwright.Locator;

public class LoginPage extends DriverClass{
//selector	
	private static final String email = "//input[@id='input-email']";
	private	static final String password = "//input[@id='input-password']";
	private	static final String Login = "//input[@type='submit']";
//	private	static String Invalid_or_Empty__Field = "//div[text()='Warning: No match for E-Mail Address and/or Password.']";
//	private static String my_account = "//span[text()='My Account']";
//	private static String logout ="//a[text()='Logout']";
	
//////////for validation	
	private static final String after_login_msg = "//div[@id='content']";
	private static final String warning_msg = "//div[text()='Warning: No match for E-Mail Address and/or Password.']";
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
 //////////validation method 
  public static Locator after_login_accont_detail()
  {
	  return p.locator(after_login_msg);
  }
  public static Locator after_click_login_with_invalid_data()
  {
	  return p.locator(warning_msg);
  }
  //action
  public static void enter_email(String email)
  {
	  click_email().click();
	  click_email().type(email);
  }
  public static void enter_pass(String pass)
  {
	  click_pass().click();
	  click_pass().type(pass);
  }
  public static void enter_login()
  {
	  click_login().click();
  }
  

}
