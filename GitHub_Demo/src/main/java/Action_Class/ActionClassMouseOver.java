package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Main.DriverClass;

public class ActionClassMouseOver extends DriverClass{
	
	public static void main(String[] args) 
	{
	    driver("https://www.orangehrm.com/");
		Actions a = new Actions(d);
		By res = By.xpath("//a[text()='Resources']");
		WebElement r = d.findElement(res);
		
		By ebook = By.xpath("//li[@class=\"sub-menu-title menu-title-row pt-2 pb-2\"]//a[text()='eBooks']");
		WebElement e = d.findElement(ebook);
			
		a.moveToElement(r).perform();
		a.click(e).perform();
		
	
		d.close();
	}
}
