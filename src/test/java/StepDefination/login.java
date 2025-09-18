package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.dashboard;
import pageObjects.loginPage;

public class login {
	WebDriver driver;
	loginPage lp;
	dashboard d;
	public login() {
		this.driver=hooks.driver;
		lp=new loginPage(hooks.driver);
		d= new dashboard(hooks.driver);
	}
	
	
	@Given("open loginPage_url")
	public void open_login_page_url() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
	    
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
	    lp.enter_username(string);
	    lp.enter_password(string2);
	}

	@Then("click on checkbox")
	public void click_on_checkbox() {
	    lp.click_agreeChkbx();
	}

	@Then("click on sign in button")
	public void click_on_sign_in_button() throws InterruptedException {
		Thread.sleep(1000);
	    lp.click_signin();	    
	}

	@Then("error {string} should display")
	public void error_should_display(String string) throws InterruptedException {
		lp.errormessage(string);
	  
	}

	@When("enter username {string}  and password {string}")
	public void enter_username_and_password(String string, String string2) {
	    lp.enter_username(string);
	    lp.enter_password(string2);
	    
	}

	@Then("Home should be displayed")
	public void home_should_be_displayed() {
	    d.check_home_present();
	    
	}

}
