package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	public WebDriver driver;
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	public WebElement homebutton_loc;
	
	public void check_home_present() {
		Assert.assertTrue(homebutton_loc.isDisplayed());
		
	}

}
