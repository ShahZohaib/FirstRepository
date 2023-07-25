package QAFOX_Project_TEST_PKG;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;
import QAFOX_Project_Driver_PKG.DriverClass;
import QAFOX_Project_Validation_PKG.QAFOX_Validation_component;
import QAFOX_Project_Validation_PKG.Validate_Cameras;
import QAFOX_Project_XPATH_PKG.Dashboard_Cameras;
import QAFOX_Project_XPATH_PKG.Dashboard_Component;
import QAFOX_Project_XPATH_PKG.Login;


public class TestClass 
{
	@BeforeClass
	public void OpenLoginPage()
	{
		DriverClass.driver();
	}
//	@BeforeMethod
//	public void Enter_LoginDetails()
//	{
//		
//	}
	@Test(dataProvider = "logindata",dataProviderClass = Data_from_excel.LoginData.class)
	
	public void Login_and_validate_components_Add_Item_To_Cart_and_try_checkout(String email,String pass) throws Exception
	{		
        Login.Enter_Email_id(email);
		
		Login.Enter_password(pass);
		
		Login.Submit_Login();
		
	  Dashboard_Component.Click_any_nav_element("Components");
//	  QAFOX_Validation_component.Check_element_displayed(Dashboard_Component.all_components_elements().isDisplayed());
	  assertFalse(!Dashboard_Component.all_components_elements().isDisplayed(), "Component list Displayed");
//      Dashboard_Component.Click_any_Component("Monitors (2)");
//	  QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.monitor_msg().isDisplayed());
//		
//      Dashboard_Component.Click_on_select_Box("Price (High > Low)");
//      QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.all_List_elements().isDisplayed());
//	  Dashboard_Component.Select_item();
//	  QAFOX_Validation_component.Check_img_displayed(Dashboard_Component.Check_img_Displayed().isDisplayed());
//		
//	  Dashboard_Component.Enter_Quantity("2");
//	  String actual_value = "2";
//	  String exp_value=Dashboard_Component.Select_Quantity().getAttribute("value");
//	  QAFOX_Validation_component.check_equal(actual_value, exp_value);
//		
//	  Dashboard_Component.Click_AddTo_Cart();
//	  QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.success_msg().isDisplayed());
//	  
//	  Thread.sleep(3000);
//	  Dashboard_Component.click_items();
//	  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.go_to_view_cart().isDisplayed());
//	  Dashboard_Component.click_on_view_cart();
//	  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.cart_table().isDisplayed());
//	  
//	  Thread.sleep(3000);
//	  Dashboard_Component.click_estimate_icon();
//	  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.ship_details().isDisplayed());
//	  Thread.sleep(3000);
//	  
//	  Dashboard_Component.enter_country_name("Australia");
//	  QAFOX_Validation_component.check_list_equal("Australia");
//	  
//	  Thread.sleep(3000);
//	  Dashboard_Component.enter_state_name("Western Australia");
//	  QAFOX_Validation_component.check_list_equal("Western Australia");
//      Dashboard_Component.enter_pin_code("123");
//      String act_pin = "123";
//      String exp_pin = Dashboard_Component.select_pincode().getAttribute("value");
//      
//      QAFOX_Validation_component.check_equal(act_pin, exp_pin);
//      
//      Dashboard_Component.click_get_quotes();
//      QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.After_click_on_get_qoutes_box_displayed().isDisplayed());
//      
//      Dashboard_Component.click_radio_button();
//      QAFOX_Validation_component.check_Clicked(Dashboard_Component.Go_to_radio_button().isSelected());
//      
//      Dashboard_Component.click_on_apply_shipping();
//      QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.success_after_applied_ship().isDisplayed());
//       
//      Dashboard_Component.click_on_checkout();
//      QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.check_not_in_stock().isDisplayed());
//     System.out.println("Test 1 Pass"); 
	}
//	@Test
//	public void Login_and_validate_Camera() throws Exception
//	{
//		Login.Enter_Email_id("ztoh@gmail.com");
//		Login.Enter_password("ztoh_india");
//		Login.Submit_Login();
//		
//		Dashboard_Component.Click_any_nav_element("Cameras");
//		Validate_Cameras.Validate_Page_Displayed(Dashboard_Cameras.camera_page_displayed().isDisplayed());	
//		
//		Dashboard_Cameras. go_to_grid();
//		Validate_Cameras.Validate_images_visible_in_format(Dashboard_Cameras.after_grid_img().isDisplayed());

	
	
	
//	@AfterMethod
//	public void logout()
//	{
//		Login.click_on_myaccount();
//		Login.click_on_logout();
//	}
	@AfterClass
	public void closewindow()
	{
		DriverClass.d.quit();
	}
	
}
