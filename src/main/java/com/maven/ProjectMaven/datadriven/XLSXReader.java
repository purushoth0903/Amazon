package com.maven.ProjectMaven.datadriven;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;

public class XLSXReader {
	static String value;
	 public static String particularData(String sheet,int row,int cell) throws IOException {
		File f = new File("C:\\Users\\purushoth\\Desktop\\ipt.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s1 = w.getSheet(sheet);
		Row r = s1.getRow(row);
		Cell c = r.getCell(cell);
		CellType ce = c.getCellType();
		if (ce.equals(CellType.STRING)) {
			value = c.getStringCellValue();
			

		} else if (ce.equals(CellType.NUMERIC)) {
			double dd = c.getNumericCellValue();
			int a = (int) dd;
		value =	Integer.toString(a);
			

		}
		return value;
	}
	
	private static void allData() throws IOException {
		File f = new File("C:\\Users\\purushoth\\eclipse-workspace\\ProjectMaven\\excel\\ipt.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s1 = w.getSheet("sheet1");
		int row = s1.getPhysicalNumberOfRows();
		for (int i = 0; i < row; i++) {
			Row row2 = s1.getRow(i);
			int cell = row2.getPhysicalNumberOfCells();
			for (int j = 0; j < cell; j++) {
				Cell cell2 = row2.getCell(j);
				CellType ce = cell2.getCellType();
				if (ce.equals(CellType.STRING)) {
					String stringCellValue = cell2.getStringCellValue();
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		

	}
	
}
