package JavaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorClass {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/");
		
		By amazon = By.xpath("//input[@id='twotabsearchtextbox']");		
		WebElement deal = d.findElement(amazon);		
		deal.sendKeys("Casual men shoes");		
		
		By ser = By.xpath("//input[@id='nav-search-submit-button']");
		WebElement search = d.findElement(ser);
		search.click();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,450)", "");
		
		By sel_shoe = By.xpath("//img[@alt='ASIAN Men's Wonder-13 Sports Running Shoes']");
		WebElement click_shoe = d.findElement(sel_shoe);
		click_shoe.click();
		d.close();
	}
}
