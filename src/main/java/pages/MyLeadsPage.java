package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("My Leads | opentaps CRM")) {
			reportStep("This is not MyLead page", "fail");
			
		}
		
	}
	
	public CreateLeadPage clickCreateLead() {
		clickByLink(prop.getProperty("MyLeadPage.CreateLead.Link"));
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadPage clickFindLead() {
		clickByLink(prop.getProperty("MyLeadPage.FindLeads.Link"));
		return new FindLeadPage(driver, test);
	}
	
	public MergeLeadPage clickMargeLead() {
		clickByLink(prop.getProperty("MyLeadPage.MergeLeads.Link"));
		return new MergeLeadPage(driver, test);
	}
	

}
