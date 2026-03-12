package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	
	
		
		@Then("It should navigate to home page")
		public void successfulLogin() 
		{
			System.out.println("It should navigate to home page");
		}
		
		@But("it should throws error")
		public void unSuccessfulLogin() 
		{
			System.out.println("It should throws error");
		}
		
		
		
	
       @When("Click on the crmsfa link")	
       public MyhomePage clickCrmsfalink() 
      {
	  get().findElement(By.linkText("CRM/SFA")).click();
	  return new MyhomePage();
     }
}
