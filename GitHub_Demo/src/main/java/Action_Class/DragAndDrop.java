package Action_Class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import Main.DriverClass;

public class DragAndDrop extends DriverClass{
public static void main(String[] args) {
	
	DriverClass.driver("https://demoqa.com/droppable/");
	Actions a = new Actions(d);
	By drag = By.xpath("//div[@id='draggable']");
	WebElement click_drag = d.findElement(drag);
	
	By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
	WebElement click_drop = d.findElement(drop);
	
	a.dragAndDrop(click_drag, click_drop).perform();
	d.close();
}
}
