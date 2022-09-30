package stepdefinations;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;

import Page_Object_Model.Login_Page;
import QA_Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_steps {
	
	private Login_Page loginpage= new Login_Page(DriverFactory.getDriver());
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://lynx-dev.entercoms.com/#");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title= loginpage.gethomepagetitle();
		System.out.println("login page title is :"+ title);
	}

	@Then("Verify Title")
	public void verify_title() {
		String title= loginpage.getlogintitle();
	  assertEquals("LynX-SPA", title);
	   
	}

	@Then("Verfiy Username field")
	public void verfiy_username_field() {
	  loginpage.verifyusername();
	}

	@Then("Verify Password field")
	public void verify_password_field() {
	   loginpage.verifypassword();
	}

	@Then("Verify forget password hyperlink")
	public void verify_forget_password_hyperlink() {
	    loginpage.verifyforgetpassword();
	}

	@Then("Verify Login button")
	public void verify_login_button() {
	    loginpage.verifylogin();
	}

	@Then("User should redirect to SSO Login")
	public void user_should_redirect_to_sso_login() {
		loginpage.dologin();
	   loginpage.gethomepagetitle();
	}

	@Then("Verify SSO Email field")
	public void verify_sso_email_field() {
	    loginpage.verifyssoemail();
	}

	@Then("Verify SSO Password Field")
	public void verify_sso_password_field() {
	   loginpage.verifyssopassword();
	}

	@Then("Verify SSO forget password hyperlink")
	public void verify_sso_forget_password_hyperlink() {
	  loginpage.verifyssopassword();
	}

	@Then("verify SSO Login button")
	public void verify_sso_login_button() {
	   loginpage.verifyssologin();
	}

	
	
	@Given("Redirect to Home Page")
	public void redirect_to_home_page() {
		DriverFactory.getDriver().get("https://lynx-dev.entercoms.com/#");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title= loginpage.gethomepagetitle();
		System.out.println("login page title is :"+ title);
	   
	}

	@Then("Login to application")
	public void login_to_application() {
		
		loginpage.dologin();
		
		loginpage.SSOlogin();
	   
	}

}
