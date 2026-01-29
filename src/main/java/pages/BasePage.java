package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import drivers.DriverManager;    

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void type(WebElement ele, String text)
	{
//		driver.findElement(ele).clear();
//		driver.findElement(ele).sendKeys(text);
		
		
		ele.clear();
		ele.sendKeys(text);
	}
	
	public void click(WebElement ele)
	{
//		driver.findElement(ele).click();
		
		ele.click();
	}
	
}
