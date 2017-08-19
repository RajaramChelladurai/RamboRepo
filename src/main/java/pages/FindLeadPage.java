package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {
	
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("Find Leads | opentaps CRM")) {
			reportStep("This is not Find Lead page", "fail");
			
		}
		
	}
	
	public FindLeadPage enterLeadId(String data) {
		enterByName(prop.getProperty("FindLead.LeadId.name"), data);
		return this;
	}
	
	
	public FindLeadPage clickfindLeadButton() {
		clickByXpath(prop.getProperty("FindLead.findLeadButton.xpath"));
		return this;
	}
	
	public ViewLeadPage clickFirsrResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		clickByXpath(prop.getProperty("FindLead.firstLead.xpath"));
		return new ViewLeadPage(driver, test);
	}
	public FindLeadPage verifyErrorMsg(String data) throws InterruptedException {
		Thread.sleep(3000);
		
		verifyTextByXpath(/*prop.getProperty("FindLead.norecord.xpath")*/"//*[@class='x-paging-info']", data);
		return this;
	}
	public String getFirsrResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		String txt=getTextByXpath(prop.getProperty("FindLead.firstLead.xpath"));
		return txt;
	}
	
	public FindLeadPage clickEmail() {
		clickByLink(prop.getProperty("FindLead.email.link"));
		return this;
	}
	public FindLeadPage enterName(String data) {
		enterByXpath(prop.getProperty("FindLead.name.xpath"), data);
		return this;
	}
	
	public FindLeadPage entherEmailId(String data) {
		enterByName(prop.getProperty("FindLead.email.name"), data);
		return this;
	}
		
	}

