package org.sample;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleJunit extends BaseClass1 {

@BeforeClass
	public static void beforeClass() throws Exception 
    {
   BaseClass1 lib = new BaseClass1 ();
   lib.getDriver(null);
   lib.getUrl("https://adactinhotelapp.com/");
 
	}

@Before
	public void before()
	{
	Date date = new Date();
	System.out.println(date);
	}

@Test
    public void tc0()
    {
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("Welcome");
	String attribute = txtUserName.getAttribute("value");
	Assert.assertEquals ("Welcome", attribute);
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtUserName.sendKeys("Hijava");
	String attribute1= txtUserName.getAttribute("value");
	Assert.assertEquals ("Hijava",attribute1);
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	
    }
	}


