package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLeadFunctionality extends BaseClass {
	
	@BeforeTest
	public void setValues() 
	{
		filename = "CreateLead";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String username, String password, String companyName, String firstname, String lastname) 
	{
		LoginPage lp = new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfalink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterfirstName(firstname)
		.enterlastName(lastname)
		.clickCreateLeadButton()
		.verifyLead();
	}

}
