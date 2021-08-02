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

public class CreateSheet {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Rathi.ir\\eclipse-workspace\\MavenLearning\\Datas\\Status details.xlsx");
		FileInputStream stream = new FileInputStream(file);
		 Workbook book = new XSSFWorkbook (stream);
		 Sheet createsheet = book.createSheet("Rathi");
		 Row createrow = createsheet.createRow (2);
		 Cell createCell = createrow. createCell (2);
		 createCell.setCellValue("Welcome Java");
		 FileOutputStream stream1 = new FileOutputStream (file);
		 book.write(stream1);

	}

}
