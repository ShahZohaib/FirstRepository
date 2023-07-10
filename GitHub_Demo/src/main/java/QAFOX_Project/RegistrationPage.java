package QAFOX_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends DriverClass{
	private static By first_name = By.xpath("//input[@name='firstname']");
	private static By last_name = By.xpath("//input[@name='lastname']");
	private static By email = By.xpath("//input[@name='email']");
	private static By telephone = By.xpath("//input[@name='telephone']");
	private static By password = By.xpath("//input[@name='password']");
	private static By confirm_pass = By.xpath("//input[@name='confirm']");
	private static By check_box = By.xpath("//input[@type='checkbox']");
	private static By submit = By.xpath("//input[@type='submit']");
	
///Webelements
	public static WebElement click_first_name()
	{
		return d.findElement(first_name);
	}
	
	public static WebElement click_last_name()
	{
		return d.findElement(last_name);
	}
	
	public static WebElement click_on_email()
	{
		return d.findElement(email);
	}
	public static WebElement click_on_telephone()
	{
		return d.findElement(telephone);
	}
	public static WebElement click_on_password()
	{
		return d.findElement(password);
	}
	public static WebElement click_on_confirm_pass()
	{
		return d.findElement(confirm_pass);
	}
	public static WebElement click_on_checkbox()
	{
		return d.findElement(check_box);
	}
	public static WebElement click_on_submit()
	{
		return d.findElement(submit);
	}
//Action Methods
	public static void Enter_First_name(String Fname)
	{
		click_first_name().click();
		click_first_name().sendKeys(Fname);
	}
	public static void Enter_last_name(String Lname)
	{
		click_last_name().click();
		click_last_name().sendKeys(Lname);
	}
	public static void enter_email(String id)
	{
		click_on_email().click();
		click_on_email().sendKeys(id);
	}
	
	public static void enter_number(String num)
	{
		click_on_telephone().click();
		click_on_telephone().sendKeys(num);
	}
	public static void enter_pass(String password)
	{
		click_on_password().click();		
	}
	public static void enter_pass_again(String password)
	{
		click_on_confirm_pass().click();		
	}
	public static void select_checkbox()
	{
		click_on_checkbox().click();
	}
	public static void Click_on_Submit_box()
	{
		click_on_submit().click();
	}
}
