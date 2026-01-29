package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import drivers.DriverFactory;
import drivers.DriverManager;
import utilities.ConfigReader;

public class BaseTest {
	
	@Parameters("browserName")   //Configuration
	@BeforeMethod
	public void setUp( @Optional("chrome") String browser)
	{
		WebDriver driver = DriverFactory.createDriver(browser);
		DriverManager.setDriver(driver);
		driver.get(ConfigReader.get("base.url"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
			WebDriver driver = DriverManager.getDriver();
			driver.quit();
			DriverManager.unload();
	}

}
