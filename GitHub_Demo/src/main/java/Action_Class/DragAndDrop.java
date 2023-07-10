package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	Actions a= new Actions(d);
	
	d.get("https://demoqa.com/droppable/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	d.manage().window().maximize();
	
	By drag = By.xpath("//div[@id='draggable']");
	WebElement click_drag = d.findElement(drag);
	
	By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
	WebElement click_drop = d.findElement(drop);
	
	a.dragAndDrop(click_drag, click_drop).perform();
}
}
