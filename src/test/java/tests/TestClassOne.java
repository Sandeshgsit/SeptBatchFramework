package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassOne extends BaseTest{
	
	
	
//	@BeforeSuite
//	public void beforeSuite()
//	{
//		System.out.println("this method will execute before suite");
//	}
//	
//	@BeforeTest
//	public void beforeTest()
//	{
//		System.out.println("this method will execute before Test");
//	}
//	
//	
//	//BeforeClass -- local for that specific class
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.out.println("Will be executed before first Test of this class");
//	}
	
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("This will execute before every Test Case");
//	}
	
	@Test()
	public void testCase1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(dependsOnMethods = {"testCase1"})
	public void testCase2()
	{
		System.out.println("Test Case 2");
	}

	@Test()
	public void testCase3()
	{
		System.out.println("Test Case 3");
	}
	
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("this method will execute After suite");
//	}
//	
//	@AfterTest
//	public void afterTest()
//	{
//		System.out.println("this method will execute After Test");
//	}
//	
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("Will be executed After Last Test of this class");
//	}
//	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("This will execute After every Test Case");
//	}
}
