package pageObjects;

import java.time.Duration;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginPage {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	WebElement usernm_txbx_loc;
	
	@FindBy(id="password")
	WebElement pass_txtbx_loc;
	
	@FindBy(id="terms")
	WebElement Agree_chkbx_loc;
	
	@FindBy(id="signInBtn")
	WebElement signin_btn_loc;
	
	@FindBy(xpath="//div[@class='alert alert-danger col-md-12']/strong")
	WebElement errormsge;
	
	//-----------------Methods-----------------
	public void enter_username(String usrnm) {
		usernm_txbx_loc.sendKeys(usrnm);
	}
	
	public void enter_password(String password) {
		pass_txtbx_loc.sendKeys(password);
	}
	
	public void click_agreeChkbx() {
		Agree_chkbx_loc.click();
	}
	
	public void click_signin() {
		signin_btn_loc.click();
	}
	
	public void errormessage(String err) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(d->d.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']/strong")));
		System.out.println(driver.getPageSource().contains(err));
		Assert.assertTrue(driver.getPageSource().contains(err));
	}

}
