package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPages;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers {



	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC001";
		testCaseName = "create lead";
		testDescription = "Create a New Lead";
		category = "smoke";
		authors = "sarath";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String cName,String FName,String lName){

		new LoginPages(driver, test)
		.userName(uName)
		.password(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(FName)
		.enterLastName(lName)
		.clickCreateLead().verifyCompanyName(cName);

	}


}










