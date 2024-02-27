package api.utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;


public class DataProviders {
	
	public static String path="C:\\Users\\SPURGE\\Documents\\PetStore.xlsx";

	@DataProvider(name="Data")
	public String[][] getAllData() throws IOException
	{		
		int rownum=XLUtility.getRowCount(path, "DDT");
		int colcount=XLUtility.getCellCount(path, "DDT", 1);

		String apidata[][]=new String[rownum][colcount];

		for (int i = 1; i <=rownum; i++) {
			for (int j = 0; j <colcount; j++) {
				apidata[i-1][j]=XLUtility.getCellData(path, "DDT", i, j);
			}
		}
		return apidata;
	}

	
	@DataProvider(name="UserNames")
	public String[] getUserNames() throws IOException
	{
		int rownum=XLUtility.getRowCount(path, "DDT");
		String apidata[]=new String[rownum];

		for (int i = 1; i <=rownum; i++) {
			apidata[i-1]=XLUtility.getCellData(path, "DDT", i, 1);
		}
		return apidata;
	}
}
