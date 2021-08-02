package org.tcs;

import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.SampleJunit;

public class Adactin extends SampleJunit{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Welcome");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtUserName.sendKeys("Hijava");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

}
