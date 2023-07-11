package QAFOX_Project;

import org.testng.annotations.*;

public class RegistrationClass 
{
	@BeforeTest
	public void OpenRegistrationPage()
	{
		DriverClass.driver();
	}
	@Test
	public void Enter_Registration_Details()
	{
		RegistrationPage.Enter_First_name("ZtoH");
		RegistrationPage.Enter_last_name("India");
		RegistrationPage.enter_email("ztoh@gmail.com");
		RegistrationPage.enter_number("12345");
		RegistrationPage.enter_pass("ztoh_india");
		RegistrationPage.enter_pass_again("ztoh_india");
		RegistrationPage.select_checkbox();
		RegistrationPage.Click_on_continue_box();
	}
	
}
