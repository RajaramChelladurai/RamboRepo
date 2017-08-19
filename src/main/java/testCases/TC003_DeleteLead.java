package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPages;
import wrappers.LeafTapsWrappers;

public class TC003_DeleteLead extends LeafTapsWrappers {



	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC003";
		testCaseName = "Delete lead";
		testDescription = "delete a Lead";
		category = "smoke";
		authors = "sarath";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String Name) throws InterruptedException{

		String txt	=new LoginPages(driver, test)
		.userName(uName)
		.password(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.enterName(Name)
		.clickfindLeadButton()
		.getFirsrResultingLead();
		new FindLeadPage(driver, test)
		.clickFirsrResultingLead()
		.clickDeleteLead()
		.clickFindLead()
		.enterLeadId(txt)
		.clickfindLeadButton()
		.verifyErrorMsg("No records to display");
	}


}










