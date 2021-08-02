package org.suitlevel;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample 
{
@Parameters({"username","password"})
@Test
//private void tc0(String s, String s1)
private void tc0(@Optional("StringJavaa")String s, String s1)
{
	System.out.println(s);
	System.out.println(s1);
}
@Test
private void tc01()
{
	System.out.println("test 2");
}
@Test
private void tc02()
{
	System.out.println("test 3");
}
@Test
private void tc03()
{
	System.out.println("test 4");
}
}
