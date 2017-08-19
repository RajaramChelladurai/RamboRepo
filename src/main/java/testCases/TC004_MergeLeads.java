package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPages;
import wrappers.LeafTapsWrappers;

public class TC004_MergeLeads extends LeafTapsWrappers {



	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC005";
		testCaseName = "Merge Lead";
		testDescription = "Merge two Leads";
		category = "smoke";
		authors = "Gopi";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String fLead,String toLead) throws InterruptedException{

		new LoginPages(driver, test)
		.userName(uName)
		.password(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickMargeLead()
		.clickFromLead()
		.enterLeadId(fLead)
		.clickfindLeadButton()
		.clickFirsrResultingLead()
		.clickToLead()
		.enterLeadId(toLead)
		.clickfindLeadButton()
		.clickFirsrResultingLead()
		.clickMargeLead()
		.clickFindLead()
		.enterLeadId(fLead)
		.clickfindLeadButton()
		.verifyErrorMsg("No records to display");





	}//10244


}










