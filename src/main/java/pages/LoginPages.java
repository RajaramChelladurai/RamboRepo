package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class LoginPages extends LeafTapsWrappers {
	
	public LoginPages(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Opentaps Open Source ERP + CRM")) {
			reportStep("This is not Login page", "fail");
			
		}
		
	}
	
	public LoginPages userName(String data) {
		enterById(prop.getProperty("Login.UserName.id"), data);
		return this;
	}
	
	public LoginPages password(String data) {
		enterById(prop.getProperty("Login.password.id"), data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage(driver, test);
	}

}
