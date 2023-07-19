package QAFOX_Project_XPATH_PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import QAFOX_Project_Driver_PKG.DriverClass;

public class Login extends DriverClass{
	private static By email = By.xpath("//input[@id='input-email']");
	private	static By password = By.xpath("//input[@id='input-password']");
	private	static By Login = By.xpath("//input[@type='submit']");
	private	static By Invalid_or_Empty__Field = By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']");
	private static By my_account = By.xpath("//span[text()='My Account']");
	private static By logout =By.xpath("//a[text()='Logout']");

	
	////WebElements
	public static WebElement Click_On_Email_Box()
	{
		return d.findElement(email);
	}

	public static WebElement Click_on_Password_Box()
	{
		return d.findElement(password);
	}
	public static WebElement Click_On_Login()
	{
		return d.findElement(Login);
	}
	
	public static WebElement On_Login_Click_invalid_empty_field_Msg()
	{
		return d.findElement(Invalid_or_Empty__Field);
	}
	
	 public static WebElement go_to_logout()
	    {
	    	return d.findElement(logout);
	    }
	 public static WebElement Go_to_MyAccount()
		{
			return d.findElement(my_account);
		}
	 
	 ////////////Actions
	 public static void Enter_Email_id(String mail)
		{
			Click_On_Email_Box().click();
			 
			Click_On_Email_Box().sendKeys(mail);		
		}
		public static void Enter_password(String pass)
		{
		  Click_on_Password_Box().click();
		  Click_on_Password_Box().sendKeys(pass);
		}
		public static void Submit_Login()
		{
			Click_On_Login().submit();
		}
		 public static void click_on_logout()
		 {
			 go_to_logout().click();
		 }
		 public static void click_on_myaccount()
		 {
			 Go_to_MyAccount().click();
		 }


}
