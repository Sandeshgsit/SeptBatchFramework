package drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utilities.ConfigReader;

public class DriverFactory {
	
	public static WebDriver createDriver(String browserName) 
	{
//		CHROME, Chrome, chrome
		WebDriver driver = null;
		switch(browserName.toLowerCase())
		{
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				throw new IllegalArgumentException("Browsername not found");
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getInt("ImplicitWait")));
		
		return driver;
	}

}
