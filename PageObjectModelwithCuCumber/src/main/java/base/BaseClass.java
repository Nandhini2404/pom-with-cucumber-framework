package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcelData;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	// if we use static key word here then the reference will be shared across.
	// but with the help of static we cant achive parallel execution it will throw error! so we use constructor to achive parallel exectuion
	
	//public static ChromeDriver driver;
	
	//public static ChromeDriver driver;
	
	private static final ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();
	
	public void set() 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver.set(new ChromeDriver(opt));
	}
	
	public ChromeDriver get() 
	{
		ChromeDriver chromedriver = driver.get();
		return chromedriver;
	}
	
	
	public String filename;
	
	
	
	@BeforeMethod
	public void preConditions() 
	{
		
		set();
		//driver = new ChromeDriver(opt);
		get().manage().window().maximize();
		get().get("http://leaftaps.com/opentaps/.");
		
		
		
	
	}	
	
	@AfterMethod
	public void postConditions() 
	{
		get().close();
	}
	
	@DataProvider(name = "fetchData")
    public String[][] sendData() throws IOException {
        // ReadExcel is your utility class
        String[][] readData = ReadExcelData.readData(filename);
        return readData;
 }
	
}

