package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExistingValue {

	public static void main(String[] args) throws IOException {
		{
			File file = new File ("C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Datas\\Status details.xlsx");
			FileInputStream stream = new FileInputStream(file);
			 Workbook book = new XSSFWorkbook (stream);
			 Sheet sheet = book.getSheet("sheet1");
			 Row row = sheet.getRow(3);
			 Cell cell = row.getCell(0);
			 String ss = cell.getStringCellValue();
			 System.out.println(ss);
			 if (ss.equals("CSC"))
			 {
				 cell.setCellValue("Vinayagar");
			 }
			 FileOutputStream stream1 = new FileOutputStream(file);
			 book.write(stream1);
		} 
	}
	}
	

