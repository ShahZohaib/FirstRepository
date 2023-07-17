package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Main.DriverClass;

public class ActionClassMouseOver extends DriverClass{
	@BeforeMethod
	public void OpenPage()
	{
		 driver("https://www.orangehrm.com/");
	}
	@Test
	public static void mouseover() 
	{   
		Actions a = new Actions(d);
		By res = By.xpath("//a[text()='Resources']");
		WebElement r = d.findElement(res);
		
		By ebook = By.xpath("//li[@class=\"sub-menu-title menu-title-row pt-2 pb-2\"]//a[text()='eBooks']");
		WebElement e = d.findElement(ebook);
			
		a.moveToElement(r).perform();
		a.click(e).perform();
	}
	
	@AfterMethod
	public void close_page()
	{
		d.close();
	}
}
