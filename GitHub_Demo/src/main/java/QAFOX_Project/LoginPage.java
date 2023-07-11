package QAFOX_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends DriverClass
{
	private static By email = By.xpath("//input[@id='input-email']");
	private	static By password = By.xpath("//input[@id='input-password']");
	private	static By Login = By.xpath("//input[@type='submit']");
	private	static By Invalid_or_Empty__Field = By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']");
	private static By components = By.xpath("//a[@class='dropdown-toggle' and text()='Components']");
	private static By monitors = By.xpath("//li//a[text()='Monitors (2)']");
	private static By select_class = By.xpath("//select[@id='input-sort']");
	private static By laptop = By.xpath("//li//a[@class='dropdown-toggle' and text()='Laptops & Notebooks']");
	public static By all_components = By.xpath("//li[@class='dropdown open']//div[@class='dropdown-menu']");
	private static By add_to_cart = By.xpath("//button[@onclick=\"cart.add('33', '1');\"]//span[text()='Add to Cart']");
	private static By cart_items = By.xpath("//button[@type='button']//span[@id='cart-total']");
	private static By view_cart = By.xpath("//strong[text()='View Cart']");
	private static By my_account = By.xpath("//span[text()='My Account']");
	private static By logout =By.xpath("//a[text()='Logout']");
	
///WebElement Methods	
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
	
	public static WebElement Go_To_Component()
    {
     return d.findElement(components);
    }
   
    public static WebElement select_monitor()
    {
    	return d.findElement(monitors);
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
////Actions	
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
	 public static void Click_on_components()
	    {
		 Go_To_Component().click();
	    }
	    
	 public static void Click_on_monitors()
	    {
	    	select_monitor().click();
	    }
	 
	 public static void Click_on_select_Box(String text)
	    {
	   	Select s = new Select(select_box());
	    select_box().click();
	    s.selectByVisibleText(text);      	
	    }
	 public static void Click_AddTo_Cart()
	 {
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
}
