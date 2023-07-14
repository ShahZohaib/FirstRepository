package Action_Class;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import Main.DriverClass;

public class ActionClassClick extends DriverClass
{
	public static void main(String[] args) 
	{
		driver("https://mousetester.com");
		Actions a = new Actions(d);
		
		
		By click_mouse= By.xpath("//div[@id=\"clickMe\"]");
		WebElement click = d.findElement(click_mouse);
		
		//click.click();
		a.doubleClick(click).perform();
		a.contextClick(click).perform();
		d.close();
		
	}
}
