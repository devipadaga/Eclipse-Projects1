package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_Excel  {

//	@Test
	@DataProvider(name = "pet_Status")
	public String[][] petStatus() throws IOException 
	{		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\DDT\\petstatus.xlsx";

		int rownum = XLUtils.getRowCount(path, "Status");
		
		int colnum = XLUtils.getCellCount(path, "Status", 1);
		
		System.out.println(rownum+","+colnum);
		
		String status[][] = new String[rownum][colnum];
		for (int i = 0; i < rownum; i++) 
		{		
			int j=colnum-1;
			
				status[i][j] = XLUtils.getCellData(path, "Status", i+1, j);
//				System.out.println(status[i][j]);
		}		
		
		return status;
	}

}
