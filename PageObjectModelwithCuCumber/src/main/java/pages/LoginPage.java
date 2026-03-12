package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	
	
	
	@And("Enter the Username as {string}")
	public LoginPage enterUsername(String username) 
	{
		get().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	@And("Enter the Password as {string}")
	public LoginPage enterPassword(String password) 
	{
		get().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	@When("Clicking on the Login button")
	public WelcomePage clickLoginButton() 
	{
		get().findElement(By.className("decorativeSubmit")).click();
		//LoginPage lp= new LoginPage();
		return new WelcomePage();
	}

	

}
