package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderfromExcel {

	@DataProvider()
	public String[][] getData() throws Exception {
		
		File file=new File("C:\\Users\\SPURGE\\Documents\\DataSupplierfromExcel.xlsx");
		System.out.println(file.exists());
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("LoginDetails");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());      // bcoz last index is 3 (4 rows means(0-3))
		
		
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("No.of rows in excel sheet are:"+rows );
		int columns=sheet.getRow(0).getLastCellNum();
		System.out.println("No.of columns in 1st row are:"+columns );
		
		// 1. here v are using 2D array bcoz excel itself is a 2D array(rows &columns). V are using string array ,
		   	// but v can use Object array also.
		// 2. here v dont need headings that's y v gave (rows-1)
		String[][] data=new String[rows-1][columns];
		
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<columns;j++)
			{
			
			//1.dataformatter is a spl method that converts any kind of data to string type
			// 2.v can write below 2 lines  or a last single sysout line.there v should specify the datatype.but in 
			//	    dataformatter it converts any kind to string.
				
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			//	System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
		
		return data;
	
		
	}

}
