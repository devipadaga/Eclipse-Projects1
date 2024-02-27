package aSSIGNMENTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_IntoExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		File file=new File("C:\\Users\\SPURGE\\Documents\\StarPattern.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowNum=10,columnNum=10;
		for(int i=0;i<=rowNum;i++)
		{		
		sheet.createRow(i);
		for(int j=i;j<=columnNum;j++)
		{			
		if(i==j)
		{
			sheet.getRow(i).createCell(j).setCellValue("*");		
		}
		}
		}		
		 FileOutputStream fos = new FileOutputStream(file);
		 workbook.write(fos);
		 fis.close();
		 fos.close();
			
		}
	}

