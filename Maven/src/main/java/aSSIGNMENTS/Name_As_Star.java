package aSSIGNMENTS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Name_As_Star {
	
	private static FileInputStream fi;
	private static XSSFWorkbook wb;
	private static XSSFSheet ws;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static FileOutputStream fo;


	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.createCell(colnum); 
		cell.setCellValue(data);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();		
	}
	

	public static void main(String[] args) throws IOException {
		
		String s="TirumalaDevi";
		//char[] chars={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int k=0;
		s=s.toLowerCase();
		int l=s.length();
		
		for(int i=0;i<=s.length();i++)
		{
			char c = s.charAt(i);
			if((c>='a'&&c<='z'))
			
				Name_As_Star.setCellData("C:\\Users\\SPURGE\\Documents\\StarPattern.xlsx", "Name",l , k,"c");
		}
	}
		
	
}


