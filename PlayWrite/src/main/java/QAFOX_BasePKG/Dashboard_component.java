package QAFOX_BasePKG;

import java.util.List;


import com.microsoft.playwright.Locator;

public class Dashboard_component extends DriverClass
{
///selector	
	private static final String by_nav_bar = "//ul[@class='nav navbar-nav']//li";
	private static final String by_all_components = "//li[@class='dropdown open']//div[@class='dropdown-menu']//ul//li";
///selector validation
	private static final String by_all_comp_dropdown = "//li[@class=\"dropdown open\"]//div[@class=\"dropdown-menu\"]";
	private static final String by_monitor_text = "//h2[text()='Monitors']";
//locator	
	public static List<Locator> all_nav_elements()
	{
		return p.locator(by_nav_bar).all() ;
		 
	}
	public static List<Locator> all_comp_ele()
	{
		return p.locator(by_all_components).all();
	}
//loc val
	public static Locator all_components_box()
	{
		return p.locator(by_all_comp_dropdown);
	}
	public static Locator monitor_page_visible()
	{
		return p.locator(by_monitor_text);
	}
///action
	public static void click_nav_ele(String ele)
	{
		List<Locator> li = all_nav_elements();
		for(Locator loc:li)
		{
		  String e = loc.innerText();
		 
		  if(ele.equals(e))
		  {
			  loc.click();
			  break;
		  }
		}
	}
	public static void click_comp_ele(String ele)
	{
		List<Locator> li = all_comp_ele();
		for(Locator loc:li)
		{
			String e = loc.innerText();
			if(ele.equals(e))
			{
				loc.click();
				break;
			}
		}
	}
	
}