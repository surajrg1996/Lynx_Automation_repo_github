package stepdefinations;

import java.util.concurrent.TimeUnit;

import Page_Object_Model.Login_Page;
import QA_Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_steps {
	
	private Login_Page loginpage= new Login_Page(DriverFactory.getDriver());
	
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
