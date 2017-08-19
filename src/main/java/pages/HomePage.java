package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers {

	public HomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Opentaps Open Source ERP + CRM")) {
			reportStep("This is not home page", "fail");			
		}		
	}

	public MyHomePage clickCrmsfa() {
		clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new MyHomePage(driver, test);
	}
	public LoginPages clickLogOut() {
		clickByClassName(prop.getProperty("Home.LogOut.Class"));
		return new LoginPages(driver, test);
	}

}
