package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {
	
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;
	 

	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	public static short getColumnCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		short colcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return colcount;
	}
	
	public static String getStringCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		String data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getStringCellValue();
		} catch (Exception e) 
		{
			data = "";
		}
		wb.close();
		fi.close();		
		return data;			
	}
	
	
	public static double getNumericCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		double data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getNumericCellValue();
		} catch (Exception e) 
		{
			data = 0;
		}
		wb.close();
		fi.close();		
		return data;			
	}
	
	public static boolean getBooleanCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		boolean data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getBooleanCellValue();
		} catch (Exception e) 
		{
			data = false;
		}
		wb.close();
		fi.close();		
		return data;			
	}
	
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
	
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);		
		cell.setCellStyle(style);
		
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);		
		cell.setCellStyle(style);
		
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}

	
		public static Object[][] getTableData(String FilePath, String SheetName) throws Exception
		{   
		   Object[][] tabData=null;
		   
		   
		   try{

		       FileInputStream ExcelFile = new FileInputStream(FilePath);
		       wb = new XSSFWorkbook(ExcelFile);
		       ws = wb.getSheet(SheetName);
		       int startCol = 0;
		      
		       int ci=0,cj=0;
		       int totalRows = getRowCount(FilePath,SheetName);
		       //int totalRows=2;
		       int totalCols = getColumnCount(FilePath,SheetName,totalRows);

		       tabData=new String[totalRows][totalCols];
		     

		           for (int i=ci+1;i<=totalRows;i++,ci++)
		           {
		        	   for (int j=startCol;j<totalCols;j++,cj++)
		           {
		        	   tabData[ci][cj]=getCellData(i,j);
		               System.out.println(tabData[ci][cj]);
		               
		           }
		        	   cj=0;
		    }
		   }
		   
		   
		   //*********************************************************
		   
		   
//	       for(int i=ci+1;i<totalRows;i++,ci++) 
//	       {
//	    	   for (int j=startCol;j<=totalCols;j++,cj++)
//		           {
//	    	   tabData[i][j]= new DataFormatter().formatCellValue(ws.getRow(i).getCell(j));   
//	    	   
//			tabData[ci][cj]=getCellData(i,j);
//	        System.out.println("Test Data From Excel"+tabData[ci][cj]);
//	       }
//	       
//	  **************************************************************************     
//	       Row r=ws.getRow(totalRows);
//	       Cell c=r.getCell(totalCols);
//	       CellType celltype=c.getCellType();
//	       String data=null;
//	       switch(celltype)
//	       {
//	       case NUMERIC:
//               data  = Integer.toString((int) c.getNumericCellValue());
//             
//           case STRING:
//               data= c.getStringCellValue();
//           
//           case BOOLEAN:
//               data= String.valueOf(c.getBooleanCellValue());
//		default:
//			break;
//       }
//	       }
		   
		    catch (FileNotFoundException e)
		    {

		        System.out.println("Could not read the Excel sheet");

		        e.printStackTrace();

		    }
		    catch (IOException e)
		    {
		        System.out.println("Could not read the Excel sheet");
		        e.printStackTrace();
		    }
		    return(tabData);
		}
		
		
	
		public static String getCellData(int RowNum, int ColNum) throws Exception{

			String CellData;

			try
			{
		       cell = ws.getRow(RowNum).getCell(ColNum);
		       CellData = cell.getStringCellValue();
			}
			
		     catch (Exception e)
			{
		   	   CellData=Integer.toString((int) cell.getNumericCellValue());
		       }
		       		return CellData;  
		        }
		

			
		
		public static String getCellValueAsStringBasedOnCellType(Workbook workbook, Cell cell) {
			DataFormatter formatter = new DataFormatter();
			if (cell != null && cell.getCellType() == CellType.FORMULA) {
				FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
				return formatter.formatCellValue(cell, evaluator);
			}
			return formatter.formatCellValue(cell);
  }
		
		
		public static String getcelldata(int rownum,int colnum) throws Exception
		{
			try
			{
				cell=ws.getRow(rownum).getCell(colnum);
				String CellData=null;
				switch(cell.getCellType())
				{
				case STRING: CellData=cell.getStringCellValue();  break;
				case NUMERIC: 
					if(DateUtil.isCellDateFormatted(cell))
					{
						CellData=String.valueOf(cell.getDateCellValue());
					}
					else {
						CellData=String.valueOf((long)cell.getNumericCellValue());
					}
					
					break;
				case BOOLEAN: CellData=Boolean.toString(cell.getBooleanCellValue());   break;
				case BLANK: CellData=" "; break; 
				
				}
				
			
			return CellData;
			
		}
			catch(Exception e)
			{
				return "";
			}
	
	}
		
}

