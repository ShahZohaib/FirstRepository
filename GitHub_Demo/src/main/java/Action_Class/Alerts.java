package Action_Class;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		By alrt = By.xpath("//button[@id=\"alertButton\"]");
		WebElement alt = d.findElement(alrt);
		alt.click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,450)", "");
		By alrt_confirm = By.xpath("//button[@id=\"confirmButton\"]");
		WebElement conf = d.findElement(alrt_confirm);
		conf.click();	
		Thread.sleep(3000);
		d.switchTo().alert().dismiss();
		
		
		
		
	
		
	}
}
