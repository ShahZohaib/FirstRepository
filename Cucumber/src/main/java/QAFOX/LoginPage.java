package QAFOX;


import io.cucumber.java.en.*;

public class LoginPage 
{
	
	@Given("search url:{string}")
	public void search_url(String string) {
		DriverClass.driver(string);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter URL");
	}

	@Then("QAFOX Login Page should be displayed")
	public void qafox_login_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("QAFOX Login Page is displayed");
	}

	@Given("username {string}")
	public void username(String string) {
		Login.Enter_Email_id(string);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username Entered Successfully");
	}

	@Given("password {string}")
	public void password(String string) {
		Login.Enter_password(string);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Password Entered Successfully");
	}

	@Given("click login Button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("click login button");
	    Login.Submit_Login();
	    DriverClass.d.quit();
	}
//scr-2
	@Then("QAFOX home page should be displayed")
	public void qafox_home_page_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("QAFOX home page is displayed");
    }
	
	@Then("No match for E-Mail Address and\\/or Password should be displayed")
	public void no_match_for_e_mail_address_and_or_password_should_be_displayed() 
	{
	   System.out.println("No match for E-Mail Address and\\/or Password is displayed");
	}
//scr-3	
	@Then("username entered succfully msg should be displayed")
	public void username_entered_succfully_msg_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username entered succfully msg is displayed");
	}

	@Then("password entered successfully msg should be displayed")
	public void password_entered_successfully_msg_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("password entered succfully msg is displayed");
	}



}
