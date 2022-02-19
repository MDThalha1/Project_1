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

public class Read_Excel {
	public static void R() throws Throwable {
		File F=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\Excel\\read.xlsx");
		FileInputStream fi=new FileInputStream(F);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(2);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value= (int)numericCellValue;
			System.out.println(value);
			
		} 
	}
	public static void main(String[] args) throws Throwable {
		R();

}
}