package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
//	[]
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driverRef)
	{
		driver.set(driverRef);
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void unload()
	{
		driver.remove();
	}
}

//
//WebDriver driver = DriverFactory.createDriver("chrome");
//DriverManager.setDriver(driver);
//
//DriverManager.getDriver()
//
//
//
//driver.findElement() -> nullPointer




