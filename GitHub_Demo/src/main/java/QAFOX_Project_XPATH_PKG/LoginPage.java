package QAFOX_Project_XPATH_PKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import JavaScriptExcutor.JavaScriptExecutorClass;
import QAFOX_Project_Driver_PKG.DriverClass;

public class LoginPage extends DriverClass
{
	static Select s;
	static JavascriptExecutor js= (JavascriptExecutor)d;
	
	private static By email = By.xpath("//input[@id='input-email']");
	private	static By password = By.xpath("//input[@id='input-password']");
	private	static By Login = By.xpath("//input[@type='submit']");
	private	static By Invalid_or_Empty__Field = By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']");
//	private static By components = By.xpath("//a[@class='dropdown-toggle' and text()='Components']");
//	private static By monitors = By.xpath("//li//a[text()='Monitors (2)']");
	private static By select_class = By.xpath("//select[@id='input-sort']");
//	private static By laptop = By.xpath("//li//a[@class='dropdown-toggle' and text()='Laptops & Notebooks']");
	private static By all_components = By.xpath("//li[@class='dropdown open']//div[@class='dropdown-menu']//ul//li");
	private static By add_to_cart = By.xpath("//button[text()='Add to Cart']");
	private static By cart_items = By.xpath("//button[@type='button']//span[@id='cart-total']");
	private static By view_cart = By.xpath("//strong[text()='View Cart']");
	private static By my_account = By.xpath("//span[text()='My Account']");
	private static By logout =By.xpath("//a[text()='Logout']");
	private static By nav_bar = By.xpath("//ul[@class=\"nav navbar-nav\"]//li");
	private static By monitos_text = By.xpath("//h2[text()='Monitors']");
	private static By success = By.xpath("//div[text()='Success: You have added ']");
	private static By item = By.xpath("//div[@class=\"caption\"]//a[text()='Samsung SyncMaster 941BW']");
	private static By Check_img = By.xpath("//a[@title=\"Samsung SyncMaster 941BW\"]");
	private static By quantity = By.xpath("//input[@name=\"quantity\"]");
	
///WebElement Methods	
	
	public static List<WebElement> all_components_details()
	{
		
		return d.findElements(all_components);	
	}
	
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

    public static WebElement select_box()
    {
    	return d.findElement(select_class);
    }
    public static WebElement select_add_to_cart()
    {
    	return d.findElement(add_to_cart);
    }
    public static WebElement Go_to_items()
    {
    	return d.findElement(cart_items);
    }
    public static WebElement go_to_view_cart()
    {
    	return d.findElement(view_cart);
    }
    
    public static WebElement Go_to_MyAccount()
	{
		return d.findElement(my_account);
	}
    public static WebElement go_to_logout()
    {
    	return d.findElement(logout);
    }
    public static WebElement monitor_msg()
    {
    	return d.findElement(monitos_text);
    }
    public static WebElement success_msg()
    {
    	return d.findElement(success);
    }
    public static WebElement Click_Item()
    {
    	return d.findElement(item);
    }
    public static WebElement Check_img_Displayed()
    {
    	return d.findElement(Check_img);
    }
    public static WebElement Select_Quantity()
    {
    	return d.findElement(quantity);
    }
    public static List<WebElement> all_nav_names()
    {
    	return d.findElements(nav_bar);
    }
//////////////////////////////////////Actions///////////////////////////////
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
	
	    
	
	 
	 public static void Click_on_select_Box(String text)
	    {
	   s = new Select(select_box());
	    select_box().click();
	    s.selectByVisibleText(text);      	
	    }
	 public static void Click_AddTo_Cart()
	 {
		 js.executeScript("window.scrollBy(0,400)", "");
		 select_add_to_cart().click();
	 }
	 public static void click_items()
	 {
		 Go_to_items().click();
	 }
	 public static void click_on_view_cart()
	 {
		 go_to_view_cart().click();
	 }
	 public static void click_on_myaccount()
	 {
		 Go_to_MyAccount().click();
	 }
	 public static void click_on_logout()
	 {
		 go_to_logout().click();
	 }
	 public static void Click_any_Component(String enter_comp)
		{
//			String s[]={"Mice and Trackballs (0)","Monitors (2)","Printers (0)","Scanners (0)","Web Cameras (0)"};
			List<WebElement> li=all_components_details();
			for(WebElement ele :li )
			{
				String s = ele.getText();
				if(enter_comp.equals(s))
				{
			         ele.click();
			         break;
				}
			}
		}
	 public static void Select_item()
	 {
		
		 js.executeScript("window.scrollBy(0,400)", "");
		 Click_Item().click();
	 }
	 public static void Enter_Quantity(String num)
	 {
		 
		 Select_Quantity().click();
		 Select_Quantity().clear();
		 Select_Quantity().sendKeys(num);
	 }
	public static void Click_any_nav_element(String ele)
	{
		List<WebElement> li = all_nav_names();
		for(WebElement e : li)
		{
			String s = e.getText();
			if(ele.equals(s))
			{
		         e.click();
		         break;
			}
		}
	}
	
}
