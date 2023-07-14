package JavaScriptExcutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import Main.DriverClass;


public class JavaScriptExecutorClass extends DriverClass{
	
	@BeforeMethod
	public void OpenPage()
	{
		driver("https://www.amazon.in/");
	}
	
	@Test
	public static void javascript_executor() 
	{
		
		
		By amazon = By.xpath("//input[@id='twotabsearchtextbox']");		
		WebElement deal = d.findElement(amazon);		
		deal.sendKeys("Casual men shoes");		
		
		By ser = By.xpath("//input[@id='nav-search-submit-button']");
		WebElement search = d.findElement(ser);
		search.click();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,450)", "");
		
		
		By sel_shoe = By.xpath("//img[@alt=\"ASIAN Men's Wonder-13 Sports Running Shoes\"]");
		WebElement click_shoe = d.findElement(sel_shoe);
		click_shoe.click();
		
	}
	@AfterMethod
	public void close_page()
	{
		d.close();
	}
}
