package tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassTwo extends BaseTest{
	
	@BeforeGroups("Regression")
	public void beforeRegression()
	{
		System.out.println("This will execute before first test case of regression group");
	}
	
	@Test(groups = "Regression")
	public void testCase1()
	{
		System.out.println("Regression suite - test case one executed");
	}
	
	@Test(groups = { "Regression", "Sanity" })
	public void testcase2()
	{
		System.out.println("Test case 2 executed");
	}
	
	@AfterGroups("Regression")
	public void afterRegression()
	{
		System.out.println("This will execute After Last test case of regression group");
	}
	
	
	
	
	
}
