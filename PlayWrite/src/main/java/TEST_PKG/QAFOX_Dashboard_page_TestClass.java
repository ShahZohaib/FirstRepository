package TEST_PKG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;
import org.testng.annotations.*;

import QAFOX_BasePKG.Dashboard_Component;
import QAFOX_BasePKG.DriverClass;


public class QAFOX_Dashboard_page_TestClass extends DriverClass
{
	@BeforeClass
	public void open_page()
	{
		 DriverClass.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
			
			String act_ul ="https://tutorialsninja.com/demo/index.php?route=account/login";
			assertEquals(act_ul, DriverClass.p.url(),"Incorrect URL");
		    System.out.println("Test case1 Pass");	
	  Test1 = report.createTest("Dashboard_TestCases");
	}
	@BeforeMethod
	public void bm(Method m)
	
	{
	    
		Test2 = Test1.createNode(m.getName());
	}
	@Test
	public void validate_componenet_with_valid_credentials() throws InterruptedException
	{
	QAFOX_LoginPage_TestClass.Validate_Login_With_Valid_Credentials();
		
		Dashboard_Component.Click_any_nav_element("Components");
		  
		Thread.sleep(3000);
		  assertTrue(Dashboard_Component.all_components_elements().isVisible(), "Component list not Displayed");
		  Thread.sleep(3000);
		  Dashboard_Component.Click_any_Component("Monitors (2)");
		  Thread.sleep(3000);
		 
		  assertTrue(Dashboard_Component.monitor_msg().isVisible(), "Monitor text not displayed");		
		 
		  Thread.sleep(3000);
		  Dashboard_Component.Click_on_select_Box("Price (High > Low)");  
		  Thread.sleep(3000);
		  
		  assertTrue(Dashboard_Component.all_List_elements().isVisible(),"Selected Element is not displayed");
	      Thread.sleep(3000);
		  
//		  Dashboard_Component.Select_item();
//
//	       assertTrue(Dashboard_Component.Check_img_Displayed().isVisible(), "Mobile image not displayed");	
//	       Thread.sleep(3000);
	       Test2.info("Component Test Pass");
	       //	      Dashboard_Component.Enter_Quantity("2");
//		  String actual_value = "2";
//	      String exp_value=Dashboard_Component.Select_Quantity().getAttribute("value");
//	      assertEquals(actual_value, exp_value, "Quantity is not same");
//
//	 	  Dashboard_Component.Click_AddTo_Cart();
//	      assertTrue(Dashboard_Component.success_msg().isVisible(),"Success msg not displayed");	  
////		  Thread.sleep(3000);
//		  Dashboard_Component.click_items();
////		  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.go_to_view_cart().isDisplayed());
//	      assertTrue(Dashboard_Component.go_to_view_cart().isVisible(),"Cart Details");
//	      
//		  Dashboard_Component.click_on_view_cart();
////		  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.cart_table().isDisplayed());
//		  assertTrue(Dashboard_Component.cart_table().isVisible(),"Selected Item Details not Displayed");
//		  Thread.sleep(3000);
//		  Dashboard_Component.click_estimate_icon();
////		  QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.ship_details().isDisplayed());
//		  assertTrue(Dashboard_Component.ship_details().isVisible(), "Shipping details not visible");
//		   Thread.sleep(3000);
//		  	 
//		  Dashboard_Component.enter_country_name("Australia");
//		 
//		  
//		  Thread.sleep(3000);
//		  Dashboard_Component.enter_state_name("Western Australia");
//		  
//	      Dashboard_Component.enter_pin_code("123");
//	      String act_pin = "123";
//	      String exp_pin = Dashboard_Component.select_pincode().getAttribute("value");
//	      assertEquals(act_pin, exp_pin,"Pin is different");
////	      QAFOX_Validation_component.check_equal(act_pin, exp_pin);
//	      
//	     Dashboard_Component.click_get_quotes();
////	      QAFOX_Validation_component.Check_table_displayed(Dashboard_Component.After_click_on_get_qoutes_box_displayed().isDisplayed());
//	      assertTrue(Dashboard_Component.After_click_on_get_qoutes_box_displayed().isVisible(),"Quote box not displayed");
////	      Dashboard_Component.click_radio_button();
////	      QAFOX_Validation_component.check_Clicked(Dashboard_Component.Go_to_radio_button().isSelected());
////	      
////	      Dashboard_Component.click_on_apply_shipping();
////	      QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.success_after_applied_ship().isDisplayed());
////	       
////	      Dashboard_Component.click_on_checkout();
////	      QAFOX_Validation_component.Check_msg_displayed(Dashboard_Component.check_not_in_stock().isDisplayed());
////	     System.out.println("Test 1 Pass"); 
		}
	}

