package com.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws Exception {
	
		File file=new File("C:\\Users\\SPURGE\\Documents\\test2.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		String FirstCellValue_1stRow=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(FirstCellValue_1stRow);
		
		String SecondCellValue_1stRow=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.print(" "+SecondCellValue_1stRow);
		
		String FirstCellValue_2stRow=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.print(FirstCellValue_2stRow);
		
		String SecondCellValue_2stRow=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.print(" "+SecondCellValue_2stRow);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			int cellCount=row.getPhysicalNumberOfCells();
			
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell=row.getCell(j);
			}
			
		}
		workbook.close();
		fis.close();

	}

	
}
