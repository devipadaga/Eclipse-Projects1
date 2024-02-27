import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	/*	try{
		
		File file=new File("C:\\Users\\SPURGE\\Documents\\FileTest1.txt");
		
			if(file.createNewFile())
			{
				System.out.println("File Created "+file.getName());
			}
			else
			{
				System.out.println("File already Exists");
			}
		}
		
		catch(IOException e)
		{
			System.out.println("An error occurred.....");
			e.printStackTrace();
		}
	*/	
		//*******************WRITE INTO FILE*******************************************8
		
		
	/*	File file=new File("C:\\Users\\SPURGE\\Documents\\FileTest1.txt");
		try {
			FileWriter Filewrite=new FileWriter("C:\\Users\\SPURGE\\Documents\\FileTest1.txt");
			Filewrite.write("this is new data added into the file");
			Filewrite.close();
			System.out.println("Successfully wrote into the Text File....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		
		//*******************READ THE DATA **********************************************88
/*
		File file =new File("C:\\Users\\SPURGE\\Documents\\FileTest1.txt");
		try {
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine())
			{
				String data=reader.nextLine();
				System.out.println("Successfully read from the file...");
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		//**************************************************************************8888
		
	/*	File file =new File("C:\\Users\\SPURGE\\Documents\\FileTest1.txt");
		if(file.exists())
		{
			System.out.println("Filename :"+file.getName());
			System.out.println("FilePath :"+file.getAbsolutePath());
			System.out.println("canRead :"+file.canRead());
			System.out.println("canWrite :"+file.canWrite());
			System.out.println("lengt :"+file.length());
		}
		
		else
		{
			System.out.println("File does not exists.................");
		}
	*/	
		//*****************Delete the file****************************************************
	
		File file=new File("FileTest1.txt");
		
		if(file.delete())
		{
			System.out.println("deleted the file :"+file.getName());
		}
		else
		{
			System.out.println("Failed to delete.........");
		}
		
		//  or
		
		File file1=new File("FileTest1.txt");
		boolean value=file.delete();
		
		if(value)
		{
			System.out.println("file deleted");
		}
		
		else
		{
			System.out.println("File not deleted");
		}
		
	}

}
