package OrangeHRM_BasePKG;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Dashboard_Leave extends DriverClass {
	
	public static Actions a = new Actions(d);
	
	private static By by_search_all_icons = By.xpath("//ul[@class=\"oxd-main-menu\"]//li");
	private static By by_navbar_icons = By.xpath("//div[@class='oxd-topbar-body']//ul//li");
	private static By by_leave_text = By.xpath("//h6[text()='Leave']");
	private static By by_emp_name = By.xpath("//input[@placeholder=\"Type for hints...\"]");
	private static By by_leave_type = By.xpath("//div[@class=\"oxd-select-text-input\" and text()='-- Select --']");
	
////////////////////////////WEBELEMENTS//////////////////////////////////////////
	public static List<WebElement> all_search_icons()
	{
		return d.findElements(by_search_all_icons);
	}
	public static List<WebElement> all_navbar_icons()
	{
		return d.findElements(by_navbar_icons);
	}
	public static WebElement leave_text_visible()
	{
		return d.findElement(by_leave_text);
	}
	public static WebElement go_to_leave_type()
	{
		return d.findElement(by_leave_type);
	}
	public static WebElement go_to_emp_name_field()
	{
		return d.findElement(by_emp_name);
	}
	
//////////////////////////////////Actions///////////////////////////////////////
	public static void click_on_search_element(String ele_name)
	{
		List<WebElement> li = all_search_icons();
		for(WebElement e : li)
		{
			String s = e.getText();
			if(ele_name.equalsIgnoreCase(s))
			{
				e.click();
				break;
			}
		}
	}
	
	
	public static void click_on_navbar_element(String ele_name)	
	{
		List<WebElement> li = all_navbar_icons();
		for(WebElement e : li)
		{
			String s = e.getText();
			if(ele_name.equalsIgnoreCase(s))
			{
				e.click();
				break;
			}
		}
	}
	
	public static void click_on_leave_type()
	{
		go_to_leave_type().click();
	}
	
	public static void enter_name_emp_field(String name) throws InterruptedException
	{
		
	   go_to_emp_name_field().click();
	   
//	   go_to_emp_name_field().sendKeys(name);
//	   Thread.sleep(3000);
//	   go_to_emp_name_field().sendKeys(Keys.ARROW_DOWN );
//	   Thread.sleep(3000);
//	   go_to_emp_name_field().sendKeys(Keys.ENTER);
	}
}
