package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {
	
	public MyHomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if (!driver.getTitle().equalsIgnoreCase("My Home | opentaps CRM")) {
			reportStep("This is not MyHome page", "fail");
			
		}
		
	}
	
	public MyLeadsPage clickLead() {
		clickByLink(prop.getProperty("MyHomePage.Lead.Link"));
		return new MyLeadsPage(driver, test);
	}
	
	public CreateLeadPage clickCreateLead() {
		clickByLink(prop.getProperty("MyHomePage.CreateLead.Link"));
		return new  CreateLeadPage(driver, test);
	}
	

}
