package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class practice_DP {

	@DataProvider()
	public String[][] getData() throws Exception
	{
		File file=new File("C:\\Users\\SPURGE\\Documents\\DataSupplierfromExcel.xlsx");
		System.out.println(file.exists());
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("LoginDetails");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[rows-1][columns];
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<columns;j++)
			{
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			
			System.out.println();
		}
		
		workbook.close();
		fis.close();	
		return data;
	}
}
