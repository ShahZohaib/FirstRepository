package QAFOX_Project_XPATH_PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import QAFOX_Project_Driver_PKG.DriverClass;

public class Dashboard_Cameras extends DriverClass {
	private static By by_camera_page = By.xpath("//div[@id='content']");
	private static By by_grid_xpath = By.xpath("//button[@id='grid-view' and @type='button']");
	private static By by_list_xpath = By.xpath("//button[@id=\"list-view\"]");
	private static By by_img_in_grid_form = By.xpath("//div[@class=\"row\"]//div[@class=\"image\"]//img");
	private static By by_nikonD300_xpath = By.xpath("//img[@title='Nikon D300']");
	
	
	
////////////WebElements////////////
	public static WebElement camera_page_displayed()
	{
		return d.findElement(by_camera_page);
	}
	public static WebElement go_to_grid()
	{
		return d.findElement(by_grid_xpath);
	}
	public static WebElement go_to_list()
	{
		return d.findElement(by_list_xpath);
	}
	
	public static WebElement after_grid_img()
	{
		return d.findElement(by_img_in_grid_form);
	}
	public static WebElement go_to_d300_img()
	{
		return d.findElement(by_nikonD300_xpath);
	}
	
/////////////////////////////Action Methods/////////////////
	public static void click_on_grid()
	{
		go_to_grid().click();
	}
	public static void click_on_d300_camera()
	{
		go_to_d300_img().click();
	}
	
}
