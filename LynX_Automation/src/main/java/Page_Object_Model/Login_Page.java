package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
private WebDriver driver;
	
	//Element by locators
	
	private By title= By.xpath("//div[@title='LynX-SPA']");
	private  By username= By.xpath("//input[@id='1-email']");
	private By password= By.xpath("//input[@placeholder='your password']");
	private By forgetpassword= By.xpath("//a[@class='auth0-lock-alternative-link']");
	private By LogIn= By.xpath("//span[@class='auth0-label-submit']");
	private By usernamecloud = By.xpath("//input[@placeholder='User Email Address']");
	private By passwordcloud = By.xpath("//input[@placeholder='Password']");
	private By ssoforgetpassword= By.xpath("//span[@class='ContextLogin__resetPasswordLink']");
	private By SSOlogin= By.xpath("//button[@type='submit']");


public  Login_Page ( WebDriver driver) {
	this.driver= driver;

}

public String getlogintitle() {
	return driver.findElement(title).getText();

}

public void verifyusername() {
	
	driver.findElement(username).isEnabled();
}

public void verifypassword() {
	driver.findElement(password).isEnabled();
}

public void verifyforgetpassword() {
driver.findElement(forgetpassword).isEnabled();
}

public void verifylogin() {
	driver.findElement(LogIn).isEnabled();
}

public void verifyssoemail() {
	driver.findElement(usernamecloud).isEnabled();
}

public void verifyssopassword() {
	driver.findElement(passwordcloud).isEnabled();
	
}

public void verifyssoforgetpassword() {
	driver.findElement(ssoforgetpassword).isEnabled();
	
}

public void verifyssologin() {
	driver.findElement(SSOlogin).isEnabled();
}

public String gethomepagetitle() {
	return driver.getTitle();
}
public void dologin() {
	driver.findElement(username).sendKeys("sgawande@baxterplanning.com");
	driver.findElement(LogIn).click();
}

public void SSOlogin() {
	driver.findElement(usernamecloud).sendKeys("sgawande@baxterplanning.com");
	driver.findElement(passwordcloud).sendKeys("Nandu@123");
	driver.findElement(SSOlogin).click();
}

}
