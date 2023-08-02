package QAFOX_BasePKG;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.playwright.Locator;



public class Dashboard_Component extends DriverClass {

	private static String String_select_class = "//select[@id='input-sort']";
	private static String String_all_components = "//li[@class='dropdown open']//div[@class='dropdown-menu']//ul//li";
	private static String String_add_to_cart = "//button[text()='Add to Cart']";
	private static String String_cart_items = "//button[@type='button']//span[@id='cart-total']";
	private static String String_view_cart = "//strong[text()='View Cart']";
	private static String String_nav_bar = "//ul[@class=\"nav navbar-nav\"]//li";
	private static String String_monitos_text = "//h2[text()='Monitors']";
	private static String String_success = "//div[text()='Success: You have added ']";
	private static String String_samsung_item = "//div[@class='caption']//a[text()='Apple Cinema 30\"']";
	private static String String_Check_img = "//h1[text()='Apple Cinema 30\"']";
	private static String String_quantity = "//input[@name=\"quantity\"]";
	private static String String_all_comp_ele = "//li[@class=\"dropdown open\"]//div[@class=\"dropdown-menu\"]";
	private static String String_add_to_cart_table = "//div[@class=\"table-responsive\"]";
	private static String String_country_select = "//select[@id='input-country']";
	private static String String_state_select = "//select[@name='zone_id']";
	private static String String_postal_code = "//input[@name=\"postcode\"]";
	private static String String_shipping_text = "//a[text()='Estimate Shipping & Taxes ']";
	private static String String_shipping_box = "//div[@id=\"collapse-shipping\"]";
	private static String String_get_quotes = "//button[@id=\"button-quote\"]";
	private static String String_shipping_process = "//div[@class=\"modal-content\"]";
	private static String String_radio_button = "//input[@type=\"radio\"]";
	private static String String_apply_shipping = "//input[@type='button' and @value='Apply Shipping']";
	private static String String_success_msg_after_clickOn_apply_ship = "//div[@class=\"alert alert-success alert-dismissible\"]";
	private static String String_check_out = "//a[text()='Checkout']";
	private static String String_after_checkout_msg = "//div[@class=\"alert alert-danger alert-dismissible\"]";
	private static String String_data_displayed = "//select[@id='input-sort' and@onchange=\"location = this.value;\"]";
	private static String String_upload_file = "//button[@id=\"button-upload222\"]";
	
	///Locator Methods	
	
	public static List<Locator> all_components_details() {

		return p.locator(String_all_components).all();
	}

	public static Locator all_components_elements() {
		return p.locator(String_all_comp_ele);
	}
	public static Locator all_List_elements() {
		return p.locator(String_data_displayed);
	}
	public static Locator select_box() {
		return p.locator(String_select_class);
	}

	public static Locator select_add_to_cart() {
		return p.locator(String_add_to_cart);
	}

	public static Locator Go_to_items() {
		return p.locator(String_cart_items);
	}

	public static Locator go_to_view_cart() {
		return p.locator(String_view_cart);
	}

	public static Locator monitor_msg() {
		return p.locator(String_monitos_text);
	}

	public static Locator success_msg() {
		return p.locator(String_success);
	}

	public static Locator Click_Item() {
		return p.locator(String_samsung_item);
	}

	public static Locator Check_img_Displayed() {
		return p.locator(String_Check_img);
	}

	public static Locator Select_Quantity() {
		return p.locator(String_quantity);
	}

	public static List<Locator> all_nav_names() {
		return p.locator(String_nav_bar).all();
	}

	public static Locator cart_table() {
		return p.locator(String_add_to_cart_table);
	}
	
	public static Locator select_country()
	{
		return p.locator(String_country_select);
	}
	public static Locator select_state()
	{
		return p.locator(String_state_select);
	}
	public static Locator select_pincode()
	{
		return p.locator(String_postal_code);
	}
	public static Locator select_estimate()
	{
		return p.locator(String_shipping_text);
	}
	public static Locator ship_details()
	{
		return p.locator(String_shipping_box);
	}
	public static Locator select_quotes()
	{
		return p.locator(String_get_quotes);
	}
	public static Locator After_click_on_get_qoutes_box_displayed()
	{
		return p.locator(String_shipping_process);
	}
	public static Locator Go_to_radio_button()
	{
		return p.locator(String_radio_button);
	}
	public static Locator got_to_apply_shipping()
	{
		return p.locator(String_apply_shipping);
	}
	public static Locator success_after_applied_ship()
	{
		return p.locator(String_success_msg_after_clickOn_apply_ship);
	}
	public static Locator go_to_check_out()
	{
		return p.locator(String_check_out);
	}
	public static Locator check_not_in_stock()
	{
		return p.locator(String_after_checkout_msg);
	}
	public static Locator upload_file()
	{
		return p.locator(String_upload_file);
	}
//////////////////////////////////////Actions///////////////////////////////

	public static void Click_on_select_Box(String text) {
		
		select_box().click();
		select_box().type(text);
		select_box().click();
		
	}

	public static void Click_AddTo_Cart() {
		
		select_add_to_cart().click();
	}

	public static void click_items() {
		Go_to_items().click();
	}

	public static void click_on_view_cart() {
		go_to_view_cart().click();
	}

	public static void Click_any_Component(String enter_comp) {
		List<Locator> li = all_components_details();
		for (Locator ele : li) {
			String s = ele.innerText();
			if (enter_comp.equals(s)) 
			{
				 ele.click();
				 break;
			}
		}
		Test2.info(enter_comp+" clicked");
	}

	public static void Select_item() 
	{
		Click_Item().scrollIntoViewIfNeeded();
		Click_Item().click();
	}

	public static void Enter_Quantity(String num) {

		Select_Quantity().click();
		Select_Quantity().clear();
		Select_Quantity().type(num);
	}

	public static void Click_any_nav_element(String ele) {
		List<Locator> li = all_nav_names();
		for (Locator e : li) {
			String s = e.innerText();
			if (ele.equals(s)) {
				e.click();
				break;
			}
		}
	}
	public static void enter_country_name(String country_name)
	{
		
		select_country().click();
	
	}
	public static void enter_state_name(String state_name)
	{
		select_country().click();
	}
	public static void enter_pin_code(String pin)
	{
		
		select_pincode().clear();
		select_pincode().type(pin);
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
		
		go_to_check_out().click();
	}
	
	public static void click_upload_file()
	{
		
	}
	
}
