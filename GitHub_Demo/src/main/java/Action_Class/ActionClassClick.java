package Action_Class;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Main.DriverClass;

public class ActionClassClick extends DriverClass
{
	@BeforeMethod
	public void OpenPage()
	{
		driver("https://mousetester.com");
	}
	@Test
	public static void action_click() 
	{
		
		Actions a = new Actions(d);
		
		
		By click_mouse= By.xpath("//div[@id=\"clickMe\"]");
		WebElement click = d.findElement(click_mouse);
		
		//click.click();
		a.doubleClick(click).perform();
		a.contextClick(click).perform();
		
	}
	@AfterMethod
	public void close_page()
	{
		d.close();
	}
}
