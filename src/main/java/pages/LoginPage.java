package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverManager;

public class LoginPage extends BasePage{
	
//	WebDriver driver;
	
//	WebElement userNameText = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
//	WebElement passwordText = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
	
//	By userNameText = By.xpath("//input[@data-qa='login-email']");
//	By passwordText = By.xpath("//input[@data-qa='login-password']");
//	By loginButton = By.xpath("//button[@data-qa='login-button']");
	
	@FindBy(xpath = "//input[@data-qa='login-email']") 
	WebElement userNameText;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	WebElement passwordText;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
//		this.driver = driver;
	}
	
	
	public void enterUsername(String userName)
	{
//		driver.findElement(userNameText).sendKeys(userName);
		
//		userNameText.sendKeys(userName);
		
		type(userNameText,userName);
	}
	
	public void enterPassword(String password)
	{
//		driver.findElement(passwordText).sendKeys(password);
		
//		passwordText.sendKeys(password);
		
		type(passwordText,password);
	}
	
	
	public void clickLogin()
	{
//		driver.findElement(loginButton).click();
		
		click(loginButton);
	}
	
	
	public String getLoginTitle()
	{
		return driver.getTitle();
	}

}
