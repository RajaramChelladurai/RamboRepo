package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers {
	
	public DuplicateLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {
			reportStep("This is not DuplicateLead page", "fail");
			
		}
		
	}
	
	public ViewLeadPage clickCreateLead() {
		clickByClassName(prop.getProperty("EditLead.update.ClassName"));
		return new ViewLeadPage(driver, test);
	}
	public String getFirstName() {
		return getTextById(prop.getProperty("DuplicateLead.firstName.id"));
		 
	}
}
