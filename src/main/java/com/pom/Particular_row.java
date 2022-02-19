package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_row {
	private static String Value;
	private static double d;
	public static void row() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\read.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheetAt(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < 1; i++) {
			Row r = sheet.getRow(i);
			int numberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				CellType cellType = c.getCellType();
				if (cellType.equals(CellType.STRING)) {
					Value = c.getStringCellValue();
					System.out.println(Value);
					
				} else if (cellType.equals(CellType.NUMERIC)) {
					 d = c.getNumericCellValue();
					System.out.println(d);
					
				}

				}
				
			}
		}
	public static void main(String[] args) throws Throwable {
		row();
	}
	}
