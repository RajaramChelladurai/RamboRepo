package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPop extends LeafTapsWrappers {
	
	public FindLeadPop(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Find Leads")) {
			reportStep("This is not Find Leads page", "fail");
			
		}
		
	}
	
	public FindLeadPop enterLeadId(String data) {
		enterByName(prop.getProperty("FindLeadPopup.LeadId.name"), data);
		return this;
	}
	
	
	public FindLeadPop clickfindLeadButton() {
		clickByXpath(prop.getProperty("FindLeadPopup.findLeadButton.xpath"));
		return this;
	}
	
	public MergeLeadPage clickFirsrResultingLead() throws InterruptedException {
		Thread.sleep(3000);
        clickByXpathNoSnap(prop.getProperty("FindLead.firstLead.xpath"));
        switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
	

}
