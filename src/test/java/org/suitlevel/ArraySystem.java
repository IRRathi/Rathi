	package org.suitlevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class ArraySystem {
	WebDriver driver;
@Test(dataProvider = "Test data")
private void tc0 (String S, String S1)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName = driver.findElement(By.id("email"));
    txtUserName.sendKeys(S1);
    WebElement pass = driver.findElement(By.id("pass"));
    pass.sendKeys(S1);
}
@DataProvider(name= "Test data")
public Object [][] getData(){
	return new Object [][] {{"java", "seleniumjava"}, 
							{"seleniumjava","javaselenium"}, 
							{"python selenium"," selenium python"},
							{"Rest assured","assured rest"}, 
							{"Appium","mobile testing"}};
}
	
}


