package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPages;
import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers {



	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC002";
		testCaseName = "Edit";
		testDescription = "Edit a Lead";
		category = "smoke";
		authors = "sarath";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String fName,String newName) throws InterruptedException{

		new LoginPages(driver, test)
		.userName(uName)
		.password(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.enterName(fName)
		.clickfindLeadButton()
		.clickFirsrResultingLead()
		.clickEditLead()
		.enterCompanyName(newName)
		.clickUpdate()
		.verifyCompanyName(newName);
	}


}










