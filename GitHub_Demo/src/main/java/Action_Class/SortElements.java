package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import Main.DriverClass;

public class SortElements extends DriverClass{
	
	@BeforeMethod
	public void OpenPage()
	{
		driver("https://demoqa.com/selectable");
	}
	
	@Test
	public void Elements() throws InterruptedException
	{
		Actions a = new Actions(d);
		WebElement list = d.findElement(By.xpath("//ul[@id=\"verticalListContainer\"]//li[4]"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,200)", "");
		a.moveToElement(list).click().perform();
		
//		WebElement grid = d.findElement(By.xpath("//a[@id=\"demo-tab-grid\"]"));
//		grid.click();
//		
//		WebElement num1 = d.findElement(By.xpath("//div[@id=\"row1\"]//li[2]"));
//		num1.click();
		
	}
	
}
