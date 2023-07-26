package Action_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		By alrt = By.xpath("//button[@name='alertbox']");
		WebElement alt = d.findElement(alrt);
		alt.click();
		
		d.switchTo().alert().accept();
		
		By alrt_confirm = By.xpath("//button[@name='confirmalertbox']");
		WebElement conf = d.findElement(alrt_confirm);
		conf.click();	
		
		d.switchTo().alert().dismiss();
		
		By prompt_alert_box = By.xpath("//button[@name=\"promptalertbox1234\"]");
		WebElement prompt = d.findElement(prompt_alert_box);
		prompt.click();
		
		d.switchTo().alert().sendKeys("Yes");
		d.switchTo().alert().accept();
		
		
		
		
	
		
	}
}
