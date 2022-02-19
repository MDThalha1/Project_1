package com.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_P {
	public static WebDriver driver;
	public static String Value;
	public static void ClickonElement(WebElement element) {
		element.click();
	}
	public static void InputElement(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static WebDriver getBrowser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mt\\eclipse-workspace\\Project1\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if (name.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Mt\\eclipse-workspace\\Project1\\Driver\\geckoo.exe");
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\Driver\\geckoo.exe");
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void getUrl(String name) {
		driver.get(name);

	}
	public static void getquit() {
		driver.quit();

	}
	public static String Particular_value  (String path,int row_index,int cell_index) throws Throwable {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			     Value = cell.getStringCellValue();
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			int val=(int) d;
			    Value = String.valueOf(val);
		}
		return Value;
	}
		
	}
	