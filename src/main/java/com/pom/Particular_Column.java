package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Column {
	public static void column() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\read.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet s = wb.getSheetAt(0);
		int numberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row r = s.getRow(i);
			System.out.println(r);
			Cell cell= r.getCell(0);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String Value = cell.getStringCellValue();
					System.out.println(Value);
					}
				else if (cellType.equals(CellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					int value=(int)d;
					System.out.println(value);
					
				}
					}	
				}
	public static void main(String[] args) throws Throwable {
		column();
	}
		
		
	}
