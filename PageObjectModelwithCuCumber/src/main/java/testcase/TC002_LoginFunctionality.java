package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_LoginFunctionality extends BaseClass{
	
	@BeforeTest
	public void setValues() 
	{
		filename = "Login";
	}
	
	
	
	
	@Test(dataProvider = "fetchData")
	public void loginFunctionality(String username, String password) 
	{
		LoginPage lp = new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();
	}

}
