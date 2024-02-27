package variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties prop;
	private static String configpath="src\\test\\resources\\Configuration\\config.properties";
	
	
	public static void initializePropertyFile()
	{
		prop=new Properties();
		
		try
		{
			InputStream in = new FileInputStream(configpath);
			prop.load(in);
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
				
	}

}
