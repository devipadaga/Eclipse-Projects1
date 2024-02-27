package ApachePOI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CREATEANDWRITEEXCEL {

	public static void main(String[] args) throws IOException, OpenXML4JException{
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\SPURGE\\eclipse-workspace\\ApachePOI\\ExcelFiles\\Test.xlsx");
		XSSFWorkbook workbook=new  XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Test");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("HELLO");
		sheet.getRow(1).createCell(1).setCellValue("WORLD");
		
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("WELCOME");
		sheet.getRow(2).createCell(1).setCellValue("HERE");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		

	}

}
