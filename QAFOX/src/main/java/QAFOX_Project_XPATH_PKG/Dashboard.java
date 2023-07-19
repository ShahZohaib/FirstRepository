package QAFOX_Project_XPATH_PKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import QAFOX_Project_Driver_PKG.DriverClass;

public class Dashboard extends DriverClass {
	public static Select s;
	static JavascriptExecutor js = (JavascriptExecutor) d;
	static Actions a = new Actions(d);


	private static By by_select_class = By.xpath("//select[@id='input-sort']");
	private static By by_all_components = By.xpath("//li[@class='dropdown open']//div[@class='dropdown-menu']//ul//li");
	private static By by_add_to_cart = By.xpath("//button[text()='Add to Cart']");
	private static By by_cart_items = By.xpath("//button[@type='button']//span[@id='cart-total']");
	private static By by_view_cart = By.xpath("//strong[text()='View Cart']");
	private static By by_nav_bar = By.xpath("//ul[@class=\"nav navbar-nav\"]//li");
	private static By by_monitos_text = By.xpath("//h2[text()='Monitors']");
	private static By by_success = By.xpath("//div[text()='Success: You have added ']");
	private static By by_samsung_item = By.xpath("//div[@class=\"caption\"]//a[text()='Samsung SyncMaster 941BW']");
	private static By by_Check_img = By.xpath("//a[@title=\"Samsung SyncMaster 941BW\"]");
	private static By by_quantity = By.xpath("//input[@name=\"quantity\"]");
	private static By by_all_comp_ele = By.xpath("//li[@class=\"dropdown open\"]//div[@class=\"dropdown-menu\"]");
	private static By by_add_to_cart_table = By.xpath("//div[@class=\"table-responsive\"]");
	private static By by_country_select = By.xpath("//select[@id='input-country']");
	private static By by_state_select = By.xpath("//select[@name='zone_id']");
	private static By by_postal_code = By.xpath("//input[@name=\"postcode\"]");
	private static By by_shipping_text = By.xpath("//a[text()='Estimate Shipping & Taxes ']");
	private static By by_shipping_box = By.xpath("//div[@id=\"collapse-shipping\"]");
	private static By by_get_quotes = By.xpath("//button[@id=\"button-quote\"]");
	private static By by_shipping_process = By.xpath("//div[@class=\"modal-content\"]");
	private static By by_radio_button = By.xpath("//input[@type=\"radio\"]");
	private static By by_apply_shipping = By.xpath("//input[@type='button' and @value='Apply Shipping']");
	private static By by_success_msg_after_clickOn_apply_ship = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
	private static By by_check_out = By.xpath("//a[text()='Checkout']");
	private static By by_after_checkout_msg = By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]");
	private static By by_data_displayed = By.xpath("//select[@id='input-sort' and@onchange=\"location = this.value;\"]");
	///WebElement Methods	
	
	public static List<WebElement> all_components_details() {

		return d.findElements(by_all_components);
	}

	public static WebElement all_components_elements() {
		return d.findElement(by_all_comp_ele);
	}
	public static WebElement all_List_elements() {
		return d.findElement(by_data_displayed);
	}
	public static WebElement select_box() {
		return d.findElement(by_select_class);
	}

	public static WebElement select_add_to_cart() {
		return d.findElement(by_add_to_cart);
	}

	public static WebElement Go_to_items() {
		return d.findElement(by_cart_items);
	}

	public static WebElement go_to_view_cart() {
		return d.findElement(by_view_cart);
	}

	public static WebElement monitor_msg() {
		return d.findElement(by_monitos_text);
	}

	public static WebElement success_msg() {
		return d.findElement(by_success);
	}

	public static WebElement Click_Item() {
		return d.findElement(by_samsung_item);
	}

	public static WebElement Check_img_Displayed() {
		return d.findElement(by_Check_img);
	}

	public static WebElement Select_Quantity() {
		return d.findElement(by_quantity);
	}

	public static List<WebElement> all_nav_names() {
		return d.findElements(by_nav_bar);
	}

	public static WebElement cart_table() {
		return d.findElement(by_add_to_cart_table);
	}
	
	public static WebElement select_country()
	{
		return d.findElement(by_country_select);
	}
	public static WebElement select_state()
	{
		return d.findElement(by_state_select);
	}
	public static WebElement select_pincode()
	{
		return d.findElement(by_postal_code);
	}
	public static WebElement select_estimate()
	{
		return d.findElement(by_shipping_text);
	}
	public static WebElement ship_details()
	{
		return d.findElement(by_shipping_box);
	}
	public static WebElement select_quotes()
	{
		return d.findElement(by_get_quotes);
	}
	public static WebElement After_click_on_get_qoutes_box_displayed()
	{
		return d.findElement(by_shipping_process);
	}
	public static WebElement Go_to_radio_button()
	{
		return d.findElement(by_radio_button);
	}
	public static WebElement got_to_apply_shipping()
	{
		return d.findElement(by_apply_shipping);
	}
	public static WebElement success_after_applied_ship()
	{
		return d.findElement(by_success_msg_after_clickOn_apply_ship);
	}
	public static WebElement go_to_check_out()
	{
		return d.findElement(by_check_out);
	}
	public static WebElement check_not_in_stock()
	{
		return d.findElement(by_after_checkout_msg);
	}
//////////////////////////////////////Actions///////////////////////////////

	public static void Click_on_select_Box(String text) {
		s = new Select(select_box());
		select_box().click();
		s.selectByVisibleText(text);
	}

	public static void Click_AddTo_Cart() {
		js.executeScript("window.scrollBy(0,400)", "");
		select_add_to_cart().click();
	}

	public static void click_items() {
		Go_to_items().click();
	}

	public static void click_on_view_cart() {
		go_to_view_cart().click();
	}

	public static void Click_any_Component(String enter_comp) {
		List<WebElement> li = all_components_details();
		for (WebElement ele : li) {
			String s = ele.getText();
			if (enter_comp.equals(s)) 
			{
				 ele.click();
				 break;
			}
		}
	}

	public static void Select_item() {

		js.executeScript("window.scrollBy(0,400)", "");
		Click_Item().click();
	}

	public static void Enter_Quantity(String num) {

		Select_Quantity().click();
		Select_Quantity().clear();
		Select_Quantity().sendKeys(num);
	}

	public static void Click_any_nav_element(String ele) {
		List<WebElement> li = all_nav_names();
		for (WebElement e : li) {
			String s = e.getText();
			if (ele.equals(s)) {
				e.click();
				break;
			}
		}
	}
	public static void enter_country_name(String country_name)
	{
		js.executeScript("window.scrollBy(0,400)", "");
		select_country().click();
		
		s = new Select(select_country());
		
		s.selectByVisibleText(country_name);
	}
	public static void enter_state_name(String state_name)
	{
		select_country().click();
		
		s = new Select(select_state());
		
		s.selectByVisibleText(state_name);
	}
	public static void enter_pin_code(String pin)
	{
		a.click(select_pincode());
		select_pincode().clear();
		select_pincode().sendKeys(pin);
	}
	public static void click_estimate_icon()
	{
		select_estimate().click();
	}
	public static void click_get_quotes()
	{
		select_quotes().click();
	}
	public static void click_radio_button()
	{
		Go_to_radio_button().click();
	}
	public static void click_on_apply_shipping()
	{
		got_to_apply_shipping().click();
	}
	public static void click_on_checkout()
	{
		js.executeScript("window.scrollBy(0,400)", "");
		go_to_check_out().click();
	}
	
}
