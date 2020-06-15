package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
//	public static void loadSheet(String sheetName) {
//		sheet = book.getSheet(sheetName);
//	}

	public static int colsCount() {
	//	Row row=sheet.getRow(row);
		return sheet.getRow(0).getLastCellNum();
	}
	public static String cellData(int rowIndex,int colIndex) {//specific data almak icn 
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
		
	}
//	public static Object[][] excelIntoArray(String filePath,String sheetName){
//		openExcel(filePath, sheetName);
//		//loadSheet(sheetName);
//
//		int rows = rowCount();
//		int cols = colsCount(0);
//
//		Object[][] data = new Object[rows - 1][cols];
//
//		// iterating rows
//		for (int i = 1; i < rows; i++) {
//
//			// iterating cols
//			for (int j = 0; j < cols; j++) {
//				data[i - 1][j] = cellData(i, j);
//			}
//		}
//
//		return data;
//	}
	
	public static List<Map<String,String>> excelIntoListOfMaps(String filepath,String sheetName){
		openExcel(filepath, sheetName);
		
		List<Map<String,String>>list=new ArrayList<Map<String,String>>();
		for(int i=1;i<rowCount();i++) {
			Map<String,String>Excelmap=new LinkedHashMap<>();
			for(int c=0;c<colsCount();c++) {
				Excelmap.put(cellData(0,c), cellData(i,c));
			}
			list.add(Excelmap);
		}
		return list;
	}
	
	//without header
	public static List<ArrayList<String>> excelIntoListOfList(String filepath,String sheetName){
		openExcel(filepath, sheetName);
		 
		List<ArrayList<String>>dataL=new ArrayList<ArrayList<String>>();
		for(int i=0;i<rowCount();i++) {
			ArrayList<String>list=new ArrayList<String>();
			for(int c=0;c<colsCount();c++) {
				list.add(cellData(i,c));
			}
			dataL.add(list);
		}
		return dataL;
	}
	}

