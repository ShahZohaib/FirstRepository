package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassClick 
{
	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		Actions a = new Actions(d);
		
		d.get("https://mousetester.com");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();
		
		By click_mouse= By.xpath("//div[@id=\"clickMe\"]");
		WebElement click = d.findElement(click_mouse);
		
		//click.click();
		a.doubleClick(click).perform();
		a.contextClick(click).perform();
		d.close();
	}
}
