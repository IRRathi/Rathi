package org.sample;

import org.junit.Assert;
import org.junit.Test;

public class AssertsProgram {

@Test
public void tc10()
{
	String s = "ABCD";
	System.out.println("Method 10");
	Assert.assertEquals (s, "ABCD");
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
}

@Test
public void tc05()
{
	System.out.println("Method 5");
}
@Test
public void tc02()
{
	System.out.println("Method 2");
}

}
