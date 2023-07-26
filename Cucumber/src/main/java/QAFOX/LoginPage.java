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
		System.out.println("QAFOX Login Page should be displayed");
	}

	@Given("username {string}")
	public void username(String string) {
		Login.Enter_Email_id(string);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter UserName");
	}

	@Given("password {string}")
	public void password(String string) {
		Login.Enter_password(string);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter Pass");
	}

	@Given("click login Button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("click login button");
	    Login.Submit_Login();
	}

	@Then("QAFOX home page should be displayed")
	public void qafox_home_page_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("QAFOX home page should be displayed");
    }
	
	@Then("No match for E-Mail Address and\\/or Password should be displayed")
	public void no_match_for_e_mail_address_and_or_password_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
