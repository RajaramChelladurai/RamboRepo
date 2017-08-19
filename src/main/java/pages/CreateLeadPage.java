package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Create Lead | opentaps CRM")) {
			reportStep("This is not Create Lead page", "fail");
			
		}
		
	}
	
	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLead.CompanyName.id"), data);
		reportStep("enterCompanyName", "pass");
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("createLead.FirstName.id"), data);
		return this;
	}
	
	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("createLead.lastName.LastName.id"), data);
		return this;
	}

	public ViewLeadPage clickCreateLead() {
		clickByClassName(prop.getProperty("createLead.createlead.className"));
		return new ViewLeadPage(driver, test);
	}

}
