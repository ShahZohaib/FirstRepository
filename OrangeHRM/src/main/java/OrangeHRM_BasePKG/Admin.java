package OrangeHRM_BasePKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Admin extends DriverClass {
	private static By by_admin_= By.xpath("//div[@class=\"oxd-select-text-input\"]");
	private static By click_add = By.xpath("//button[@type=\"button\" and text()=' Add ']");
	
	public static List<WebElement> all_forms()
	{
		return d.findElements(by_admin_);
	}
	public static WebElement click_on_add()
	{
		return d.findElement(click_add);
	}
	public static void click_element(String name)
	{
		List<WebElement> li = all_forms();
		for(WebElement e :li)
		{
			String s = e.getText();
			if(name.equalsIgnoreCase(s))
			{
				e.click();
				break;
			}
		}
				
	}
	public static void click_add()
	{
		click_on_add().click();
	}
	
}
