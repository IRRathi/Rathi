package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintNumericValues {

	public static void main(String[] args) throws IOException {
	File file = new File ("C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Datas\\Status details.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
	for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++)
	{
		Row row = sheet.getRow(i);
	for(int j=0; j<row.getPhysicalNumberOfCells(); j++)
	{
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		if(cellType == 1)
		{
			String ss = cell.getStringCellValue();
			System.out.println(ss);
		}
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			System.out.println(l);
		}
	}
	}
	}
    }
