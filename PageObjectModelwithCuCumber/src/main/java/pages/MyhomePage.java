package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyhomePage extends BaseClass {
	
	
	
	@And("click on the leads link")
	public MyleadsPage clickLeadsLink() 
	{
		get().findElement(By.linkText("Leads")).click();
		return new MyleadsPage();
	}

}
