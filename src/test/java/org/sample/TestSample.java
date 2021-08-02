package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSample {

	@BeforeClass
		private void beforeclass()
		{
		System.out.println("Before Class");
	}
	@AfterClass
	private void afterclass()
	{
	System.out.println("After Class");
    }
	@BeforeMethod
	private void beforeMethod()
	{
	System.out.println("Before Method");
    }
	@AfterMethod
	private void afterMethod()
	{
	System.out.println("After Method");
    }
	@Test (priority= -2)
	private void tc0()
	{
		System.out.println("Test1");
	}
	
	@Test
	private void tc01()
	{
		System.out.println("Test2");
	}
	@Test
	private void tc02()
	{
		System.out.println("Test3");
	}
	
}
