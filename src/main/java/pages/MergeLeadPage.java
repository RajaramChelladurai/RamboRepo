package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Merge Leads | opentaps CRM")) {
			reportStep("This is not Merge Lead page", "fail");
			
		}
		
	}
	
	public FindLeadPop clickFromLead() {
		clickByXpathNoSnap(prop.getProperty("MergeLead.FromLead.xpath"));
		switchToLastWindow();
		return new FindLeadPop(driver, test);
	}
	
	public FindLeadPop clickToLead() throws InterruptedException {
		clickByXpath(prop.getProperty("MergeLead.ToLead.xpath"));
		switchToLastWindow();
		return new FindLeadPop(driver, test);
		
	}
	
	public ViewLeadPage clickMargeLead() throws InterruptedException {
		clickByLinkNoSnap(prop.getProperty("MergePage.MergeLeads.Link"));
		Thread.sleep(4000);
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
	

}
