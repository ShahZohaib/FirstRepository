package OrangeHRM_BasePKG;

import java.lang.reflect.Method;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class LoginPage extends DriverClass {
	
static	By user_id = By.xpath("//input[@name='username']");
static	By pass = By.xpath("//input[@name='password']");
static	By submit = By.xpath("//button[@type='submit']");
static	By click_icon = By.xpath("//span[@class='oxd-userdropdown-tab']");
static	By logout = By.xpath("//a[text()='Logout']");
static	By search = By.xpath("//textarea[@class='gLFyf']");
static	By link = By.xpath("//h3[text()='OrangeHRM Demo.']");
static	By forget_pass= By.xpath("//p[text()='Forgot your password? ']");
static	By invalid_msg = By.xpath("//p[text()='Invalid credentials']");
static	By required_msg = By.xpath("//span[text()='Required' and @class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
	

       @BeforeClass
    public void bc()
    {
    	   Test1 = report.createTest("OrangeHRM_LoginXpath");
    }
       @BeforeMethod
       public void bf(Method m)
       {
    	   Test2 = Test1.createNode(m.getName());
       }

	public static WebElement user_ele()
	{
		WebElement user = d.findElement(user_id);
		return  user;		
	}
	public static void enter_id(String getid)
	{
		user_ele().click();
		user_ele().sendKeys(getid);	
		Test2.info("UserName Entered Successfully");
		
	}	
	public static WebElement pass_ele()
	{
		WebElement password = d.findElement(pass);
		return password;		
	}
	public static void enter_pass(String getpass)
	{
		pass_ele().click();
		pass_ele().sendKeys(getpass);	
		Test2.info("Password Entered Successfully");
	}
	public static WebElement login_ele()
	{
		WebElement login = d.findElement(submit);
		return login;		
	}
	public static void enter_login()
	{
	  login_ele().click();	
	  Test2.info("Login Button Entered Successfully");
	}
	
	public static WebElement icon()
	{
		WebElement ic = d.findElement(click_icon);
		return ic;
	}
	
	public static void select_icon()
	{
		icon().click();
	}
	
	public static WebElement log()
	{
		WebElement l = d.findElement(logout);
		return l;
	}
	
	public static void click_logout()
	{
		log().click();
	}
	
	public static WebElement search_box()
	{
		WebElement ser = d.findElement(search);
		return ser;
	}
	
	public static void click_search()
	{
		search_box().sendKeys("https://opensource-demo.orangehrmlive.com/");
		search_box().submit();
	}
	
	public static WebElement click_link() {
		WebElement click = d.findElement(link);
		return click;
	}
	
	public static void link_action()
	{
		
		click_link().click();
	}
	
	public static WebElement forget()
	{
		WebElement fp = d.findElement(forget_pass);
		return fp;
	}
	
	public static void click_forget_pass()
	{
		forget().click();
	}
	
	public static WebElement invalid_message()
	{
		WebElement msg = d.findElement(invalid_msg);
		return msg;
	}
	
	public static WebElement required_message()
	{
		WebElement msg = d.findElement(required_msg);
		return msg;
	}
}
