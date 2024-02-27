package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReadfromExcel {

	public static void main(String[] args) throws Exception {
	
//	public String[][] getData() throws Exception {
		
		File file=new File("C:\\Users\\SPURGE\\Documents\\FacebookData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("SignUPTestData");
		
	/*	String firstname=sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.print(firstname);
		
		String surname=sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.print(" "+surname);
		
		int mobilenumber=(int) sheet.getRow(2).getCell(2).getNumericCellValue();
		System.out.print(" "+mobilenumber);
		
		String newpassword=sheet.getRow(2).getCell(3).getStringCellValue();
		System.out.print(" "+newpassword);
		
		double date=sheet.getRow(2).getCell(4).getNumericCellValue();
		System.out.print(" "+date);
		
		Object month=sheet.getRow(2).getCell(5).getNumericCellValue();
		System.out.print(" "+month);
		
		
		double year=sheet.getRow(2).getCell(6).getNumericCellValue();
		System.out.print(" "+year);
	*/	
		
		int rowCount=sheet.getLastRowNum();
		System.out.println("No.of rows in excel sheet are:"+rowCount );
		
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println("No.of columns in 1st row are:"+colCount );
		
		System.out.println("---------------------------------");
		for(int i=0;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				String value=row.getCell(j).toString();
				System.out.print(" "+value+" ");
			}
			
			System.out.println();
		}
		workbook.close();
		fis.close();
	



	}

}
