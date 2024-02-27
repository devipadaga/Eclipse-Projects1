package aSSIGNMENTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Table_in_Excel {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\SPURGE\\Documents\\StarPattern.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Table");
		
		
		 Map<String, Object[]> empinfo = new TreeMap<String, Object[]>();
	      empinfo.put("1", new Object[] {
	         "EMP ID","EMP NAME","DESIGNATION"});
	      
	      empinfo.put("2", new Object[] {
	         "tp01","Gopal","Technical Manager"});
	      
	      empinfo.put("3", new Object[] {
	         "tp02","Manisha","Proof Reader"});
	      
	      empinfo.put("4", new Object[] {
	         "tp03","Masthan","Technical Writer"});
	      
	      empinfo.put("5", new Object[] {
	         "tp04","Satish","Technical Writer"});
	      
	      empinfo.put("6", new Object[] {
	         "tp05","Krishna","Technical Writer"});

	      //Iterate over data and write to sheet
	      Set<String>keyid=empinfo.keySet();
	      int rowid = 0;
	      
	      for(String key:keyid){
	        XSSFRow row=sheet.createRow(rowid++);
	         Object[] objectArr=empinfo.get(key);
	         int cellid=0;
	         
	         for(Object obj:objectArr){
	           XSSFCell cell=row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	         }
	      }
	      //Write the workbook in file system
	      FileOutputStream fo=new FileOutputStream(file);	      
	      workbook.write(fo);
	      fo.close();
	}
}
