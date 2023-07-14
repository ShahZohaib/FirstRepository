package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Main.DriverClass;

public class DragAndDrop extends DriverClass {
	@BeforeMethod
	public void OpenPage() {
		driver("https://demoqa.com/droppable/");
	}

	@Test
	public static void dragdrop() {

		Actions a = new Actions(d);
		By drag = By.xpath("//div[@id='draggable']");
		WebElement click_drag = d.findElement(drag);

		By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
		WebElement click_drop = d.findElement(drop);

		a.dragAndDrop(click_drag, click_drop).perform();
		d.close();
	}

	@AfterMethod
	public void close_page() {
		d.close();
	}
}
