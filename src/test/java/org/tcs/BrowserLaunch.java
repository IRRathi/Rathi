package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	}
}
