package QAFOX_Project_TEST_PKG;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import QAFOX_Project_Driver_PKG.DriverClass;
import QAFOX_Project_Validation_PKG.QAFOX_Validation;
import QAFOX_Project_XPATH_PKG.Dashboard;
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
		
	  Dashboard.Click_any_nav_element("Components");
	  QAFOX_Validation.Check_element_displayed(Dashboard.all_components_elements().isDisplayed());

      Dashboard.Click_any_Component("Monitors (2)");
	  QAFOX_Validation.Check_msg_displayed(Dashboard.monitor_msg().isDisplayed());
		
      Dashboard.Click_on_select_Box("Price (High > Low)");
      QAFOX_Validation.Check_msg_displayed(Dashboard.all_List_elements().isDisplayed());
	  Dashboard.Select_item();
	  QAFOX_Validation.Check_img_displayed(Dashboard.Check_img_Displayed().isDisplayed());
		
	  Dashboard.Enter_Quantity("2");
	  String actual_value = "2";
	  String exp_value=Dashboard.Select_Quantity().getAttribute("value");
	  QAFOX_Validation.check_equal(actual_value, exp_value);
		
	  Dashboard.Click_AddTo_Cart();
	  QAFOX_Validation.Check_msg_displayed(Dashboard.success_msg().isDisplayed());
	  
	  Thread.sleep(3000);
	  Dashboard.click_items();
	  QAFOX_Validation.Check_table_displayed(Dashboard.go_to_view_cart().isDisplayed());
	  Dashboard.click_on_view_cart();
	  QAFOX_Validation.Check_table_displayed(Dashboard.cart_table().isDisplayed());
	  
	  Thread.sleep(3000);
	  Dashboard.click_estimate_icon();
	  QAFOX_Validation.Check_table_displayed(Dashboard.ship_details().isDisplayed());
	  Thread.sleep(3000);
	  
	  Dashboard.enter_country_name("Australia");
	  QAFOX_Validation.check_list_equal("Australia");
	  
	  Thread.sleep(3000);
	  Dashboard.enter_state_name("Western Australia");
	  QAFOX_Validation.check_list_equal("Western Australia");
      Dashboard.enter_pin_code("123");
      String act_pin = "123";
      String exp_pin = Dashboard.select_pincode().getAttribute("value");
      
      QAFOX_Validation.check_equal(act_pin, exp_pin);
      
      Dashboard.click_get_quotes();
      QAFOX_Validation.Check_table_displayed(Dashboard.After_click_on_get_qoutes_box_displayed().isDisplayed());
      
      Dashboard.click_radio_button();
      QAFOX_Validation.check_Clicked(Dashboard.Go_to_radio_button().isSelected());
      
      Dashboard.click_on_apply_shipping();
      QAFOX_Validation.Check_msg_displayed(Dashboard.success_after_applied_ship().isDisplayed());
       
      Dashboard.click_on_checkout();
      QAFOX_Validation.Check_msg_displayed(Dashboard.check_not_in_stock().isDisplayed());
     System.out.println("Test 1 Pass"); 
	}
	
	
	@AfterMethod
	public void logout()
	{
		Login.click_on_myaccount();
		Login.click_on_logout();
	}
	@AfterClass
	public void closewindow()
	{
		DriverClass.d.quit();
	}
	
}
