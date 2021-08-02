package org.tcs;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchDatasFromExcel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dropCountry = driver.findElement(By.id("countries"));
		Select select = new Select (dropCountry);
		List <WebElement> options = select.getOptions();
		File file = new File ("C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Datas\\Status details.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook (stream);
		Sheet sheet =  book.createSheet("CountryNames");
	    for (int i=0; i<options.size(); i++)
	    {
	    	String text = options.get(i).getText();
	    	System.out.println(text);
	    	Row createRow = sheet.createRow(i);
	    	Cell createCell = createRow.createCell(0);
	    	createCell.setCellValue (text);
	    }
	    FileOutputStream stream1 = new FileOutputStream (file);
	    book.write(stream1);
	    System.out.println("done!!!!!!");
	    	
	    }
	}


