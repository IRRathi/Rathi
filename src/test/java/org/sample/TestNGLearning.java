package org.sample;

import org.testng.annotations.Test;

public class TestNGLearning {
	
	@Test(priority=5)
	private void tc0()
	{
		System.out.println("Test 1");
	}
	@Test(invocationCount = 10)
	private void  tc01()
	{
		System.out.println("Test 2");
	}
	@Test(priority=1)
	private void tc02()
	{
		System.out.println("Test 3");
	}
	@Test(priority=-3, enabled=false)
	private void tc03()
	{
		System.out.println("Test 4");
	}
	@Test(priority=-10)
	private void tc04()
	{
		System.out.println("Test 5");
	}

}
