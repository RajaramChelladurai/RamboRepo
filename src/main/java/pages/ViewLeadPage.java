package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("View Lead | opentaps CRM")) {
			reportStep("This is not MyLead page", "fail");
			
		}
		
	}
	
	public DuplicateLead clickDuplicateLead() {
		clickByLink(prop.getProperty("ViewLead.DuplicateLead.link"));
		return new DuplicateLead(driver, test);
	}
	public MyLeadsPage clickDeleteLead() {
		clickByLink(prop.getProperty("ViewLead.Delete.link"));
		return new MyLeadsPage(driver, test);
	}
	
	public EditLeadPage clickEditLead() {
		clickByLink(prop.getProperty("ViewLead.Edit.link"));
		return new EditLeadPage(driver, test);
	}
	public ViewLeadPage verifyCompanyName(String data) {
		verifyTextContainsById(prop.getProperty("ViewLead.CompanyName.id"), data);
		return this;
	}
	public ViewLeadPage verifyFName(String data) {
		verifyTextContainsById(prop.getProperty("ViewLead.FName.id"), data);//viewLead_firstName_sp
		return this;
	}
	
	public ViewLeadPage clickMargeLead() {
		clickByLinkNoSnap(prop.getProperty("ViewLead.Delete.link"));
		return this;
	}
	public FindLeadPage clickFindLead() {
		clickByLink(prop.getProperty("MyLeadPage.FindLeads.Link"));
		return new FindLeadPage(driver, test);
	}
	

}
