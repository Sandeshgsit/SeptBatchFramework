package tests;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.LoginPage;
import utilities.ExcelUtil;

public class LoginTest extends BaseTest{
	
	
	
	
	@Test()
	public void performLogin() 
	{
		LoginPage loginpage = new LoginPage(DriverManager.getDriver());
		loginpage.enterUsername("Automation123@gmail.com");
		loginpage.enterPassword("Admin@123");
		loginpage.clickLogin();
		
		String pageTitle = loginpage.getLoginTitle();
//		System.out.println(pageTitle);
		
		Assert.assertEquals(pageTitle, "Automation Exercise");	
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] getData()
	{
		Object[][] obj = {
				{"Automation123@gmail.com", "Admin@123"},
				{"NormalUser@gmail.com", "Password"}
		};
		return obj;
	}
	
	
	@Test(dataProvider = "LoginData")
	public void PerformLoginWithData(String Username, String Password)
	{
		LoginPage loginpage = new LoginPage(DriverManager.getDriver());
		loginpage.enterUsername(Username);
		loginpage.enterPassword(Password);
		loginpage.clickLogin();
		
		String pageTitle = loginpage.getLoginTitle();
		
		Assert.assertEquals(pageTitle, "Automation Exercise");	
	}
	

	
	
	@DataProvider(name = "loginWithExcel")
	public Object[][] getDataExcel()
	{
		List<Map<String, String>> data = ExcelUtil.getData("src/test/resources/testdata/TestData.xlsx","Sheet1");
		
		Object[][] result = new Object[data.size()][1];
		
		for(int i = 0;i<data.size();i++)
		{
			result[i][0] =  data.get(i);
		}
		return result;		
	}
	
	
	@Test(dataProvider = "loginWithExcel")
	public void testLoginWithExcel(Map<String, String> testData)
	{
//		System.out.println(testData.get("username"));
//		System.out.println(testData.get("password"));
		
		
		LoginPage loginpage = new LoginPage(DriverManager.getDriver());
		loginpage.enterUsername(testData.get("username"));
		loginpage.enterPassword(testData.get("password"));
		loginpage.clickLogin();
		
		String pageTitle = loginpage.getLoginTitle();
		
		Assert.assertEquals(pageTitle, "Automation Exercise");	
		
		
	}
	
	
	
	
}
