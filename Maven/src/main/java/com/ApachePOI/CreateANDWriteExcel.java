package com.ApachePOI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateANDWriteExcel {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook=new  XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("HELLO");
		sheet.getRow(0).createCell(1).setCellValue("WORLD");
		
		sheet.getRow(1);
		sheet.getRow(1).createCell(0).setCellValue("WELCOME");
		sheet.getRow(1).createCell(1).setCellValue("HERE");
		
		File file=new File("C:\\Users\\SPURGE\\eclipse-workspace\\ApachePOI\\ExcelFiles\\Test.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		

	}

}
