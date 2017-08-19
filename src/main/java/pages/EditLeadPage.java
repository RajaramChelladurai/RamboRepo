package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().contains("opentaps CRM")) {
			reportStep("This is not EditLead page", "fail");
			
		}
		
	}
	
	public EditLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("EditLead.companyName.id"), data);
		return this;
	}
	
	public EditLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("EditLead.FirstName.id"), data);
		return this;
	}
	
	public EditLeadPage enterLastName(String data) {
		enterById(prop.getProperty("EditLead.LastName.id"), data);
		return this;
	}

	public ViewLeadPage clickUpdate() {
		clickByClassName(prop.getProperty("EditLead.update.ClassName"));
		return new ViewLeadPage(driver, test);
	}

}
