package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{
	
	
    @When("Enter the companayname as (.*)$")
	public CreateLeadPage enterCompanyName(String companyName) 
	{
		get().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
    @And("Enter the firstname as (.*)$")
	public CreateLeadPage enterfirstName(String firstname) 
	{
		get().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	
    
    @And("Enter the lastname as (.*)$")
	public CreateLeadPage enterlastName(String lastname) 
	{
		get().findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
    
	@When("Click on the CreateLead button")
	public ViewLeadsPage clickCreateLeadButton() 
	{
		get().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}
}
