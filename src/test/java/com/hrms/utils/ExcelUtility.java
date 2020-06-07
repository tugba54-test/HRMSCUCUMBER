package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;
	//for reusability and maintainability
	public static void openExcel(String filepath,String sheetName) {
		try {
			FileInputStream fileIs=new FileInputStream(filepath);
			book=new XSSFWorkbook(fileIs);
			sheet=book.getSheet(sheetName);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();//kac tane satir var
	}
	public static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}

	public static int colsCount(int row) {
	//	Row row=sheet.getRow(row);
		return sheet.getRow(row).getLastCellNum();
	}
	public static String cellDAta(int rowIndex,int colIndex) {//specific data almak icn 
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
		
	}
	public static Object[][] excelIntoArray(String filePath,String sheetName){
		openExcel(filePath, sheetName);
		loadSheet(sheetName);

		int rows = rowCount();
		int cols = colsCount(0);

		Object[][] data = new Object[rows - 1][cols];

		// iterating rows
		for (int i = 1; i < rows; i++) {

			// iterating cols
			for (int j = 0; j < cols; j++) {
				data[i - 1][j] = cellDAta(i, j);
			}
		}

		return data;
	}
	
	//HW Create a method that will return a List of Maps
	}

