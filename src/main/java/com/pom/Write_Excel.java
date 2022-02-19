package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	public static void write() throws Throwable {
		File f=new File("C:\\Users\\Mt\\Desktop\\Write_Excel.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		wb.createSheet("Thalha").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("Thalha").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("Thalha").createRow(1).createCell(0).setCellValue("Abu");
		wb.getSheet("Thalha").getRow(1).createCell(1).setCellValue(98);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Data Created");

	}
	public static void main(String[] args) throws Throwable {
		write();
	}

}
