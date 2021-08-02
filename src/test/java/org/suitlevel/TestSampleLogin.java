package org.suitlevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSampleLogin {
	WebDriver driver;
	@Parameters({"username"})
	@Test
	private void tc0 (@Optional("Stringjava") String S, String S1)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtuserName = driver.findElement(By.id("email"));
		txtuserName.sendKeys(S);
		}
	
	@Parameters ({"password"})
	@Test
	private void tc01 (String S1)
	{
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(S1);
	}

}
